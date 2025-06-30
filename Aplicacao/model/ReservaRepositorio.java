package model;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class ReservaRepositorio {
    private static Database database;
    private static Dao<Reserva, Integer> daoReserva;

    public ReservaRepositorio(Database database) {
        ReservaRepositorio.setDatabase(database);
    }

    public static void setDatabase(Database database) {
        ReservaRepositorio.database = database;
        try {
            daoReserva = DaoManager.createDao(database.getConnection(), Reserva.class);
            TableUtils.createTableIfNotExists(database.getConnection(), Reserva.class);
        } catch (SQLException e) {
            System.err.println("Erro ao configurar o banco de dados para Reservas: " + e.getMessage());
        }
    }

    public Reserva create(Reserva reserva) throws SQLException {
        int nrows = daoReserva.create(reserva);
        if (nrows == 0) {
            throw new SQLException("Erro: Reserva não salva");
        }
        return reserva;
    }

    public Reserva update(Reserva reserva) throws SQLException {
        int nrows = daoReserva.update(reserva);
        if (nrows == 0) {
            throw new SQLException("Erro: Reserva não atualizada");
        }
        return reserva;
    }

    public void delete(Reserva reserva) throws SQLException {
        daoReserva.delete(reserva);
    }

    public Reserva loadFromId(int id) throws SQLException {
        return daoReserva.queryForId(id);
    }

    public List<Reserva> loadAll() throws SQLException {
        return daoReserva.queryForAll();
    }

    public boolean verificarDisponibilidade(Date dataHora, String tipoQuadra, String localizacaoQuadra) throws SQLException {
        QueryBuilder<Reserva, Integer> queryBuilder = daoReserva.queryBuilder();
        queryBuilder.where()
                    .eq("dataHoraReserva", dataHora)
                    .and()
                    .eq("tipoQuadra", tipoQuadra)
                    .and()
                    .eq("localizacaoQuadra", localizacaoQuadra)
                    .and()
                    .ne("status", "Cancelada");

        long count = queryBuilder.countOf();
        return count == 0;
    }

    public List<Reserva> buscarReservasPorLocatario(Locatario locatario) throws SQLException {
        QueryBuilder<Reserva, Integer> queryBuilder = daoReserva.queryBuilder();
        queryBuilder.where().eq("locatario_id", locatario.getId());
        return queryBuilder.query();
    }
}

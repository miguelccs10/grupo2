package model;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

public class ReservaRepositorio {

    private Dao<Reserva, Integer> dao;

    public ReservaRepositorio(Database database) {
        try {
            dao = DaoManager.createDao(database.getConnection(), Reserva.class);
            TableUtils.createTableIfNotExists(database.getConnection(), Reserva.class);
        } catch (SQLException e) {
            System.err.println("Erro ao criar DAO de Reserva: " + e.getMessage());
        }
    }

    public void create(Reserva reserva) throws SQLException {
        dao.create(reserva);
    }

    /**
     * Verifica se já existe uma reserva para uma quadra específica em uma data e hora.
     * @return true se estiver disponível, false se já estiver reservada.
     */
    public boolean verificarDisponibilidade(Quadra quadra, LocalDate data, LocalTime hora) throws SQLException {
        // Converte a data e hora para o formato que está no banco de dados (java.util.Date)
        Date dataHoraParaVerificar = Date.from(data.atTime(hora).atZone(ZoneId.systemDefault()).toInstant());

        Reserva reservaExistente = dao.queryBuilder().where()
                .eq("quadra_id", quadra.getId())
                .and()
                .eq("dataHora", dataHoraParaVerificar)
                .queryForFirst();

        return reservaExistente == null; // Se for nulo, está disponível
    }

    public List<Reserva> buscarPorLocatario(Locatario locatario) throws SQLException {
        return dao.queryForEq("locatario_id", locatario.getId());
    }

    public void cancelar(Reserva reserva) throws SQLException {
        dao.delete(reserva);
    }
}
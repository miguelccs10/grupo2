package model;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;
import java.util.List;

public class QuadraRepositorio {

    private Dao<Quadra, Integer> dao;

    public QuadraRepositorio(Database database) {
        try {
            dao = DaoManager.createDao(database.getConnection(), Quadra.class);
            TableUtils.createTableIfNotExists(database.getConnection(), Quadra.class);
        } catch (SQLException e) {
            System.err.println("Erro ao criar DAO de Quadra: " + e.getMessage());
        }
    }

    //Salva uma nova quadra no banco de dados. 
    public void create(Quadra quadra) throws SQLException {
        dao.create(quadra);
    }

    //Busca todas as quadras pertencentes a um locador específico.
    //Usado no dashboard do locador.
    public List<Quadra> buscarPorLocador(Locador locador) throws SQLException {
        return dao.queryForEq("locador_id", locador.getId());
    }

    //Busca todas as quadras cadastradas no sistema, de todos os locadores.
    //Usado no dashboard do locatário para ele ver todas as opções disponíveis.
    public List<Quadra> buscarTodas() throws SQLException {
        return dao.queryForAll();
    }
}
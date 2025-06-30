package model;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;

public class UsuarioRepositorio {

    private Dao<Locador, Integer> locadorDao;
    private Dao<Locatario, Integer> locatarioDao;

    public UsuarioRepositorio(Database database) {
        try {
            // Inicializa os DAOs para Locador e Locatario
            locadorDao = DaoManager.createDao(database.getConnection(), Locador.class);
            locatarioDao = DaoManager.createDao(database.getConnection(), Locatario.class);

            // Cria as tabelas no banco de dados se elas não existirem
            TableUtils.createTableIfNotExists(database.getConnection(), Locador.class);
            TableUtils.createTableIfNotExists(database.getConnection(), Locatario.class);
        } catch (SQLException e) {
            System.err.println("Erro ao inicializar repositório de usuários: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Salva um novo usuário (Locador ou Locatario) no banco de dados.
     */
    public void create(Usuario usuario) throws SQLException {
        if (usuario instanceof Locador) {
            locadorDao.create((Locador) usuario);
        } else if (usuario instanceof Locatario) {
            locatarioDao.create((Locatario) usuario);
        }
    }

    /**
     * Autentica um usuário pelo número e senha.
     * @return O objeto Usuario (Locador ou Locatario) se a autenticação for bem-sucedida, ou null caso contrário.
     */
    public Usuario autenticar(String numero, String senha) throws SQLException {
        // Tenta encontrar um locador com o número e senha correspondentes
        Locador locador = locadorDao.queryBuilder().where()
                .eq("numero", numero).and().eq("senha", senha)
                .queryForFirst();
        
        if (locador != null) {
            return locador; // Se encontrou um locador, retorna ele
        }

        // Se não encontrou um locador, tenta encontrar um locatário
        Locatario locatario = locatarioDao.queryBuilder().where()
                .eq("numero", numero).and().eq("senha", senha)
                .queryForFirst();
        
        return locatario; // Retorna o locatário (ou null se não encontrou)
    }
}
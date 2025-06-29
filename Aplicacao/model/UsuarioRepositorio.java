package model;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class UsuarioRepositorio {
    private static Database database;
    private static Dao<Usuario, Integer> daoUsuario;
    private static Dao<Locador, Integer> daoLocador;
    private static Dao<Locatario, Integer> daoLocatario;
    
    public UsuarioRepositorio(Database database) {
        UsuarioRepositorio.setDatabase(database);
    }

    public static void setDatabase(Database database) {
        UsuarioRepositorio.database = database;
        try {
            // Criar DAOs para cada entidade
            daoUsuario = DaoManager.createDao(database.getConnection(), Usuario.class);
            daoLocador = DaoManager.createDao(database.getConnection(), Locador.class);
            daoLocatario = DaoManager.createDao(database.getConnection(), Locatario.class);
            
            // Criar tabelas se não existirem
            TableUtils.createTableIfNotExists(database.getConnection(), Usuario.class);
            TableUtils.createTableIfNotExists(database.getConnection(), Locador.class);
            TableUtils.createTableIfNotExists(database.getConnection(), Locatario.class);
        } catch (SQLException e) {
            System.err.println("Erro ao configurar o banco de dados: " + e.getMessage());
        }
    }

    public Usuario create(Usuario usuario) throws SQLException {
        if (usuario instanceof Locador) {
            daoLocador.create((Locador) usuario);
            return usuario;
        } else if (usuario instanceof Locatario) {
            daoLocatario.create((Locatario) usuario);
            return usuario;
        } else {
            daoUsuario.create(usuario);
            return usuario;
        }
    }

    // Método para buscar usuário por número (CPF/telefone)
    public Usuario buscarPorNumero(String numero) throws SQLException {
        // Buscar em usuários comuns
        QueryBuilder<Usuario, Integer> usuarioQB = daoUsuario.queryBuilder();
        usuarioQB.where().eq("numero", numero);
        Usuario usuario = usuarioQB.queryForFirst();
        
        if (usuario != null) return usuario;
        
        // Buscar em locadores
        QueryBuilder<Locador, Integer> locadorQB = daoLocador.queryBuilder();
        locadorQB.where().eq("numero", numero);
        usuario = locadorQB.queryForFirst();
        
        if (usuario != null) return usuario;
        
        // Buscar em locatários
        QueryBuilder<Locatario, Integer> locatarioQB = daoLocatario.queryBuilder();
        locatarioQB.where().eq("numero", numero);
        return locatarioQB.queryForFirst();
    }
    
    // Método para autenticação
    public boolean autenticar(String numero, String senha) {
        try {
            Usuario usuario = buscarPorNumero(numero);
            return usuario != null && usuario.getSenha().equals(senha);
        } catch (SQLException e) {
            System.err.println("Erro na autenticação: " + e.getMessage());
            return false;
        }
    }
}
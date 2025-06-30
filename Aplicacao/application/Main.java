package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Database;
import model.UsuarioRepositorio;
import model.ReservaRepositorio;

public class Main extends Application {
    
    private static Database database;
    private static UsuarioRepositorio usuarioRepositorio;
    private static ReservaRepositorio reservaRepositorio;

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Inicializar banco de dados
        database = new Database("quadras.db");
        usuarioRepositorio = new UsuarioRepositorio(database);
        reservaRepositorio = new ReservaRepositorio(database);
        
        Parent root = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
        primaryStage.setTitle("Sistema de Aluguel de Quadras");
        primaryStage.setScene(new Scene(root));
        primaryStage.setMinWidth(600);
        primaryStage.setMinHeight(450);
        primaryStage.show();
    }

    @Override
    public void stop() {
        // Fechar conexão ao sair
        if (database != null) {
            database.close();
        }
    }
    
    public static Database getDatabase() {
        return database;
    }
    
    public static UsuarioRepositorio getUsuarioRepositorio() {
        return usuarioRepositorio;
    }

    public static ReservaRepositorio getReservaRepositorio() { 
            return reservaRepositorio;
        }

    public static void main(String[] args) {
        launch(args);
    }
}
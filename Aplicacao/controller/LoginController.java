package controller;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Locador;
import model.Locatario;
import model.Usuario;
import model.UsuarioRepositorio;

import java.io.IOException;

public class LoginController {

    @FXML private TextField txtNumero;
    @FXML private PasswordField txtSenha;

    private final UsuarioRepositorio repositorio = Main.getUsuarioRepositorio();

    @FXML
    private void handleLogin() {
        String numero = txtNumero.getText();
        String senha = txtSenha.getText();

        try {
            Usuario usuario = repositorio.autenticar(numero, senha);
            if (usuario != null) {
                abrirDashboard(usuario);
            } else {
                mostrarAlerta("Erro de Login", "Usuário ou senha inválidos.");
            }
        } catch (Exception e) {
            mostrarAlerta("Erro de Banco de Dados", "Ocorreu um erro ao tentar autenticar: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Método para o botão "Cadastre-se"
    @FXML
    private void abrirTelaCadastro() throws IOException {
        Stage stage = (Stage) txtNumero.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/view/Cadastro.fxml"));
        stage.setScene(new Scene(root));
    }

    private void abrirDashboard(Usuario usuario) throws IOException {
        FXMLLoader loader;
        Stage stage = (Stage) txtNumero.getScene().getWindow();

        if (usuario instanceof Locador) {
            loader = new FXMLLoader(getClass().getResource("/view/DashboardLocador.fxml"));
            Parent root = loader.load();
            DashboardLocadorController controller = loader.getController();
            controller.setLocador((Locador) usuario);
            stage.setScene(new Scene(root));
        } else if (usuario instanceof Locatario) {
            loader = new FXMLLoader(getClass().getResource("/view/DashboardLocatario.fxml"));
            Parent root = loader.load();
            DashboardLocatarioController controller = loader.getController();
            controller.setUsuario((Locatario) usuario);
            stage.setScene(new Scene(root));
        }
    }

    private void mostrarAlerta(String titulo, String mensagem) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }
}
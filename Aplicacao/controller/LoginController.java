package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import java.io.IOException;
import model.Usuario;
import model.Locador;
import model.Locatario;
import model.UsuarioRepositorio;
import application.Main;

public class LoginController {

    @FXML private TextField txtNumero;
    @FXML private PasswordField txtSenha;
    
    private UsuarioRepositorio repositorio = Main.getUsuarioRepositorio();

    @FXML
    private void handleLogin() throws IOException {
        String numero = txtNumero.getText().trim();
        String senha = txtSenha.getText();
        
        if (numero.isEmpty() || senha.isEmpty()) {
            mostrarErro("Preencha todos os campos!");
            return;
        }
        
        if (repositorio.autenticar(numero, senha)) {
            abrirDashboard(numero);
        } else {
            mostrarErro("Credenciais inválidas!");
        }
    }

    @FXML
    private void handleCadastro() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/view/Cadastro.fxml"));
        Stage stage = (Stage) txtNumero.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
    
    private void abrirDashboard(String numeroUsuario) throws IOException {
        try {
            Usuario usuario = repositorio.buscarPorNumero(numeroUsuario);
            FXMLLoader loader;
            
            if (usuario instanceof Locador) {
                loader = new FXMLLoader(getClass().getResource("/view/DashboardLocador.fxml"));
                Parent root = loader.load();
                DashboardLocadorController controller = loader.getController();
                controller.setUsuario(usuario.getNome(), "Locador");
                
                Stage stage = (Stage) txtNumero.getScene().getWindow();
                stage.setScene(new Scene(root));
            } else if (usuario instanceof Locatario) {
                loader = new FXMLLoader(getClass().getResource("/view/DashboardLocatario.fxml"));
                Parent root = loader.load();
                DashboardLocatarioController controller = loader.getController();
                controller.setUsuario(usuario.getNome(), "Locatário");
                
                Stage stage = (Stage) txtNumero.getScene().getWindow();
                stage.setScene(new Scene(root));
            } else {
                 mostrarErro("Tipo de usuário desconhecido.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            mostrarErro("Erro ao carregar o dashboard: " + e.getMessage());
        }
    }

    private void mostrarErro(String mensagem) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Erro de Login");
        alert.setHeaderText(null);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }
}
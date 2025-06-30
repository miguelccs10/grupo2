package controller;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import model.Locador;
import model.Locatario;
import model.UsuarioRepositorio;
import java.io.IOException;

public class CadastroController {

    @FXML private TextField txtNumero;
    @FXML private TextField txtNome;
    @FXML private PasswordField txtSenha;
    @FXML private TextField txtTelefone;
    @FXML private RadioButton rbLocador;
    
    private final UsuarioRepositorio repositorio = Main.getUsuarioRepositorio();

    @FXML
    private void handleCadastrar() {
        if (!validarCampos()) return;

        try {
            if (rbLocador.isSelected()) {
                Locador locador = new Locador(txtNumero.getText(), txtNome.getText(), txtSenha.getText(), txtTelefone.getText());
                repositorio.create(locador);
            } else { // Locatário
                Locatario locatario = new Locatario(txtNumero.getText(), txtNome.getText(), txtSenha.getText(), txtTelefone.getText());
                repositorio.create(locatario);
            }
            mostrarAlerta(Alert.AlertType.INFORMATION, "Sucesso", "Usuário cadastrado com sucesso!");
            voltarParaLogin();
        } catch (Exception e) {
            mostrarAlerta(Alert.AlertType.ERROR, "Erro", "Não foi possível cadastrar: " + e.getMessage());
        }
    }
    
    // ## MÉTODO ADICIONADO PARA CORRIGIR O ERRO ##
    @FXML
    private void handleCancelar() throws IOException {
        voltarParaLogin();
    }

    private boolean validarCampos() {
        if (txtNumero.getText().isEmpty() || txtNome.getText().isEmpty() || txtSenha.getText().isEmpty() || txtTelefone.getText().isEmpty()) {
            mostrarAlerta(Alert.AlertType.WARNING, "Atenção", "Todos os campos são obrigatórios.");
            return false;
        }
        return true;
    }

    private void voltarParaLogin() throws IOException {
        Stage stage = (Stage) txtNumero.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
        stage.setScene(new Scene(root));
    }

    private void mostrarAlerta(Alert.AlertType tipo, String titulo, String msg) {
        Alert alert = new Alert(tipo);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(msg);
        alert.showAndWait();
    }
}
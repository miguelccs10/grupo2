package controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Locador;
import model.Locatario;
import model.UsuarioRepositorio;
import application.Main;
import java.io.IOException;
import java.sql.SQLException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class CadastroController {

    @FXML private RadioButton rbLocador;
    @FXML private RadioButton rbLocatario;
    @FXML private TextField txtNumero;
    @FXML private TextField txtNome;
    @FXML private TextField txtTelefone;
    @FXML private PasswordField txtSenha;
    @FXML private VBox paneLocatario;
    @FXML private TextField txtLocalizacao;
    @FXML private ComboBox<String> cbTipoQuadra;
    @FXML private TextArea txtHorarios;
    @FXML private Button btnCadastrar;
    
    private UsuarioRepositorio repositorio = Main.getUsuarioRepositorio();

    @FXML
    private void initialize() {
        cbTipoQuadra.getItems().addAll("Futebol", "Tênis", "Vôlei", "Basquete", "Poliesportiva");
        
        rbLocatario.selectedProperty().addListener((obs, oldVal, newVal) -> {
            paneLocatario.setVisible(newVal);
        });
    }

    @FXML
    private void handleCadastrar() {
        if (validarCampos()) {
            try {
                if (rbLocador.isSelected()) {
                    cadastrarLocador();
                } else {
                    cadastrarLocatario();
                }
                mostrarSucesso();
                fecharTela();
            } catch (Exception e) {
                mostrarErro("Erro ao cadastrar usuário: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    @FXML
    private void handleCancelar() throws IOException {
        fecharTela();
    }

    private boolean validarCampos() {
        if (txtNumero.getText().isEmpty() || txtNome.getText().isEmpty() || txtSenha.getText().isEmpty()) {
            mostrarErro("Campos 'Número', 'Nome' e 'Senha' são obrigatórios!");
            return false;
        }
        
        if (rbLocatario.isSelected()) {
            if (txtLocalizacao.getText().isEmpty() || cbTipoQuadra.getValue() == null) {
                mostrarErro("Para locatário, 'Localização' e 'Tipo de Quadra' são obrigatórios!");
                return false;
            }
        }
        return true;
    }

    private void cadastrarLocador() throws SQLException {
        Locador locador = new Locador(
            txtNumero.getText(),
            txtNome.getText(),
            txtSenha.getText(),
            txtTelefone.getText()
        );
        repositorio.create(locador);
    }

    private void cadastrarLocatario() throws SQLException {
        Locatario locatario = new Locatario(
            txtNumero.getText(),
            txtNome.getText(),
            txtSenha.getText(),
            txtTelefone.getText(),
            txtLocalizacao.getText(),
            cbTipoQuadra.getValue(),
            txtHorarios.getText()
        );
        repositorio.create(locatario);
    }

    private void mostrarErro(String mensagem) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Erro no Cadastro");
        alert.setHeaderText(null);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }

    private void mostrarSucesso() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Cadastro Concluído");
        alert.setHeaderText(null);
        alert.setContentText("Usuário cadastrado com sucesso!");
        alert.showAndWait();
    }
    
    private void fecharTela() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
        Stage stage = (Stage) btnCadastrar.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
}
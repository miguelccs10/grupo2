package controller;

import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.Locador;
import model.Quadra;
import model.QuadraRepositorio;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class DashboardLocadorController {

    @FXML private Label lblUsuario;
    @FXML private TableView<Quadra> tabelaQuadras;
    @FXML private TableColumn<Quadra, String> colNome;
    @FXML private TableColumn<Quadra, String> colTipo;
    @FXML private TableColumn<Quadra, String> colLocalizacao;

    private Locador locadorLogado;
    private QuadraRepositorio quadraRepositorio;

    public void setLocador(Locador locador) {
        this.locadorLogado = locador;
        this.quadraRepositorio = new QuadraRepositorio(Main.getDatabase());
        lblUsuario.setText("Bem-vindo, " + locador.getNome());
        atualizarTabelaQuadras();
    }
    
    @FXML
    private void initialize() {
        colNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        colTipo.setCellValueFactory(new PropertyValueFactory<>("tipo"));
        colLocalizacao.setCellValueFactory(new PropertyValueFactory<>("localizacao"));
    }

    @FXML
    private void handleNovaQuadra() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/CadastroQuadra.fxml"));
            Parent root = loader.load();

            CadastroQuadraController controller = loader.getController();
            controller.setLocador(locadorLogado);
            controller.setDashboardController(this);

            Stage stage = new Stage();
            stage.setTitle("Cadastrar Nova Quadra");
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(new Scene(root));
            stage.showAndWait();

        } catch (IOException e) {
            mostrarAlerta(Alert.AlertType.ERROR,"Erro de Interface", "Não foi possível abrir a tela de cadastro de quadra.");
            e.printStackTrace();
        }
    }

    // ## MÉTODO ADICIONADO PARA CORRIGIR O ERRO ##
    /**
     * Este método é chamado pelo botão "Atualizar" no FXML e simplesmente
     * executa a atualização da tabela.
     */
    @FXML
    private void handleAtualizar() {
        atualizarTabelaQuadras();
    }

    public void atualizarTabelaQuadras() {
        try {
            List<Quadra> quadrasDoLocador = quadraRepositorio.buscarPorLocador(locadorLogado);
            ObservableList<Quadra> quadrasObservable = FXCollections.observableArrayList(quadrasDoLocador);
            tabelaQuadras.setItems(quadrasObservable);
        } catch (SQLException e) {
            mostrarAlerta(Alert.AlertType.ERROR, "Erro de Banco de Dados", "Erro ao carregar as quadras: " + e.getMessage());
        }
    }

    @FXML
    private void handleSair() throws IOException {
        Stage stage = (Stage) lblUsuario.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
        stage.setScene(new Scene(root));
    }

    private void mostrarAlerta(Alert.AlertType tipo, String titulo, String mensagem) {
        Alert alert = new Alert(tipo);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }
}
package controller;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Locador;
import model.Quadra;
import model.QuadraRepositorio;

public class CadastroQuadraController {

    @FXML private TextField txtNome;
    @FXML private TextField txtTipo;
    @FXML private TextField txtLocalizacao;

    private Locador locador;
    private QuadraRepositorio quadraRepositorio;
    private DashboardLocadorController dashboardController;

    public void setLocador(Locador locador) {
        this.locador = locador;
    }
    
    public void setDashboardController(DashboardLocadorController controller) {
        this.dashboardController = controller;
    }

    @FXML
    private void initialize() {
        this.quadraRepositorio = new QuadraRepositorio(Main.getDatabase());
    }

    @FXML
    private void handleSalvar() {
        if (txtNome.getText().isEmpty() || txtTipo.getText().isEmpty() || txtLocalizacao.getText().isEmpty()) {
            mostrarAlerta(Alert.AlertType.WARNING, "Atenção", "Todos os campos são obrigatórios.");
            return;
        }

        Quadra quadra = new Quadra(
            txtNome.getText(),
            txtTipo.getText(),
            txtLocalizacao.getText(),
            this.locador
        );

        try {
            quadraRepositorio.create(quadra);
            mostrarAlerta(Alert.AlertType.INFORMATION, "Sucesso", "Quadra cadastrada com sucesso!");
            
            // Atualiza a tabela no dashboard e fecha a janela
            dashboardController.atualizarTabelaQuadras();
            fecharJanela();

        } catch (Exception e) {
            mostrarAlerta(Alert.AlertType.ERROR, "Erro", "Não foi possível salvar a quadra: " + e.getMessage());
        }
    }

    @FXML
    private void handleCancelar() {
        fecharJanela();
    }

    private void fecharJanela() {
        Stage stage = (Stage) txtNome.getScene().getWindow();
        stage.close();
    }

    private void mostrarAlerta(Alert.AlertType tipo, String titulo, String msg) {
        Alert alert = new Alert(tipo);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(msg);
        alert.showAndWait();
    }
}
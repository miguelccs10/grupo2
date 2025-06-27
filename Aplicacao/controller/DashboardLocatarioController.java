package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class DashboardLocatarioController {

    @FXML private Label lblUsuario;
    @FXML private Label lblTipoUsuario;
    @FXML private VBox containerQuadras;

    private String usuarioLogado;
    private String tipoUsuario;

    public void setUsuario(String nome, String tipo) {
        this.usuarioLogado = nome;
        this.tipoUsuario = tipo;
        atualizarDadosUsuario();
        carregarQuadras();
    }

    private void atualizarDadosUsuario() {
        lblUsuario.setText(usuarioLogado);
        lblTipoUsuario.setText(tipoUsuario);
    }

    private void carregarQuadras() {
        // Simulação de quadras
        containerQuadras.getChildren().clear();
        adicionarQuadraFicticia("Quadra Central", "Futebol", "Seg-Sex: 18h-22h");
        adicionarQuadraFicticia("Quadra do Condomínio", "Poliesportiva", "Sáb-Dom: 8h-18h");
    }

    private void adicionarQuadraFicticia(String nome, String tipo, String horarios) {
        // Implementação simplificada para demonstração
        Label quadraInfo = new Label(nome + " - " + tipo + " | " + horarios);
        containerQuadras.getChildren().add(quadraInfo);
    }

    @FXML
    private void handleSair() {
        voltarParaLogin();
    }

    @FXML
    private void handleNovaQuadra() {
        abrirFormularioNovaQuadra();
    }

    private void voltarParaLogin() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
            Stage stage = (Stage) lblUsuario.getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void abrirFormularioNovaQuadra() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/NovaQuadra.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Nova Quadra");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
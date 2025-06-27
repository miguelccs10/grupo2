package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class DashboardLocadorController {

    @FXML private Label lblUsuario;
    @FXML private Label lblTipoUsuario;
    @FXML private TableView<?> tabelaQuadras;

    private String usuarioLogado;
    private String tipoUsuario;

    public void setUsuario(String nome, String tipo) {
        this.usuarioLogado = nome;
        this.tipoUsuario = tipo;
        atualizarDadosUsuario();
    }

    private void atualizarDadosUsuario() {
        lblUsuario.setText(usuarioLogado);
        lblTipoUsuario.setText(tipoUsuario);
    }

    @FXML
    private void handleSair() {
        voltarParaLogin();
    }

    @FXML
    private void handleAtualizar() {
        System.out.println("Atualizando quadras...");
        // Lógica para atualizar a tabela
    }

    @FXML
    private void handleAlugar() {
        System.out.println("Alugando quadra...");
        // Lógica para alugar quadra selecionada
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
}
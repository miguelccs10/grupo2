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
import javafx.stage.Stage;
import model.*;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class DashboardLocatarioController {

    @FXML private Label lblUsuario;
    @FXML private TableView<Quadra> tabelaQuadras;
    @FXML private TableColumn<Quadra, String> colNome;
    @FXML private TableColumn<Quadra, String> colTipo;
    @FXML private TableColumn<Quadra, String> colLocalizacao;
    @FXML private TableColumn<Quadra, String> colLocador;

    private Locatario locatarioLogado;
    private QuadraRepositorio quadraRepositorio;
    private ReservaRepositorio reservaRepositorio;

    /*
     Recebe o locatário que fez login e inicializa o painel.
    */
    public void setUsuario(Locatario locatario) {
        this.locatarioLogado = locatario;
        lblUsuario.setText("Bem-vindo, " + locatario.getNome());
    }

    /*
     É chamado automaticamente ao carregar o FXML.
     Inicializa os repositórios e configura a tabela.
    */
    @FXML
    private void initialize() {
        this.quadraRepositorio = new QuadraRepositorio(Main.getDatabase());
        this.reservaRepositorio = new ReservaRepositorio(Main.getDatabase());

        // Configura como cada coluna vai obter seu valor do objeto Quadra
        colNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        colTipo.setCellValueFactory(new PropertyValueFactory<>("tipo"));
        colLocalizacao.setCellValueFactory(new PropertyValueFactory<>("localizacao"));
        colLocador.setCellValueFactory(new PropertyValueFactory<>("locador"));

        carregarTodasAsQuadras();
    }

    /*
     Carrega todas as quadras cadastradas no sistema e as exibe na tabela.
    */
    private void carregarTodasAsQuadras() {
        try {
            List<Quadra> todasAsQuadras = quadraRepositorio.buscarTodas();
            ObservableList<Quadra> quadrasObservable = FXCollections.observableArrayList(todasAsQuadras);
            tabelaQuadras.setItems(quadrasObservable);
        } catch (SQLException e) {
            mostrarAlerta(Alert.AlertType.ERROR,"Erro de Banco de Dados", "Erro ao carregar as quadras disponíveis: " + e.getMessage());
        }
    }

    /*
     Manipula o clique no botão "Alugar".
    */
    @FXML
    private void handleAlugar() {
        Quadra quadraSelecionada = tabelaQuadras.getSelectionModel().getSelectedItem();
        if (quadraSelecionada == null) {
            mostrarAlerta(Alert.AlertType.WARNING, "Atenção", "Por favor, selecione uma quadra na tabela para alugar.");
            return;
        }

        // Para simplificar, vamos usar a data e hora atuais como exemplo.
        LocalDate dataDesejada = LocalDate.now().plusDays(1); // Ex: amanhã
        LocalTime horaDesejada = LocalTime.of(19, 0); // Ex: 19:00

        try {
            // 1. Verifica se a quadra está disponível no horário desejado
            boolean disponivel = reservaRepositorio.verificarDisponibilidade(quadraSelecionada, dataDesejada, horaDesejada);

            if (disponivel) {
                // 2. Se estiver disponível, cria e salva a reserva
                Reserva novaReserva = new Reserva(quadraSelecionada, locatarioLogado, dataDesejada, horaDesejada);
                reservaRepositorio.create(novaReserva);

                mostrarAlerta(Alert.AlertType.INFORMATION, "Sucesso!", "Quadra '" + quadraSelecionada.getNome() + "' reservada com sucesso para " + dataDesejada + " às " + horaDesejada + "h.");
            } else {
                // 3. Se não estiver, informa o usuário
                mostrarAlerta(Alert.AlertType.WARNING, "Horário Indisponível", "A quadra já está reservada neste horário. Por favor, escolha outra data ou hora.");
            }
        } catch (SQLException e) {
            mostrarAlerta(Alert.AlertType.ERROR, "Erro de Banco de Dados", "Ocorreu um erro ao tentar fazer a reserva: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /*
     Manipula o clique no botão "Sair", retornando para a tela de login.
    */
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
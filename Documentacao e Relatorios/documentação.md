# Sistema de Locação de Quadras Esportivas

> Projeto que implementa um sistema de gerenciamento de aluguel de quadras esportivas, desenvolvido em Java com os princípios da Programação Orientada a Objetos (POO). Utiliza o framework ORMLite para persistência de dados em um banco SQLite e JavaFX para a interface gráfica, seguindo o padrão Model-View-Controller (MVC).

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java"/>
  <img src="https://img.shields.io/badge/JavaFX-007396?style=for-the-badge&logo=java&logoColor=white" alt="JavaFX"/>
  <img src="https://img.shields.io/badge/SQLite-003B57?style=for-the-badge&logo=sqlite&logoColor=white" alt="SQLite"/>
  <img src="https://img.shields.io/badge/ORMLite-DB2A3F?style=for-the-badge" alt="ORMLite"/>
  <img src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white" alt="Maven"/>
</p>

---

## Índice

1.  [Introdução](#1-introdução)
2.  [Funcionalidades](#2-funcionalidades)
3.  [Tecnologias Utilizadas](#3-tecnologias-utilizadas)
4.  [Requisitos](#4-requisitos)
5.  [Conceitos de POO Aplicados](#5-conceitos-de-poo-aplicados)
6.  [Arquitetura e Implementação das Classes](#6-arquitetura-e-implementação-das-classes)
7.  [Fluxos Principais (Diagramas de Sequência)](#7-fluxos-principais-diagramas-de-sequência)
8.  [Diagramas UML (Detalhes)](#8-diagramas-uml-detalhes)
9.  [Como Usar](#9-como-usar)
10. [Fluxo de Navegação](#10-fluxo-de-navegação)
11. [Testes e Processo de Desenvolvimento](#11-testes-e-processo-de-desenvolvimento)
12. [Conclusão](#12-conclusão)
13. [Próximos Passos](#13-próximos-passos)

---

## 1. Introdução

Este projeto implementa um sistema de gerenciamento de aluguel de quadras esportivas, desenvolvido em Java com os princípios da Programação Orientada a Objetos (POO). Utiliza o framework ORMLite para persistência de dados em um banco SQLite e JavaFX para a interface gráfica, seguindo o padrão Model-View-Controller (MVC). O sistema permite que locadores cadastrem quadras e consultem reservas, enquanto locatários podem buscar quadras disponíveis, realizar agendamentos e cancelar reservas.

---

## 2. Funcionalidades

### 2.1. Funcionalidades Principais

* **Cadastro de Usuários:** Permitir o registro de Locadores e Locatários com informações básicas (número, nome, senha, telefone) e, para locatários, dados temporários de quadra.
* **Autenticação de Usuários:** Validar o acesso via login e senha.
* **Visualização de Quadras:** Exibir quadras cadastradas (para Locadores) e disponíveis (para Locatários, com dados fictícios).
* **Cadastro de Quadras Esportivas:** Funcionalidade em desenvolvimento.
* **Consulta de Disponibilidade:** Funcionalidade em desenvolvimento.
* **Gestão de Reservas:** Realização e cancelamento de reservas (em desenvolvimento).

### 2.2. Diagrama de Casos de Uso

Este diagrama ilustra as interações principais entre os atores (`Locador`, `Locatário`, `Sistema`) e o sistema de aluguel de quadras esportivas, destacando as funcionalidades disponíveis e as que estão em desenvolvimento.

* **Atores:**
    * **Locador:** Usuário que cadastra e gerencia quadras, e consulta reservas.
    * **Locatário:** Usuário que busca, agenda e cancela reservas de quadras.
    * **Sistema:** Responsável por validações automáticas, como autenticação, validação de dados e verificação de disponibilidade.
* **Casos de Uso Principais:**
    * **Fazer Login:** Permite a autenticação de ambos os tipos de usuário, estendendo-se para "Validar Credenciais".
    * **Cadastrar Usuário:** Permite o registro de novos locadores e locatários, estendendo-se para "Validar Dados".
    * **Visualizar Quadras Disponíveis:** Funcionalidade para locatários visualizarem as quadras.
* **Casos de Uso "Em Desenvolvimento" (Planejados ou Parcialmente Implementados):**
    * Cadastrar Quadra
    * Consultar Reservas
    * Realizar Reserva
    * Cancelar Reserva
* **Extensões:**
    * **Validar Credenciais:** Verificação de login.
    * **Validar Dados:** Validação de campos obrigatórios no cadastro.
    * **Verificar Disponibilidade:** Verificação de horários para reservas.

 ![Diagrama UML](https://www.plantuml.com/plantuml/png/bP51JWCn34NtEOMNi2W7G5LLgOKL6ufWRoPkQp69AoSPeTw60t2ANeoC55Lj4nQpcyZ_VN_FNuQ86fFhJVXYVq151qwyT7iLHn0raJ7OHL5uaGwjwCKheopb_SOXaaDZYWncimNSFUEHHksE_Rqv8_NicbgXnH0L5Tv3ElraeeBRagR7QqAhU3iM7r8VytX3WNJ0KAtuu92mv-FP8i2Qmq7ywNSWhlKRAkhYsCZiE-el1URg9y33k3MRsAnPALdo7MFU18ymdzDt96yN2zEu_HfTevLRg4fN45BUSeTQJkDF7ZqitU2cr3iUqivOASvHgjc_Eutn4WcKT_i8icsL2F3am58WFqW_i2CVnP2tC98rNxKypQ4kTI9VEf_0B_DdSlqV)
>

---

## 3. Tecnologias Utilizadas

| Tecnologia | Finalidade |
| :--------- | :--------- |
| **Java** | Linguagem de programação principal. |
| **JavaFX** | Framework para a construção da interface gráfica (GUI). |
| **SQLite** | Banco de dados relacional embarcado para persistência local. |
| **ORMLite** | Framework de Mapeamento Objeto-Relacional para simplificar o acesso ao banco. |
| **Maven** | Ferramenta de gerenciamento de dependências e build do projeto. |
| **PlantUML** | Ferramenta para criação de diagramas UML a partir de texto. |
| **BlueJ** | IDE utilizada em parte do desenvolvimento. |

---

## 4. Requisitos

### 4.1. Requisitos Funcionais

-   [x] **Cadastro de usuários:** Permitir o registro de Locadores e Locatários com informações básicas (número, nome, senha, telefone) e, para locatários, dados temporários de quadra.
-   [x] **Autenticação de usuários:** Validar o acesso via login e senha.
-   [x] **Visualização de quadras:** Exibir quadras cadastradas (para Locadores) e disponíveis (para Locatários).
-   [ ] **Cadastro de quadras esportivas:** Funcionalidade em desenvolvimento.
-   [ ] **Consulta de disponibilidade:** Funcionalidade em desenvolvimento.
-   [ ] **Gestão de reservas:** Realização e cancelamento de reservas (em desenvolvimento).

### 4.2. Requisitos Não Funcionais

-   **Modularidade:** Código modular e reutilizável, seguindo o padrão MVC.
-   **POO:** Aplicação dos princípios de encapsulamento, herança, polimorfismo e abstração.
-   **Persistência:** Os dados devem ser armazenados de forma persistente com SQLite e ORMLite.
-   **Interface:** A interface gráfica deve ser intuitiva, construída com JavaFX.
-   **Documentação:** O projeto deve possuir uma documentação clara e organizada.

---

## 5. Conceitos de POO Aplicados

| Conceito | Aplicação no Projeto |
| :------- | :------------------- |
| **Encapsulamento** | Atributos privados com acesso via getters/setters. |
| **Herança** | `Locador` e `Locatario` herdam de `Usuario`. |
| **Polimorfismo** | `UsuarioRepositorio` manipula `Locador` e `Locatario` via a interface de `Usuario`. |
| **Abstração** | `Usuario` define a estrutura comum para todos os usuários. |

---

## 6. Arquitetura e Implementação das Classes

O projeto segue o padrão de arquitetura Model-View-Controller (MVC), com as seguintes divisões lógicas e de diretórios:

### **6.1. Estrutura de Diretórios**

A organização do projeto é dividida nas seguintes pastas principais:

* `application`: Contém a classe principal (`Main.java`) que inicia a aplicação.
* `model`: Contém as classes de dados e lógica de negócio (Model).
* `view`: Contém os arquivos FXML que definem a interface do usuário (View).
* `controller`: Contém as classes que gerenciam a interação entre Model e View (Controller).

### **6.2. Implementação do Model (Com Foco em Herança e Interação)**

O pacote `model` contém as classes que representam as entidades de dados e a lógica de negócio do sistema.

* **`Usuario.java`**: Classe base que representa usuários, mapeada para a tabela `usuarios` com atributos `id`, `numero`, `nome` e `senha`.
    ```java
    // Trecho de Usuario.java
    @DatabaseTable(tableName = "usuarios")
    public class Usuario {
        @DatabaseField(generatedId = true)
        private int id;
        @DatabaseField(dataType = DataType.STRING, canBeNull = false)
        private String numero;
        @DatabaseField(dataType = DataType.STRING, canBeNull = false)
        public String nome;
        @DatabaseField(dataType = DataType.STRING, canBeNull = false)
        private String senha;
        // ... construtores, getters e setters
    }
    ```
* **`Locador.java` e `Locatario.java` (Herança)**: Estas classes herdam de `Usuario`, reutilizando os atributos e comportamentos básicos de um usuário e adicionando propriedades específicas.
    * **`Locador`**: Representa um proprietário de quadra, adicionando um `telefone`.
    * **`Locatario`**: Representa um usuário que aluga quadras, adicionando `telefone` e atributos temporários (`localizacaoQuadra`, `tipoQuadra`, `horariosDisponiveis`) que deverão ser realocados para outras entidades como `Quadra` ou `Horario` em futuras versões.
    ```java
    // Trecho de Locador.java
    @DatabaseTable(tableName = "locadores")
    public class Locador extends Usuario {
        @DatabaseField(dataType = DataType.STRING)
        private String telefone;
        // ... construtores, getters e setters
    }

    // Trecho de Locatario.java
    @DatabaseTable(tableName = "locatarios")
    public class Locatario extends Usuario {
        @DatabaseField(dataType = DataType.STRING)
        private String telefone;
        // ... atributos temporários e seus métodos
        // ... construtores, getters e setters
    }
    ```
* **`Database.java` (Interação)**: Gerencia a conexão com o banco de dados SQLite usando a biblioteca ORMLite. É uma classe singleton implícita, fornecendo uma conexão que é utilizada por todos os repositórios.
    ```java
    // Trecho de Database.java
    public class Database {
        private ConnectionSource connectionSource;
        public Database(String databaseName) {
            try {
                connectionSource = new JdbcConnectionSource("jdbc:sqlite:" + databaseName);
            } catch (SQLException e) {
                System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            }
        }
        public ConnectionSource getConnection() {
            return connectionSource;
        }
        public void close() {
            if (connectionSource != null) {
                try {
                    connectionSource.close();
                } catch (IOException e) {
                    System.err.println("Erro ao fechar conexão com o banco de dados: " + e.getMessage());
                }
            }
        }
    }
    ```
* **Repositórios (`UsuarioRepositorio`, `QuadraRepositorio`, `ReservaRepositorio`) (Interação)**:
    * Estas classes atuam como a camada de acesso a dados (DAO - Data Access Object) para suas respectivas entidades.
    * Eles interagem diretamente com a instância de `Database` para obter a conexão e realizar operações CRUD (Create, Read, Update, Delete) nas tabelas do banco de dados.
    * Por exemplo, o `UsuarioRepositorio` inicializa DAOs específicos para `Locador` e `Locatario` e os utiliza para persistir e buscar usuários.
    ```java
    // Trecho de UsuarioRepositorio.java (Interação com Database e Locador/Locatario)
    public class UsuarioRepositorio {
        private Dao<Locador, Integer> locadorDao;
        private Dao<Locatario, Integer> locatarioDao;

        public UsuarioRepositorio(Database database) {
            try {
                locadorDao = DaoManager.createDao(database.getConnection(), Locador.class);
                locatarioDao = DaoManager.createDao(database.getConnection(), Locatario.class);
                TableUtils.createTableIfNotExists(database.getConnection(), Locador.class);
                TableUtils.createTableIfNotExists(database.getConnection(), Locatario.class);
            } catch (SQLException e) { /* ... */ }
        }

        public void create(Usuario usuario) throws SQLException {
            if (usuario instanceof Locador) {
                locadorDao.create((Locador) usuario);
            } else if (usuario instanceof Locatario) {
                locatarioDao.create((Locatario) usuario);
            }
        }
        // ... método autenticar que interage com locadorDao e locatarioDao
    }
    ```
* **`Quadra.java` e `Reserva.java` (Interação)**:
    * **`Quadra`**: Possui uma associação com `Locador` (uma quadra pertence a um locador), indicando a propriedade.
    * **`Reserva`**: Possui associações com `Quadra` (qual quadra foi reservada) e `Locatario` (quem fez a reserva), formando a base do agendamento.
    ```java
    // Trecho de Quadra.java (Associação com Locador)
    @DatabaseTable(tableName = "quadras")
    public class Quadra {
        // ... atributos
        @DatabaseField(foreign = true, foreignAutoRefresh = true, canBeNull = false)
        private Locador locador; // Relacionamento N:1 com Locador
        // ... construtores, getters e setters
    }

    // Trecho de Reserva.java (Associação com Quadra e Locatario)
    @DatabaseTable(tableName = "reservas")
    public class Reserva {
        // ... atributos
        @DatabaseField(foreign = true, foreignAutoRefresh = true, canBeNull = false)
        private Quadra quadra; // Relacionamento N:1 com Quadra
        @DatabaseField(foreign = true, foreignAutoRefresh = true, canBeNull = false)
        private Locatario locatario; // Relacionamento N:1 com Locatario
        // ... construtores, getters e setters
    }
    ```

### **6.3. Implementação do Controller (Com Foco na Interação com Model e View)**

Os controladores são a ponte entre a interface do usuário (View) e a lógica de negócio (Model), manipulando eventos da UI e atualizando a View com dados do Model.

* **`Main.java`**: Ponto de entrada da aplicação JavaFX. Inicializa o banco de dados e os repositórios (`UsuarioRepositorio`, `ReservaRepositorio`) e carrega a tela de login inicial.
* **`CadastroController.java`**: Gerencia a tela de cadastro de novos usuários, coletando e validando dados, e persistindo-os via `UsuarioRepositorio`. Possui validação condicional de campos para locatários.
* **`CadastroQuadraController.java`**: Gerencia o cadastro de novas quadras por um `Locador`, validando e salvando os dados via `QuadraRepositorio`.
* **`DashboardLocadorController.java`**: Controla a interface principal do Locador, exibindo suas quadras, permitindo acesso ao cadastro de novas quadras e a opção de sair. As funcionalidades de atualização e aluguel são placeholders.
* **`DashboardLocatarioController.java`**: Controla a interface principal do Locatário, exibindo todas as quadras disponíveis e permitindo a tentativa de aluguel (reserva). Exibe quadras fictícias em um `VBox`.
* **`LoginController.java` (Interação)**:
    * **View para Controller**: Captura `numero` e `senha` dos `TextField` e `PasswordField`.
    * **Controller para Model**: Chama `UsuarioRepositorio.autenticar(numero, senha)` para verificar as credenciais.
    * **Model para Controller**: Recebe um objeto `Usuario` (ou `null`) do `UsuarioRepositorio`.
    * **Controller para View**: Redireciona para o `DashboardLocador.fxml` ou `DashboardLocatario.fxml` dependendo do tipo de `Usuario` autenticado, passando o objeto de usuário para o controlador do dashboard via método `setLocador()` ou `setUsuario()`.
    ```java
    // Trecho de LoginController.java (Interação com UsuarioRepositorio e Dashboards)
    @FXML
    private void handleLogin() {
        String numero = txtNumero.getText();
        String senha = txtSenha.getText();
        try {
            Usuario usuario = repositorio.autenticar(numero, senha); // Interação com Model
            if (usuario != null) {
                abrirDashboard(usuario); // Redirecionamento para outra View/Controller
            } else { /* ... */ }
        } catch (Exception e) { /* ... */ }
    }

    private void abrirDashboard(Usuario usuario) throws IOException {
        FXMLLoader loader;
        Stage stage = (Stage) txtNumero.getScene().getWindow();
        if (usuario instanceof Locador) {
            loader = new FXMLLoader(getClass().getResource("/view/DashboardLocador.fxml"));
            Parent root = loader.load();
            DashboardLocadorController controller = loader.getController();
            controller.setLocador((Locador) usuario); // Injeção de dados
            stage.setScene(new Scene(root));
        } else if (usuario instanceof Locatario) {
            // ... similar para Locatario
        }
    }
    ```
* **`DashboardLocadorController.java` (Interação)**:
    * **Controller para Model**: Utiliza `QuadraRepositorio.buscarPorLocador(locadorLogado)` para carregar as quadras do locador.
    * **Model para Controller**: Recebe uma `List<Quadra>` do repositório.
    * **Controller para View**: Atualiza a `TableView` com os dados das quadras.
    * **Inter-Controller**: Abre a tela de `CadastroQuadra.fxml` via `FXMLLoader`, passando a si mesmo (`this`) e o `locadorLogado` para o `CadastroQuadraController` para que este possa notificar o dashboard após o cadastro.
    ```java
    // Trecho de DashboardLocadorController.java (Interação com QuadraRepositorio e CadastroQuadraController)
    public void setLocador(Locador locador) {
        this.locadorLogado = locador;
        this.quadraRepositorio = new QuadraRepositorio(Main.getDatabase());
        lblUsuario.setText("Bem-vindo, " + locador.getNome());
        atualizarTabelaQuadras(); // Chama método para interagir com o Model e atualizar a View
    }

    public void atualizarTabelaQuadras() {
        try {
            List<Quadra> quadrasDoLocador = quadraRepositorio.buscarPorLocador(locadorLogado); // Interação com Model
            ObservableList<Quadra> quadrasObservable = FXCollections.observableArrayList(quadrasDoLocador);
            tabelaQuadras.setItems(quadrasObservable); // Atualiza a View
        } catch (SQLException e) { /* ... */ }
    }

    @FXML
    private void handleNovaQuadra() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/CadastroQuadra.fxml"));
            Parent root = loader.load();
            CadastroQuadraController controller = loader.getController();
            controller.setLocador(locadorLogado); // Passa dados para outro Controller
            controller.setDashboardController(this); // Passa referência para callback
            // ... exibir nova janela
        } catch (IOException e) { /* ... */ }
    }
    ```

### **6.4. Implementação da View**

A interface do usuário é construída com JavaFX, utilizando arquivos FXML para definir o layout das telas.

* **Telas Implementadas:**
    * Tela de Login (`Login.fxml`).
    * Tela de Cadastro de Usuário (`Cadastro.fxml`).
    * Tela do Locador (`DashboardLocador.fxml`).
    * Dashboard do Locatário (`DashboardLocatario.fxml`).
    * Tela de Cadastro de Nova Quadra (`CadastroQuadra.fxml`).
* **Componentes JavaFX Utilizados:**
    * `TableView` (para listagem de dados).
    * `ComboBox` (para seleção).
    * `RadioButton` (para seleção de tipo de usuário).
    * `VBox` (para contêineres e layouts).
    * `Label` (para exibição de texto).
    * `Alert` (para feedback ao usuário: Erro, Sucesso, Informação).
* **Controladores:** 4 controladores implementados.
* **Telas FXML:** 4 telas FXML implementadas.
* **Total de Componentes:** 15+ componentes JavaFX utilizados.
* **Alertas:** 3 tipos de alertas (Erro, Sucesso, Informação).

### **6.5. Padrões de Implementação**

* **Visibilidade Condicional:** Campos específicos para locatários (localização, tipo de quadra, horários) são exibidos dinamicamente no `CadastroController` com base na seleção do tipo de usuário.
* **Injeção de Dados:** Dados do usuário (nome, tipo) são passados entre controladores (ex.: de `LoginController` para `DashboardLocadorController`) via métodos públicos.
* **Navegação Unidirecional:** Todas as telas retornam à tela de login via botão "Sair".
* **Ações Mapeadas:** Eventos (ex.: cliques em botões) são declarados no FXML e implementados nos controladores Java.
* **Validações:** Verificação de campos obrigatórios no `LoginController` e validação condicional no `CadastroController` para campos específicos de locatários.

## **7. Fluxos Principais (Diagramas de Sequência)**

### **7.1. Diagrama de Sequência da Operação de Reserva**

Este diagrama detalha o fluxo de interação para a operação de reserva de quadras, focando na perspectiva do `Locatário`. Ele ilustra as mensagens trocadas entre o `Locatario`, o `LoginController`, o `DashboardLocatarioController`, o `UsuarioRepositorio`, o `Database`, e as classes `Quadra`, `Reserva` e `Horario`. O diagrama aborda o processo de autenticação, a busca e exibição de quadras disponíveis, a seleção de uma quadra e a tentativa de criação de uma reserva, inclusive com o tratamento para credenciais inválidas. Ele reflete o fluxo planejado, notando que a funcionalidade completa de reserva (com `Quadra`, `Reserva` e `Horario` totalmente implementadas nesse contexto de fluxo) ainda está em desenvolvimento.

![Diagrama UML](https://www.plantuml.com/plantuml/png/dLMnRXin3Dtr5KIc173ItKCHm6dH0bcQeDtf4nqBrOakgNFxEq67Jls1hlwnIdVMrP5Zkyd6anwV7laetRL6bDYrtkXN5rOes4BBWPkbS4iGfIDZi8aiSCiD9h1Zas3HDMw58SBPz9OVN9XnYCBUavm1AbHhLSODwdBEA7QahDAF06gkpzhb_JjQiRh8AUmPzfVtD4ISerAFBXyLvbE7Lh17366rVqTAiXu0GrmZFh1WaRIDZHcBWiktTQUcy34e2K7O_6b960YKmX9DXSkf-pLE0Rj88Gb0EGzT9fWC-HTc7vqvIkLJ-4BY5YaH6Y5BeN7er9Hjk3nmtXsb8208QUSZMdxsdEVgpAFrPe5UoQ2FCFjtAgmtZzvPL0EmN_RHuPZ234Ne0S4Mb8636OLnN9x2knzkJl2jTrl1EbrnsFnUayjYHjnf6VVagN4SSCir0Pj0GB1asJmcy0bPX_oTTzgW3DEeDxqybzMTNnY0KnOd-jwbKfy1E6dmhTEKOAda73ZcL4FAe1IQrxloGYDIl73I8iXmGL_PzqOSolQEd-zQEicEPlXn0wexPWVdvYxFkQN_CU9cd4L_yAIjm2a4-WwLsXsTPUkfk7lqwx5DjQAHkVHpyslpatUf3iWk-xc15byxFVTTGwhyagcff8AbiJRoIayU71Vg9-V4A9886meMq4TZ0aS2SG_B2Bmugj00lEz2_p0Cpk_80ch1fZ2isQzTIo7oLSBFFAfI-GDDnePI-Q50oEMvTkKf9w55lUgrPLd6NAUmQ_rV)

---

## 8. Diagramas UML (Detalhes)

Esta seção inclui detalhes adicionais sobre os diagramas UML utilizados para modelagem do projeto.

<details>
<summary><strong>8.1. Diagrama de Estrutura do Projeto</strong></summary>

Este diagrama fornece uma visão geral da organização de pastas e arquivos do projeto, mostrando a hierarquia de `src`, `main`, `java`, e as subpastas `application`, `model`, `view`, e `controller`. Ele também indica a presença de arquivos `pom.xml`, `package.bluej` e a pasta `docs` com os arquivos dos diagramas, oferecendo um mapa visual da estrutura do projeto.

![Diagrama UML](https://www.plantuml.com/plantuml/png/pLD1RXin3BplAuJaMco1lY11SaoBja1FHc3G4ctBaKI5bDm0XL_JSr-HZrLRoulDoZ1oh4_UuOmuGr4tae1JzgwJ9niYC7ZbAP3UCdbKYJDsNGJz11jKLnlEaJvTgL-TKYCeh8_81FDWGmMdy0xsCCBJ0iJeh8PagSfElyLdiA4VT8yZUcZrdWowcV8U4gn0SAOkbH-IWIsrXGVIO8ZF5z94qnxs7IE9JLGvb-tkBVwSkIsDGH9Jltxnxas3WczN16oMhjgxJAb66vAZZGqj_8Nsy2s3OJZMr7NVNnVuzJSfwwD3Zo61eOk1D8N4v1poBDPTZNKt4je9tf_Sr_6_ark3Nc8_395RmYp7ORwcZ4APDKe9yvzUNkl_yFO59fJqZXUukENdRFSaog0QD7XQW5kbAQmjU-37fj6XcvnfI8-JMXWB6mOFI-r016KvsI6GFkQIOCu48LbceIcNpdC5dpC6RU7SkTNO8fBlwwGMrMM_SXbtZzsXwm8bL6mtswHetUv_4TMPgEWWu0uCVL0UH8Nvar2XS9Xsc4X1ok3w3eDHGuEcJJldqkWhI89_dn-7Yr7uOalbsArGOQvHA17rwv-rrIH53pOOEFfQ4uCVhyoGJBtSbB_Pkxy0)


</details>

<details>
<summary><strong>8.2. Diagrama de Classes</strong></summary>

O diagrama de classes representa a estrutura estática do sistema, incluindo as classes implementadas e as classes planejadas mencionadas no documento inicial. As relações refletem a herança entre Usuario, Locador e Locatario, a composição entre UsuarioRepositorio e Database, e as associações planejadas com Quadra, Reserva e Horario. Incluí os atributos e métodos principais, destacando que os métodos update, delete, loadFromId e loadAll em UsuarioRepositorio estão planejados, mas não implementados.

 ![Diagrama UML](https://www.plantuml.com/plantuml/png/fLNFRji-3BxxAOYUab-JujThK1GjMXJjq1LRsps0OhE9Daiq93c7_NcOOQUTzmXviKaEBRkMiwtepIG_Vlf8YVIPTSAuMfMP_IHr9OnGe4XJlZQa49ofCSloKbWB7smjZ2JuaW7CPR40gLturBL2GmjuS4RgLUFngNtRebwBdkDmXUwcc4nRYaFRsCmvPSHTmnjGNQADxkUdnXnIc6O4Pz0qH3y4NKCuUrlDdF2jxS8jvQ8Wi-k2mnAVIEEWjaTs9zGn41F73t3SwF4ZvgM7bFApo0MzhqLXH3_eP3NYNPC9dFPIsegqtA2qhnVDcRT3EGb5YkYLCAHxv09Iddx8bvbaNgT59XHZcBOv8xTnAPnO2ekxooZOkXFF7tXEMcFk9Ea5l2cM-KMq7wWsERA-pZsPxWVc9LcSH0rnyEwn8YiTnQTH2EBGmkka4pPcSACThj2SCeYVx0x4nYZ8TLpHx83SmBOZasBfeMnC6-46XSD9pPfQtTFu5K3BskR2l2CpEiVFiQ9sg9tq-05i1ZoUCMj9LABG8QkkYb4P8LPWYVjY9OdYof3gRQ88QEFdPHckxbPQrxRxjBketTDC5cJwrkEWlc0f9hFsfodxstoDJXRFL383zsZHRDAwmZGqJm3_MRu7XwcEIPPT7LNlN1xLv5mUrnijSqaZI-vAgXVtzRh7cNHd4ELZakqJJq_pOoX93kMsVzQJh_Dv-uD9dIwOsSWoeFdy50wE3-8qPipHE9lW_qT7_ntm-ymYsJ3E5vtjSCCe5v4ngWiVH-OqrALbcXo2aQkr0thgLGHmxenSreui97-s6NJ_Cq2F7VcHWTt-872eAZBRxo7O80lSe0AB1XHjPE6zbV0aBLShx2X3NK0GDvIOjjgpljt-T1J8Tcjc1hkLCeDkVJIdyxO0j2wegqgXyQFmYJDGmeBsJe-IgYfHeNOX0feWt_ugv8f0k5gK-wLnlm4kmgHWf1UpXhdFA_Qoy7s_ceOR-NAQC_zPg_8t)

</details>

<details>
<summary><strong>8.3. Diagrama de Caso de Uso</strong></summary>

O diagrama de casos de uso representa as interações dos atores (Locador, Locatário e Sistema) com o sistema, conforme descrito na documentação inicial e refletido nas funcionalidades implementadas (view e controller). Ele inclui os casos de uso para login, cadastro, visualização de quadras e gerenciamento de reservas, com extensões para validação de dados e verificação de disponibilidade. As funcionalidades de cadastro de quadras, consulta de disponibilidade e reservas estão marcadas como "em desenvolvimento", consistentes com o estado atual do projeto.

O diagrama de casos de uso ilustra as interações principais entre os atores (Locador, Locatário e Sistema) e o sistema de locação de quadras esportivas, destacando as funcionalidades disponíveis e planejadas:
- **Atores**:
  - **Locador**: Usuário que cadastra e gerencia quadras esportivas, consultando reservas feitas por locatários.
  - **Locatário**: Usuário que busca quadras disponíveis, realiza reservas e pode cancelá-las.
  - **Sistema**: Responsável por validações automáticas, como autenticação, validação de dados e verificação de disponibilidade.
- **Casos de Uso**:
  - **Fazer Login**: Ambos os atores (Locador e Locatário) autenticam-se no sistema usando número (CPF/telefone) e senha. Este caso de uso se estende a "Validar Credenciais", onde o Sistema verifica as credenciais no banco de dados via `UsuarioRepositorio`.
  - **Cadastrar Usuário**: Locadores e Locatários podem se cadastrar, fornecendo número, nome, senha, telefone e, para locatários, informações temporárias de quadra. Este caso se estende a "Validar Dados", onde o Sistema verifica se os campos obrigatórios estão preenchidos.
  - **Cadastrar Quadra (em desenvolvimento)**: Permite ao Locador cadastrar uma quadra esportiva.
  - **Consultar Reservas (em desenvolvimento)**: Permite ao Locador visualizar as reservas feitas em suas quadras.
  - **Visualizar Quadras Disponíveis**: Locatários podem ver uma lista de quadras disponíveis, atualmente com dados fictícios.
  - **Realizar Reserva (em desenvolvimento)**: Locatários selecionam uma quadra para reservar.
  - **Cancelar Reserva (em desenvolvimento)**: Locatários podem cancelar reservas existentes.
- **Extensões**:
  - **Validar Credenciais**: O Sistema verifica as credenciais de login usando `UsuarioRepositorio.autenticar`.
  - **Validar Dados**: O Sistema valida os campos obrigatórios durante o cadastro, implementado em `CadastroController`.
  - **Verificar Disponibilidade**: O Sistema verifica se a quadra está disponível para reserva (planejado).

![Diagrama UML](https://www.plantuml.com/plantuml/png/bP51JWCn34NtEOMNi2W7G5LLgOKL6ufWRoPkQp69AoSPeTw60t2ANeoC55Lj4nQpcyZ_VN_FNuQ86fFhJVXYVq151qwyT7iLHn0raJ7OHL5uaGwjwCKheopb_SOXaaDZYWncimNSFUEHHksE_Rqv8_NicbgXnH0L5Tv3ElraeeBRagR7QqAhU3iM7r8VytX3WNJ0KAtuu92mv-FP8i2Qmq7ywNSWhlKRAkhYsCZiE-el1URg9y33k3MRsAnPALdo7MFU18ymdzDt96yN2zEu_HfTevLRg4fN45BUSeTQJkDF7ZqitU2cr3iUqivOASvHgjc_Eutn4WcKT_i8icsL2F3am58WFqW_i2CVnP2tC98rNxKypQ4kTI9VEf_0B_DdSlqV)


</details>

<details>
<summary><strong>8.4. Diagrama de Sequência</strong></summary>

O diagrama de sequência detalha o fluxo da operação de reserva, conforme descrito na documentação inicial. Ele inclui o Locatário, as interfaces (LoginController, DashboardLocatarioController), o UsuarioRepositorio e o banco de dados (Database). Como a funcionalidade de reserva não está implementada, o diagrama reflete o fluxo planejado, com validação de login, busca de quadras, seleção de horário e confirmação de reserva.

![Diagrama UML](https://www.plantuml.com/plantuml/png/dLMnRXin3Dtr5KIc173ItKCHm6dH0bcQeDtf4nqBrOakgNFxEq67Jls1hlwnIdVMrP5Zkyd6anwV7laetRL6bDYrtkXN5rOes4BBWPkbS4iGfIDZi8aiSCiD9h1Zas3HDMw58SBPz9OVN9XnYCBUavm1AbHhLSODwdBEA7QahDAF06gkpzhb_JjQiRh8AUmPzfVtD4ISerAFBXyLvbE7Lh17366rVqTAiXu0GrmZFh1WaRIDZHcBWiktTQUcy34e2K7O_6b960YKmX9DXSkf-pLE0Rj88Gb0EGzT9fWC-HTc7vqvIkLJ-4BY5YaH6Y5BeN7er9Hjk3nmtXsb8208QUSZMdxsdEVgpAFrPe5UoQ2FCFjtAgmtZzvPL0EmN_RHuPZ234Ne0S4Mb8636OLnN9x2knzkJl2jTrl1EbrnsFnUayjYHjnf6VVagN4SSCir0Pj0GB1asJmcy0bPX_oTTzgW3DEeDxqybzMTNnY0KnOd-jwbKfy1E6dmhTEKOAda73ZcL4FAe1IQrxloGYDIl73I8iXmGL_PzqOSolQEd-zQEicEPlXn0wexPWVdvYxFkQN_CU9cd4L_yAIjm2a4-WwLsXsTPUkfk7lqwx5DjQAHkVHpyslpatUf3iWk-xc15byxFVTTGwhyagcff8AbiJRoIayU71Vg9-V4A9886meMq4TZ0aS2SG_B2Bmugj00lEz2_p0Cpk_80ch1fZ2isQzTIo7oLSBFFAfI-GDDnePI-Q50oEMvTkKf9w55lUgrPLd6NAUmQ_rV)

</details>

---

## 9. Como Usar

1.  **Login:**
    * Abra o sistema e insira seu número (CPF ou telefone) e senha na tela de login.
    * Clique em "Cadastrar-se" para criar um novo usuário.
2.  **Cadastro de Usuário:**
    * Na tela de cadastro, selecione o tipo de usuário (Locador ou Locatário).
    * Preencha os campos: número, nome, telefone, senha. Para locatários, informe localização, tipo de quadra (Futebol, Tênis, Vôlei, Basquete, Poliesportiva) e horários disponíveis (temporário, a ser movido para Quadra).
    * Clique em "Cadastrar" para salvar. Um alerta confirma o sucesso ou exibe erros.
3.  **Dashboard do Locador:**
    * Acesse a lista de quadras cadastradas.
    * Botões "Atualizar Lista" e "Alugar Quadra Selecionada" estão em desenvolvimento.
    * Clique em "Sair" para voltar ao login.
4.  **Dashboard do Locatário:**
    * Visualize quadras disponíveis em um painel rolável.
    * Use o botão "Adicionar Nova Quadra" para abrir um formulário (em desenvolvimento).
    * Clique em "Sair" para voltar ao login.

---

## 10. Fluxo de Navegação

O sistema segue uma navegação unidirecional:
-   O usuário acessa a tela de login (`login.fxml`).
-   Após autenticação, é redirecionado para o dashboard correspondente (`dashboard_locador.fxml` ou `dashboard_locatario.fxml`).
-   Nos dashboards, o botão "Sair" retorna à tela de login.
-   A tela de cadastro (`cadastro.fxml`) é acessível a partir do login.

---

## 11. Testes e Processo de Desenvolvimento

### 11.1. Testes Realizados

-   Cadastro e listagem de usuários (Locador e Locatário).
-   Persistência de dados no SQLite via ORMLite.
-   Verificação de herança e polimorfismo no `UsuarioRepositorio`.
-   Autenticação de usuários via login.

### 11.2. Processo de Desenvolvimento

O desenvolvimento seguiu uma abordagem incremental:
1.  Modelagem com diagramas UML para definir entidades e relações.
2.  Implementação das classes principais (`Usuario`, `Locador`, `Locatario`).
3.  Configuração da persistência com `Database` e `UsuarioRepositorio`.
4.  Desenvolvimento da interface JavaFX (`view`) e controladores (`controller`).
5.  Testes manuais de cadastro e autenticação.

---

## 12. Conclusão

O sistema de locação de quadras esportivas, desenvolvido em Java com o padrão MVC, ORMLite para persistência em SQLite e JavaFX para a interface gráfica, implementa com sucesso as funcionalidades de cadastro e autenticação de usuários (Locador e Locatário), além da visualização de quadras com dados fictícios. A aplicação demonstra a aplicação dos princípios de Programação Orientada a Objetos, como herança, encapsulamento, polimorfismo e abstração, e estabelece uma base sólida para futuras expansões. A estrutura modular e os diagramas UML fornecem uma visão clara do projeto, garantindo organização e facilitando a manutenção. Apesar de algumas funcionalidades, como gerenciamento de quadras e reservas, ainda estarem em desenvolvimento, o sistema atual atende aos requisitos iniciais de autenticação e gerenciamento de usuários, representando um avanço significativo no objetivo de facilitar a locação de quadras esportivas.

---

## 13. Próximos Passos

-   [ ] Implementar `DatePicker` para seleção de horários.
-   [ ] Adicionar componente de upload de imagens para quadras.
-   [ ] Desenvolver sistema de filtros para busca.
-   [ ] Implementar carregamento assíncrono de dados.
-   [ ] Adicionar animações entre transições de tela.

---

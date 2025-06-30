# Sistema de Locação de Quadras Esportivas

## 1. Introdução

Este projeto implementa um sistema de gerenciamento de aluguel de quadras esportivas, desenvolvido em Java com os princípios da Programação Orientada a Objetos (POO). Utiliza o framework ORMLite para persistência de dados em um banco SQLite e JavaFX para a interface gráfica, seguindo o padrão Model-View-Controller (MVC). O sistema permite que locadores cadastrem quadras e consultem reservas, enquanto locatários podem buscar quadras disponíveis, realizar agendamentos e cancelar reservas.

## 2. Funcionalidades

- Cadastro de usuários (Locador e Locatário) com interface gráfica.
- Autenticação de usuários por número (CPF/telefone) e senha.
- Visualização de quadras cadastradas (Locador) e quadras disponíveis (Locatário, com dados fictícios).
- Cadastro de quadras, consulta de disponibilidade e reservas (em desenvolvimento).

## 3. Tecnologias Utilizadas

- Linguagem: Java.
- Framework de Persistência: ORMLite.
- Banco de Dados: SQLite.
- Interface Gráfica: JavaFX.
- Ferramentas: Maven, PlantUML, BlueJ.

## 4. Requisitos

### 4.1 Funcionais

- Cadastro de usuários (Locador e Locatário) com informações básicas (número, nome, senha, telefone) e, para locatários, dados de quadra (temporário).
- Autenticação de usuários via login.
- Visualização de quadras cadastradas (Locador) e disponíveis (Locatário).
- Cadastro de quadras esportivas (em desenvolvimento).
- Consulta de disponibilidade de quadras (em desenvolvimento).
- Realização e cancelamento de reservas (em desenvolvimento).

### 4.2 Não Funcionais

- Código modular e reutilizável, seguindo o padrão MVC e os princípios de POO (encapsulamento, herança, polimorfismo, abstração).
- Persistência de dados com SQLite e ORMLite.
- Interface gráfica intuitiva com JavaFX.
- Documentação clara e organizada.

## 5. Conceitos de POO Aplicados

- Encapsulamento: Atributos privados com acesso via getters/setters.
- Herança: Locador e Locatario herdam de Usuario.
- Polimorfismo: UsuarioRepositorio manipula Locador e Locatario via a interface de Usuario.
- Abstração: Usuario define a estrutura comum para todos os usuários.

## 6. Implementação das Classes

### 6.1 Model

- Usuario: Classe base que representa usuários, mapeada para a tabela usuarios com atributos id, numero, nome e senha.
- Locador: Herda de Usuario, mapeada para locadores, com atributo adicional telefone.
- Locatario: Herda de Usuario, mapeada para locatarios, com atributos adicionais telefone, localizacaoQuadra, tipoQuadra e horariosDisponiveis (temporários, a serem movidos para Quadra e Horario).
- Database: Gerencia a conexão com o banco SQLite usando ORMLite.
- UsuarioRepositorio: Realiza operações CRUD (atualmente implementa create, buscarPorNumero, autenticar; métodos update, delete, loadFromId, loadAll estão planejados).

### 6.2 Controller

- CadastroController: Gerencia o cadastro de usuários, com validação condicional de campos para locatários.
- DashboardLocadorController: Exibe informações do locador (nome, tipo); funcionalidades de atualização e aluguel são placeholders.
- DashboardLocatarioController: Exibe quadras fictícias em um VBox.
- LoginController: Controla autenticação e navegação para cadastro ou dashboards.

### 6.3 View

- TableView: Listagem de informações (Locador, vazio).
- ComboBox: Seleção de tipo de quadra (Locatário).
- RadioButton: Seleção de tipo de usuário (Cadastro).
- VBox: Container dinâmico (Locatário).
- Label: Exibição de informações (Dashboards).
- Alert: Feedback ao usuário (Erro, Sucesso, Informação).
- 4 controladores implementados.
- 4 telas FXML implementadas.
- 15+ componentes JavaFX utilizados.
- 3 tipos de alertas (Erro, Sucesso, Informação).

### 6.4 Padroes de implementação

- Visibilidade Condicional: Campos específicos para locatários (localização, tipo de quadra, horários) são exibidos dinamicamente no CadastroController com base na seleção do tipo de usuário.
- Injeção de Dados: Dados do usuário (nome, tipo) são passados entre controladores (ex.: de LoginController para DashboardLocadorController ou DashboardLocatarioController) via métodos públicos.
- Navegação Unidirecional: Todas as telas retornam à tela de login via botão "Sair".
- Ações Mapeadas: Eventos (ex.: cliques em botões) são declarados no FXML e implementados nos controladores Java.
- Validações: Verificação de campos obrigatórios no LoginController e validação condicional no CadastroController para campos específicos de locatários.

## 7. Testes e Processo de Desenvolvimento

### 7.1 Testes Realizados

- Cadastro e listagem de usuários (Locador e Locatario).
- Persistência de dados no SQLite via ORMLite.
- Verificação de herança e polimorfismo no UsuarioRepositorio.
- Autenticação de usuários via login.

## 7.2 Processo de Desenvolvimento

O desenvolvimento seguiu uma abordagem incremental:

- Modelagem com diagramas UML para definir entidades e relações.
- Implementação das classes principais (Usuario, Locador, Locatario).
- Configuração da persistência com Database e UsuarioRepositorio.
- Desenvolvimento da interface JavaFX (view) e controladores (controller).
- Testes manuais de cadastro e autenticação.

## 8. Diagramas

### 8.1 Diagrama de classes

O diagrama de classes representa a estrutura estática do sistema, incluindo as classes implementadas e as classes planejadas mencionadas no documento inicial. As relações refletem a herança entre Usuario, Locador e Locatario, a composição entre UsuarioRepositorio e Database, e as associações planejadas com Quadra, Reserva e Horario. Incluí os atributos e métodos principais, destacando que os métodos update, delete, loadFromId e loadAll em UsuarioRepositorio estão planejados, mas não implementados.

![Diagrama UML](https://www.plantuml.com/plantuml/png/fLNFRji-3BxxAOYUab-JujThK1GjMXJjq1LRsps0OhE9Daiq93c7_NcOOQUTzmXviKaEBRkMiwtepIG_Vlf8YVIPTSAuMfMP_IHr9OnGe4XJlZQa49ofCSloKbWB7smjZ2JuaW7CPR40gLturBL2GmjuS4RgLUFngNtRebwBdkDmXUwcc4nRYaFRsCmvPSHTmnjGNQADxkUdnXnIc6O4Pz0qH3y4NKCuUrlDdF2jxS8jvQ8Wi-k2mnAVIEEWjaTs9zGn41F73t3SwF4ZvgM7bFApo0MzhqLXH3_eP3NYNPC9dFPIsegqtA2qhnVDcRT3EGb5YkYLCAHxv09Iddx8bvbaNgT59XHZcBOv8xTnAPnO2ekxooZOkXFF7tXEMcFk9Ea5l2cM-KMq7wWsERA-pZsPxWVc9LcSH0rnyEwn8YiTnQTH2EBGmkka4pPcSACThj2SCeYVx0x4nYZ8TLpHx83SmBOZasBfeMnC6-46XSD9pPfQtTFu5K3BskR2l2CpEiVFiQ9sg9tq-05i1ZoUCMj9LABG8QkkYb4P8LPWYVjY9OdYof3gRQ88QEFdPHckxbPQrxRxjBketTDC5cJwrkEWlc0f9hFsfodxstoDJXRFL383zsZHRDAwmZGqJm3_MRu7XwcEIPPT7LNlN1xLv5mUrnijSqaZI-vAgXVtzRh7cNHd4ELZakqJJq_pOoX93kMsVzQJh_Dv-uD9dIwOsSWoeFdy50wE3-8qPipHE9lW_qT7_ntm-ymYsJ3E5vtjSCCe5v4ngWiVH-OqrALbcXo2aQkr0thgLGHmxenSreui97-s6NJ_Cq2F7VcHWTt-872eAZBRxo7O80lSe0AB1XHjPE6zbV0aBLShx2X3NK0GDvIOjjgpljt-T1J8Tcjc1hkLCeDkVJIdyxO0j2wegqgXyQFmYJDGmeBsJe-IgYfHeNOX0feWt_ugv8f0k5gK-wLnlm4kmgHWf1UpXhdFA_Qoy7s_ceOR-NAQC_zPg_8t)

### 8.2 Diagrama de caso de uso

O diagrama de casos de uso representa as interações dos atores (Locador, Locatário e Sistema) com o sistema, conforme descrito na documentação inicial e refletido nas funcionalidades implementadas (view e controller). Ele inclui os casos de uso para login, cadastro, visualização de quadras e gerenciamento de reservas, com extensões para validação de dados e verificação de disponibilidade. As funcionalidades de cadastro de quadras, consulta de disponibilidade e reservas estão marcadas como "em desenvolvimento", consistentes com o estado atual do projeto.

![Diagrama UML](https://www.plantuml.com/plantuml/png/bP51JWCn34NtEOMNi2W7G5LLgOKL6ufWRoPkQp69AoSPeTw60t2ANeoC55Lj4nQpcyZ_VN_FNuQ86fFhJVXYVq151qwyT7iLHn0raJ7OHL5uaGwjwCKheopb_SOXaaDZYWncimNSFUEHHksE_Rqv8_NicbgXnH0L5Tv3ElraeeBRagR7QqAhU3iM7r8VytX3WNJ0KAtuu92mv-FP8i2Qmq7ywNSWhlKRAkhYsCZiE-el1URg9y33k3MRsAnPALdo7MFU18ymdzDt96yN2zEu_HfTevLRg4fN45BUSeTQJkDF7ZqitU2cr3iUqivOASvHgjc_Eutn4WcKT_i8icsL2F3am58WFqW_i2CVnP2tC98rNxKypQ4kTI9VEf_0B_DdSlqV)

O diagrama de casos de uso ilustra as interações principais entre os atores (Locador, Locatário e Sistema) e o sistema de locação de quadras esportivas, destacando as funcionalidades disponíveis e planejadas:

-Atores:
- Locador: Usuário que cadastra e gerencia quadras esportivas, consultando reservas feitas por locatários.
- Locatário: Usuário que busca quadras disponíveis, realiza reservas e pode cancelá-las.
- Sistema: Responsável por validações automáticas, como autenticação, validação de dados e verificação de disponibilidade.

-Casos de Uso:
- Fazer Login: Ambos os atores (Locador e Locatário) autenticam-se no sistema usando número (CPF/telefone) e senha. Este caso de uso se estende a "Validar Credenciais", onde o Sistema verifica as credenciais no banco de dados via UsuarioRepositorio.
- Cadastrar Usuário: Locadores e Locatários podem se cadastrar, fornecendo número, nome, senha, telefone e, para locatários, informações temporárias de quadra (localização, tipo, horários). Este caso se estende a "Validar Dados", onde o Sistema verifica se os campos obrigatórios estão preenchidos.
- Cadastrar Quadra (em desenvolvimento): Permite ao Locador cadastrar uma quadra esportiva, incluindo localização e tipo. Esta funcionalidade está planejada, mas não implementada (ausência da classe Quadra e do formulário NovaQuadra.fxml).
- Consultar Reservas (em desenvolvimento): Permite ao Locador visualizar as reservas feitas em suas quadras. Está planejado, mas depende da implementação das classes Reserva e Horario.
- Visualizar Quadras Disponíveis: Locatários podem ver uma lista de quadras disponíveis, atualmente implementada com dados fictícios no DashboardLocatarioController.
- Realizar Reserva (em desenvolvimento): Locatários selecionam uma quadra, data e horário para reservar. Este caso se estende a "Verificar Disponibilidade", onde o Sistema valida conflitos de horário. Ainda não implementado.
- Cancelar Reserva (em desenvolvimento): Locatários podem cancelar reservas existentes. Depende da implementação da classe Reserva.

-Extensões:
- Validar Credenciais: O Sistema verifica as credenciais de login usando UsuarioRepositorio.autenticar.
- Validar Dados: O Sistema valida os campos obrigatórios durante o cadastro, implementado em CadastroController.
- Verificar Disponibilidade: O Sistema verifica se a quadra está disponível para reserva (planejado, mas não implementado).

### 8.3 Diagrama de sequencia

O diagrama de sequência detalha o fluxo da operação de reserva, conforme descrito na documentação inicial. Ele inclui o Locatário, as interfaces (LoginController, DashboardLocatarioController), o UsuarioRepositorio e o banco de dados (Database). Como a funcionalidade de reserva não está implementada, o diagrama reflete o fluxo planejado, com validação de login, busca de quadras, seleção de horário e confirmação de reserva. A ausência das classes Quadra, Reserva e Horario é notada, com suposições sobre os métodos que seriam usados.

![Diagrama UML](https://www.plantuml.com/plantuml/png/dLMnRXin3Dtr5KIc173ItKCHm6dH0bcQeDtf4nqBrOakgNFxEq67Jls1hlwnIdVMrP5Zkyd6anwV7laetRL6bDYrtkXN5rOes4BBWPkbS4iGfIDZi8aiSCiD9h1Zas3HDMw58SBPz9OVN9XnYCBUavm1AbHhLSODwdBEA7QahDAF06gkpzhb_JjQiRh8AUmPzfVtD4ISerAFBXyLvbE7Lh17366rVqTAiXu0GrmZFh1WaRIDZHcBWiktTQUcy34e2K7O_6b960YKmX9DXSkf-pLE0Rj88Gb0EGzT9fWC-HTc7vqvIkLJ-4BY5YaH6Y5BeN7er9Hjk3nmtXsb8208QUSZMdxsdEVgpAFrPe5UoQ2FCFjtAgmtZzvPL0EmN_RHuPZ234Ne0S4Mb8636OLnN9x2knzkJl2jTrl1EbrnsFnUayjYHjnf6VVagN4SSCir0Pj0GB1asJmcy0bPX_oTTzgW3DEeDxqybzMTNnY0KnOd-jwbKfy1E6dmhTEKOAda73ZcL4FAe1IQrxloGYDIl73I8iXmGL_PzqOSolQEd-zQEicEPlXn0wexPWVdvYxFkQN_CU9cd4L_yAIjm2a4-WwLsXsTPUkfk7lqwx5DjQAHkVHpyslpatUf3iWk-xc15byxFVTTGwhyagcff8AbiJRoIayU71Vg9-V4A9886meMq4TZ0aS2SG_B2Bmugj00lEz2_p0Cpk_80ch1fZ2isQzTIo7oLSBFFAfI-GDDnePI-Q50oEMvTkKf9w55lUgrPLd6NAUmQ_rV)

## 9. Como Usar

- Login:
Abra o sistema e insira seu número (CPF ou telefone) e senha na tela de login.
Clique em "Cadastrar-se" para criar um novo usuário.

- Cadastro de Usuário:
Na tela de cadastro, selecione o tipo de usuário (Locador ou Locatário).
Preencha os campos: número, nome, telefone, senha. Para locatários, informe localização, tipo de quadra (Futebol, Tênis, Vôlei, Basquete, Poliesportiva) e horários disponíveis (temporário, a ser movido para Quadra).
Clique em "Cadastrar" para salvar. Um alerta confirma o sucesso ou exibe erros.

- Dashboard do Locador:
Acesse a lista de quadras cadastradas.
Botões "Atualizar Lista" e "Alugar Quadra Selecionada" estão em desenvolvimento.
Clique em "Sair" para voltar ao login.

- Dashboard do Locatário:
Visualize quadras disponíveis em um painel rolável.
Use o botão "Adicionar Nova Quadra" para abrir um formulário (em desenvolvimento).
Clique em "Sair" para voltar ao login.

## 10. Fluxo de navegação

O sistema segue uma navegação unidirecional:
- O usuário acessa a tela de login (login.fxml).
- Após autenticação, é redirecionado para o dashboard correspondente (dashboard_locador.fxml ou dashboard_locatario.fxml).
- Nos dashboards, o botão "Sair" retorna à tela de login.
- A tela de cadastro (cadastro.fxml) é acessível a partir do login.

## 11. Conclusão

O sistema de locação de quadras esportivas, desenvolvido em Java com o padrão MVC, ORMLite para persistência em SQLite e JavaFX para a interface gráfica, implementa com sucesso as funcionalidades de cadastro e autenticação de usuários (Locador e Locatário), além da visualização de quadras com dados fictícios. A aplicação demonstra a aplicação dos princípios de Programação Orientada a Objetos, como herança, encapsulamento, polimorfismo e abstração, e estabelece uma base sólida para futuras expansões. A estrutura modular e os diagramas UML fornecem uma visão clara do projeto, garantindo organização e facilitando a manutenção. Apesar de algumas funcionalidades, como gerenciamento de quadras e reservas, ainda estarem em desenvolvimento, o sistema atual atende aos requisitos iniciais de autenticação e gerenciamento de usuários, representando um avanço significativo no objetivo de facilitar a locação de quadras esportivas.

## 12. Proximos passos

- Implementar DatePicker para seleção de horários
- Adicionar componente de upload de imagens para quadras
- Desenvolver sistema de filtros para busca
- Implementar carregamento assíncrono de dados
- Adicionar animações entre transições de tela



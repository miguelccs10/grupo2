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

- Usuario: Classe base que representa usuários, mapeada para a tabela usuarios com atributos id, numero, nome e senha.
- Locador: Herda de Usuario, mapeada para locadores, com atributo adicional telefone.
- Locatario: Herda de Usuario, mapeada para locatarios, com atributos adicionais telefone, localizacaoQuadra, tipoQuadra e horariosDisponiveis (temporários, a serem movidos para Quadra e Horario).
- Database: Gerencia a conexão com o banco SQLite usando ORMLite.
- UsuarioRepositorio: Realiza operações CRUD (atualmente implementa create, buscarPorNumero, autenticar; métodos update, delete, loadFromId, loadAll estão planejados).
- Controladores: CadastroController, DashboardLocadorController, DashboardLocatarioController e LoginController gerenciam a lógica de interação com a interface JavaFX.

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

## 10. Conclusão

## 11. Proximos passos

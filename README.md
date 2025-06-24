## Por planejamento do projeto, espera-se que os seguintes objetivos sejam atingidos:

### - Seção 1 - Introdução:
A gestão manual de reservas de quadras esportivas frequentemente resulta em conflitos de agendamento, como a locação do mesmo espaço para diferentes usuários no mesmo horário. Esse problema causa transtornos. A ausência de um sistema automatizado e centralizado dificulta a organização, a transparência e a confiabilidade no processo de aluguel de quadras. Um sistema digitalizado pode resolver essas questões, oferecendo maior comodidade aos usuários e eficiência aos proprietários.
O problema central é a falta de um sistema que gerencie de forma eficiente e confiável as reservas de quadras esportivas, garantindo que não haja sobreposição de horários e simplificando o processo de escolha e pagamento. Atualmente, os processos manuais ou parcialmente automatizados resultam em erros de agendamento, falta de clareza sobre horários disponíveis e dificuldade para os usuários confirmarem reservas.
A motivação para o desenvolvimento deste sistema surge da necessidade de proporcionar uma solução prática e acessível para usuários que desejam alugar quadras esportivas, bem como para proprietários que buscam gerenciar seus espaços de forma eficiente. O sistema visa melhorar a experiência do usuário, reduzir erros operacionais e promover a automação do processo de reservas, contribuindo para a organização e a satisfação de todas as partes envolvidas.

---

### - Seção 2 - Plano:

**Objetivo geral:**  

Desenvolver um sistema de software que permita aos usuários cadastrarem-se, consultarem a disponibilidade de quadras esportivas, escolherem horários e tipos de quadras, visualizarem os valores associados e realizarem a reserva de forma automatizada, garantindo que não haja conflitos de agendamento.

**Objetivos Específicos:** 

Implementar um sistema de cadastro de usuários com informações básicas (nome e número de telefone) para autenticação e personalização.
Criar uma interface que exiba os tipos de quadras disponíveis (ex.: vôlei, futebol, basquete), horários livres e os respectivos preços.
Desenvolver uma lógica de back-end que impeça a sobreposição de reservas no mesmo horário e quadra.
Integrar um módulo de confirmação de reservas com notificações para o usuário.
Garantir a usabilidade do sistema com uma interface amigável e intuitiva para o front-end.
Documentar o desenvolvimento do projeto, incluindo modelagem, implementação e testes.

---

### - Seção 3 - Divisão de tarefas:
Tarefas (issues), atribuição de tarefa, responsabilidades, prazos, etc.

- [Diniz](https://github.com/dinizanjos): Documentação.  
- [Khalil](https://github.com/Khalielly): Back-end.  
- [Heitor](https://github.com/Heitortxl): VAlidação e Testes.  
- [Miguel](https://github.com/miguelccs10) e [Clara](https://github.com/claraleones): front-end / gerenciamento

---

### - Seção 4 - Modelagem inicial:
A modelagem do sistema será composta por:

## - Diagramas de classes

Esse diagrama foi feito por: [Khalil](https://github.com/Khalielly)
Essa é apenas a primeira versão do diagrama.

![Diagrama UML](https://www.plantuml.com/plantuml/png/ZLMnSjim3Dtv5JmlLPjeoAfBSyavkNRmaCPfTrY2RVOeKY4X3qapzmlw1Htw8VwnYX9CIP6JInQ500Yyzm2Obvx0KLrgGOeqoci56mSbo0BbN8Ftw6KgbyeJTiOlwD3a2aeqP8DXONFO_zl_RG_VQYWSU24qhaas0KvjjYGBvJ0dPOqG7-JdOtzolhXQBc-MnxqY3r3aTr-3KrO-2IbFL959PKX8cHfROYQNv9JPX3DXKzwQaGrBK7fey6YsC3Ia8UiQ7j7DeG1FpYOVCxcpgWWEg0aDgHnSCafrAaU9cXihQpM22PSsI3SXE2IAXKuyqZqZJ5v2FLHy5imvo5jOrt9EqHJeCBT3sBcfVaveRBXBZXioPB9JlWQj7i5TRPg4NIVRY8NoT7w77jqEBa9etWbnI9CSHKUn9sbUhKTGnkKuyxHK59uDoKDRBkDnEfLRwqAHJ7xj_caIS6Y7qkIe8TvstJV6z3s9mED4FxrBikZZ2HmvMQJeJEhkcqas36ArylIs41mIGN14Txxe2NI6oIgGgaRJKOLnkRKk29V9mjOhZS7k2QZsmqZT3LfscBXEc0ZeMldA6hLIMXLGO580DGclWV00aNlJaW3YdY_REecnExiSbHofIxS3c84p0uriEVU4ReyYdBOjoNjLOkiR8uv3q4ycEhLM-PJRU8bNsZxKs8_Ng9qhTEmnlOj9DR202RKG0x2U4gSxIebzFRCTQElkBO5-gudCAtUgHwiF6vhrotegtx5WKO7fWhtmMhDMhWGtiBC2tFtuwyVc7v7DiLxVmePVbx4qh4Aym5h5y5wj4iaMTgABmsucuuqfuBajAsTtO0W7g9zVVxRkRXPN-z_xFw--NEBmQ9t_IjEuMoDZx8iGx9UpivbiFBDFiyEYPxAotjTAnEX1K1ocJ399mPRM6uBE1faShj5Xwb4UYulBbabZ1H-EvgdG4Peyf8cQ3WCvTwneA8HUeYdgKly7)


```plantuml
@startuml
title Diagrama de Classes - Sistema de Gerenciamento de Locação de Quadras

left to right direction

' ===================== CLASSES =====================
class Usuario {
  +id: int
  -nome: String
  -telefone: String
  -email: String
  -senha: String
  --
  +fazerCadastro(): void
  +autenticar(email: String, senha: String): boolean
  +getEmail(): String
  +setTelefone(telefone: String): void
}

class Locador {
  -endereco: String
  -cnpj: String
  --
  +gerenciarQuadras(): void
  +visualizarAgendamentos(): List<Reserva>
  +cadastrarQuadra(): void
}

class Locatario {
  -cpf: String
  --
  +visualizarReservas(): List<Reserva>
  +fazerReserva(quadra: Quadra, horario: Horario): Reserva
  +cancelarReserva(reserva: Reserva): boolean
}

class Sistema {
  --
  +gerenciarQuadras(): void
  +gerenciarUsuarios(): void
  +cadastrarUsuario(usuario: Usuario): void
  +listarReservas(): List<Reserva>
  +listarQuadras(): List<Quadra>
}

class Quadra {
  +id: int
  -tipo: String
  -precoPorHora: double
  -status: String
  -locador: Locador
  --
  +listarDisponibilidade(data: Date): List<Horario>
  +atualizarStatus(novoStatus: String): void
  +getPrecoPorHora(): double
}

class Horario {
  +id: int
  -data: Date
  -hora: Time
  -disponibilidade: boolean
  --
  +verificarDisponibilidade(): boolean
  +bloquearReserva(): void
  +liberarResernva(): void
  +getDataHora(): DateTime
}

class Reserva {
  +id: int
  -dataReserva: Date
  -valorTotal: double
  -status: String
  --
  +criarReserva(locatario: Locatario, quadra: Quadra, horario: Horario): boolean
  +cancelarReserva(): boolean
  +confirmar(): boolean
  +getStatus(): String
  +getValorTotal(): double
}

class Pagamento {
  +id: int
  -valor: double
  -dataPagamento: Date
  -metodo: String
  --
  +realizarPagamento(): boolean
  +getComprovante(): String
}

' ===================== RELAÇÕES =====================

Usuario <|-- Locador
Usuario <|-- Locatario

Locador "1" -- "*" Quadra : possui
Locatario "1" -- "*" Reserva : realiza
Reserva "*" -- "1" Quadra : refere-se a
Reserva "*" -- "1" Horario : no
Horario "*" -- "1" Quadra : pertence a
Pagamento "*" -- "1" Reserva : referente a
@enduml
```
- Diagramas de sequência;

![Diagrama de sequência](https://www.plantuml.com/plantuml/png/VP8nJiGm44NxdC9ba98BRB7Q0Y4A6k04i_RixaY99ypO4U8sY8AAK-HYX2GEMGdJZjxx_b_9GGD8Y6rJW0qive4jE9QY6wzagGCVp3Dfm1QsjuaBmxiG5yNYc7gVKBCp3P_9br7Z15L6qL_WfaX0FSB9sndB_aJIml0vVB1nEDkPPEM6B0MGnmXEG6z9E_RK8scvUM2_wJXQnwWsesou-de3QO2VEY-pPjolbrc2htGa-Kl8hS46BR5FtKfo-H4z2ft8WjopJ3UTyEo0IyAM8iDNhdgMJQMlW-_W3UK95QM7Cfdvte9dqY2mAkIMtCgGcuURQgtmpoAP0zO_na7cGoGmFJs21_Gkjiqt)



## - Diagrama de Casos de uso;

Esse diagrama foi feito por: Ana Clara Leones
Esta é apenas a primeira versão do diagrama

![Diagrama de caso de uso](https://www.plantuml.com/plantuml/png/RP0zJWCn48LxdsAqVOhyX185HNGqW7A0mPui8tazn3DEWpWCP-5YE8iHoqBvdhxtnduxDSnMXkWY7GrC87F_R10uapUMv1nwamntuZ58dYZxUCyiq9n7LgC1dRlaCFMHeBk9fIyK8H2S2eQCsi6h0oXA7hK2jsSspE0b7IERN43yodI02eVzLQKFt_GU0whb6hWVsngpROqpHgfPnYSsRZdb7aWfdojscbQjVbL9qXAjCe7rHH8_SUI0WHgy_lVk_Eh6lRcs3ImMr-EVVjPhrlQljNHjyQPNCxsUwOtRKGfbY9y0)

```plantuml
@startuml
left to right direction

actor Locador
actor Locatário 
actor Sistema

rectangle "Aluguel de quadras" {
  usecase "Evitar conflito de aluguel" as UC6
  Usecase "Cadastrar Quadra" as UC5
  usecase "Cadastrar o usuário" as UC1
  usecase "Reservar quadra" as UC2
  usecase "Consultar disponibilidade" as UC3
  usecase "Cadastrar usuário" as UC4
}
Sistema --> UC6
Locatário --> UC5
Locatário --> UC1
Locador --> UC2
Locador --> UC3
Locador --> UC4
@enduml
```
  ## - Modelagem inicial no BlueJ;
Formatação inicial do Model, View e Controller:
![Descrição da Captura 504](https://github.com/poo-ec-2025-1/grupo2/blob/main/Captura-de-Tela-504.png)
Modelagem inicial do Model:
![Descrição da Captura 505](https://github.com/poo-ec-2025-1/grupo2/blob/main/Captura-de-Tela-505.png)

### - Classe Usuario;
```
package model;

import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.DataType;

@DatabaseTable(tableName = "usuarios")
public class Usuario {
    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(dataType = DataType.STRING, canBeNull = false)
    private String numero;

    @DatabaseField(dataType = DataType.STRING, canBeNull = false)
    private String nome;

    @DatabaseField(dataType = DataType.STRING, canBeNull = false)
    private String senha;

    public Usuario() {
        // Construtor padrão necessário para ORMLite
    }

    public Usuario(String numero, String nome, String senha) {
        this.numero = numero;
        this.nome = nome;
        this.senha = senha;
    }

    // GET e SET methods
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{id=" + id + ", numero='" + numero + "', nome='" + nome + "', senha='[PROTEGIDA]'}";
    }
}
```
### - Classe Locador;
```
package model;

import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.DataType;

@DatabaseTable(tableName = "locadores")
public class Locador extends Usuario {
    @DatabaseField(dataType = DataType.STRING)
    private String telefone;
    public Locador() {
        // Construtor padrão necessário para ORMLite
    }

    public Locador(String numero, String nome, String senha, String telefone) {
        super(numero, nome, senha);
        this.telefone = telefone;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Locador{id=" + getId() + ", numero='" + getNumero() + "', nome='" + getNome() + "', telefone='" + telefone + "', senha='[PROTEGIDA]'}";
    }
}
```
### - Classe Locatario;
```
  package model;

import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.DataType;

@DatabaseTable(tableName = "locatarios")
public class Locatario extends Usuario {
    @DatabaseField(dataType = DataType.STRING)
    private String telefone;

    @DatabaseField(dataType = DataType.STRING)
    private String localizacaoQuadra;

    @DatabaseField(dataType = DataType.STRING)
    private String tipoQuadra;

    @DatabaseField(dataType = DataType.STRING)
    private String horariosDisponiveis;

    public Locatario() {
        // Construtor padrão necessário para ORMLite
    }

    public Locatario(String numero, String nome, String senha, String telefone, String localizacaoQuadra, String tipoQuadra, String horariosDisponiveis) {
        super(numero, nome, senha);
        this.telefone = telefone;
        this.localizacaoQuadra = localizacaoQuadra;
        this.tipoQuadra = tipoQuadra;
        this.horariosDisponiveis = horariosDisponiveis;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getLocalizacaoQuadra() {
        return this.localizacaoQuadra;
    }

    public void setLocalizacaoQuadra(String localizacaoQuadra) {
        this.localizacaoQuadra = localizacaoQuadra;
    }

    public String getTipoQuadra() {
        return this.tipoQuadra;
    }

    public void setTipoQuadra(String tipoQuadra) {
        this.tipoQuadra = tipoQuadra;
    }

    public String getHorariosDisponiveis() {
        return this.horariosDisponiveis;
    }

    public void setHorariosDisponiveis(String horariosDisponiveis) {
        this.horariosDisponiveis = horariosDisponiveis;
    }

    @Override
    public String toString() {
        return "Locatario{id=" + getId() + ", numero='" + getNumero() + "', nome='" + getNome() + "', telefone='" + telefone + "', localizacaoQuadra='" + localizacaoQuadra + "', tipoQuadra='" + tipoQuadra + "', horariosDisponiveis='" + horariosDisponiveis + "', senha='[PROTEGIDA]'}";
    }
}
```
### - UsuarioRepositorio;
```
package model;

import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class UsuarioRepositorio {
    private static Database database;
    private static Dao<Usuario, Integer> daoUsuario;
    private static Dao<Locador, Integer> daoLocador;
    private static Dao<Locatario, Integer> daoLocatario;
    private List<Usuario> loadedUsuarios;
    private Usuario loadedUsuario;

    public UsuarioRepositorio(Database database) {
        UsuarioRepositorio.setDatabase(database);
        loadedUsuarios = new ArrayList<Usuario>();
    }

    public static void setDatabase(Database database) {
        UsuarioRepositorio.database = database;
        try {
            // Criar DAOs para cada entidade
            daoUsuario = DaoManager.createDao(database.getConnection(), Usuario.class);
            daoLocador = DaoManager.createDao(database.getConnection(), Locador.class);
            daoLocatario = DaoManager.createDao(database.getConnection(), Locatario.class);
            // Criar tabelas se não existirem
            TableUtils.createTableIfNotExists(database.getConnection(), Usuario.class);
            TableUtils.createTableIfNotExists(database.getConnection(), Locador.class);
            TableUtils.createTableIfNotExists(database.getConnection(), Locatario.class);
        } catch (SQLException e) {
            System.out.println("Erro ao configurar o banco de dados: " + e.getMessage());
        }
    }

    public Usuario create(Usuario usuario) {
        int nrows = 0;
        try {
            if (usuario instanceof Locador) {
                nrows = daoLocador.create((Locador) usuario);
            } else if (usuario instanceof Locatario) {
                nrows = daoLocatario.create((Locatario) usuario);
            } else {
                nrows = daoUsuario.create(usuario);
            }
            if (nrows == 0) {
                throw new SQLException("Erro: objeto não salvo");
            }
            this.loadedUsuario = usuario;
            loadedUsuarios.add(usuario);
        } catch (SQLException e) {
            System.out.println("Erro ao criar usuário: " + e.getMessage());
        }
        return usuario;
    }

    public void update(Usuario usuario) {
        try {
            if (usuario instanceof Locador) {
                daoLocador.update((Locador) usuario);
            } else if (usuario instanceof Locatario) {
                daoLocatario.update((Locatario) usuario);
            } else {
                daoUsuario.update(usuario);
            }
            // Atualizar a lista carregada (se necessário)
            int index = loadedUsuarios.indexOf(usuario);
            if (index != -1) {
                loadedUsuarios.set(index, usuario);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar usuário: " + e.getMessage());
        }
    }

    public void delete(Usuario usuario) {
        try {
            if (usuario instanceof Locador) {
                daoLocador.delete((Locador) usuario);
            } else if (usuario instanceof Locatario) {
                daoLocatario.delete((Locatario) usuario);
            } else {
                daoUsuario.delete(usuario);
            }
            loadedUsuarios.remove(usuario);
        } catch (SQLException e) {
            System.out.println("Erro ao deletar usuário: " + e.getMessage());
        }
    }

    public Usuario loadFromId(int id) {
        try {
            // Tentar carregar de cada DAO, retornando o primeiro encontrado
            this.loadedUsuario = daoUsuario.queryForId(id);
            if (this.loadedUsuario == null) {
                this.loadedUsuario = daoLocador.queryForId(id);
            }
            if (this.loadedUsuario == null) {
                this.loadedUsuario = daoLocatario.queryForId(id);
            }
            if (this.loadedUsuario != null) {
                loadedUsuarios.add(this.loadedUsuario);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao carregar usuário por ID: " + e.getMessage());
        }
        return this.loadedUsuario;
    }

    public List<Usuario> loadAll() {
        try {
            loadedUsuarios.clear();
            loadedUsuarios.addAll(daoUsuario.queryForAll());
            loadedUsuarios.addAll(daoLocador.queryForAll());
            loadedUsuarios.addAll(daoLocatario.queryForAll());
            if (!loadedUsuarios.isEmpty()) {
                this.loadedUsuario = loadedUsuarios.get(0);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao carregar todos os usuários: " + e.getMessage());
        }
        return loadedUsuarios;
    }
}
```

### - DataBase;
```
 package model;

import java.sql.SQLException;
import com.j256.ormlite.jdbc.JdbcConnectionSource;

public class Database {
    private String databaseName = null;
    private JdbcConnectionSource connection = null;

    public Database(String databaseName) {
        this.databaseName = databaseName;
    }

    public JdbcConnectionSource getConnection() throws SQLException {
        if (databaseName == null) {
            throw new SQLException("database name is null");
        }
        if (connection == null) {
            try {
                connection = new JdbcConnectionSource("jdbc:sqlite:" + databaseName);
            } catch (Exception e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
                System.exit(0);
            }
        }
        return connection;
    }

    public void close() {
        if (connection != null) {
            try {
                connection.close();
                this.connection = null;
            } catch (java.lang.Exception e) {
                System.err.println(e);
            }
        }
    }
}
```



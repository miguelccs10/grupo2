# APP para aluguel de quadras de esportes

## Motivação
A motivação para o desenvolvimento deste sistema surge da necessidade de proporcionar uma solução prática e acessível para usuários que desejam alugar quadras esportivas, bem como para proprietários que buscam gerenciar seus espaços de forma eficiente. O sistema visa melhorar a experiência do usuário, reduzir erros operacionais e promover a automação do processo de reservas, contribuindo para a organização e a satisfação de todas as partes envolvidas.

---

### Plano de desenvolvimento:

**Objetivo geral:**  

Desenvolver um sistema de software que permita aos usuários cadastrarem-se, consultarem a disponibilidade de quadras esportivas, escolherem horários e tipos de quadras, visualizarem os valores associados e realizarem a reserva de forma automatizada, eficiente e confiável, garantindo que não haja sobreposição de horários e simplificando o processo de escolha.

**Objetivos Específicos:** 

Implementar um sistema de cadastro de usuários com informações básicas (nome e número de telefone) para autenticação e personalização.
Criar uma interface que exiba os tipos de quadras disponíveis (ex.: vôlei, futebol, basquete), horários livres e os respectivos preços.
Desenvolver uma lógica de back-end que impeça a sobreposição de reservas no mesmo horário e quadra.
Integrar um módulo de confirmação de reservas com notificações para o usuário.
Garantir a usabilidade do sistema com uma interface amigável e intuitiva para o front-end.
Documentar o desenvolvimento do projeto, incluindo modelagem, implementação e testes.

---

### Membros da equipe:

- [Clara](https://github.com/claraleones): Gerenciamento/Documentação.
- [Khalil](https://github.com/Khalielly): Back-end.
- [Miguel](https://github.com/miguelccs10): front-end  
- [Diniz](https://github.com/dinizanjos): Documentação.  
- [Heitor](https://github.com/Heitortxl): Validação e Testes.
  
---

### Modelagem inicial:
A modelagem do sistema será composta por:

## - Diagramas de classes

Esse diagrama foi feito por: [Khalil](https://github.com/Khalielly)
Essa é apenas a primeira versão do diagrama.

![Diagrama UML](https://www.plantuml.com/plantuml/png/ZLMnSjim3Dtv5JmlLPjeoAfBSyavkNRmaCPfTrY2RVOeKY4X3qapzmlw1Htw8VwnYX9CIP6JInQ500Yyzm2Obvx0KLrgGOeqoci56mSbo0BbN8Ftw6KgbyeJTiOlwD3a2aeqP8DXONFO_zl_RG_VQYWSU24qhaas0KvjjYGBvJ0dPOqG7-JdOtzolhXQBc-MnxqY3r3aTr-3KrO-2IbFL959PKX8cHfROYQNv9JPX3DXKzwQaGrBK7fey6YsC3Ia8UiQ7j7DeG1FpYOVCxcpgWWEg0aDgHnSCafrAaU9cXihQpM22PSsI3SXE2IAXKuyqZqZJ5v2FLHy5imvo5jOrt9EqHJeCBT3sBcfVaveRBXBZXioPB9JlWQj7i5TRPg4NIVRY8NoT7w77jqEBa9etWbnI9CSHKUn9sbUhKTGnkKuyxHK59uDoKDRBkDnEfLRwqAHJ7xj_caIS6Y7qkIe8TvstJV6z3s9mED4FxrBikZZ2HmvMQJeJEhkcqas36ArylIs41mIGN14Txxe2NI6oIgGgaRJKOLnkRKk29V9mjOhZS7k2QZsmqZT3LfscBXEc0ZeMldA6hLIMXLGO580DGclWV00aNlJaW3YdY_REecnExiSbHofIxS3c84p0uriEVU4ReyYdBOjoNjLOkiR8uv3q4ycEhLM-PJRU8bNsZxKs8_Ng9qhTEmnlOj9DR202RKG0x2U4gSxIebzFRCTQElkBO5-gudCAtUgHwiF6vhrotegtx5WKO7fWhtmMhDMhWGtiBC2tFtuwyVc7v7DiLxVmePVbx4qh4Aym5h5y5wj4iaMTgABmsucuuqfuBajAsTtO0W7g9zVVxRkRXPN-z_xFw--NEBmQ9t_IjEuMoDZx8iGx9UpivbiFBDFiyEYPxAotjTAnEX1K1ocJ399mPRM6uBE1faShj5Xwb4UYulBbabZ1H-EvgdG4Peyf8cQ3WCvTwneA8HUeYdgKly7)

Diagrama de classes final:

![Diagrama UML](https://www.plantuml.com/plantuml/png/fLNFRji-3BxxAOYUab-JujThK1GjMXJjq1LRsps0OhE9Daiq93c7_NcOOQUTzmXviKaEBRkMiwtepIG_Vlf8YVIPTSAuMfMP_IHr9OnGe4XJlZQa49ofCSloKbWB7smjZ2JuaW7CPR40gLturBL2GmjuS4RgLUFngNtRebwBdkDmXUwcc4nRYaFRsCmvPSHTmnjGNQADxkUdnXnIc6O4Pz0qH3y4NKCuUrlDdF2jxS8jvQ8Wi-k2mnAVIEEWjaTs9zGn41F73t3SwF4ZvgM7bFApo0MzhqLXH3_eP3NYNPC9dFPIsegqtA2qhnVDcRT3EGb5YkYLCAHxv09Iddx8bvbaNgT59XHZcBOv8xTnAPnO2ekxooZOkXFF7tXEMcFk9Ea5l2cM-KMq7wWsERA-pZsPxWVc9LcSH0rnyEwn8YiTnQTH2EBGmkka4pPcSACThj2SCeYVx0x4nYZ8TLpHx83SmBOZasBfeMnC6-46XSD9pPfQtTFu5K3BskR2l2CpEiVFiQ9sg9tq-05i1ZoUCMj9LABG8QkkYb4P8LPWYVjY9OdYof3gRQ88QEFdPHckxbPQrxRxjBketTDC5cJwrkEWlc0f9hFsfodxstoDJXRFL383zsZHRDAwmZGqJm3_MRu7XwcEIPPT7LNlN1xLv5mUrnijSqaZI-vAgXVtzRh7cNHd4ELZakqJJq_pOoX93kMsVzQJh_Dv-uD9dIwOsSWoeFdy50wE3-8qPipHE9lW_qT7_ntm-ymYsJ3E5vtjSCCe5v4ngWiVH-OqrALbcXo2aQkr0thgLGHmxenSreui97-s6NJ_Cq2F7VcHWTt-872eAZBRxo7O80lSe0AB1XHjPE6zbV0aBLShx2X3NK0GDvIOjjgpljt-T1J8Tcjc1hkLCeDkVJIdyxO0j2wegqgXyQFmYJDGmeBsJe-IgYfHeNOX0feWt_ugv8f0k5gK-wLnlm4kmgHWf1UpXhdFA_Qoy7s_ceOR-NAQC_zPg_8t)

## - Diagramas de sequência;

Primeiro diagrama de sequência:

![Diagrama de sequência](https://www.plantuml.com/plantuml/png/VP8nJiGm44NxdC9ba98BRB7Q0Y4A6k04i_RixaY99ypO4U8sY8AAK-HYX2GEMGdJZjxx_b_9GGD8Y6rJW0qive4jE9QY6wzagGCVp3Dfm1QsjuaBmxiG5yNYc7gVKBCp3P_9br7Z15L6qL_WfaX0FSB9sndB_aJIml0vVB1nEDkPPEM6B0MGnmXEG6z9E_RK8scvUM2_wJXQnwWsesou-de3QO2VEY-pPjolbrc2htGa-Kl8hS46BR5FtKfo-H4z2ft8WjopJ3UTyEo0IyAM8iDNhdgMJQMlW-_W3UK95QM7Cfdvte9dqY2mAkIMtCgGcuURQgtmpoAP0zO_na7cGoGmFJs21_Gkjiqt)

Diagrama de sequência final:

![Diagrama UML](https://www.plantuml.com/plantuml/png/dLMnRXin3Dtr5KIc173ItKCHm6dH0bcQeDtf4nqBrOakgNFxEq67Jls1hlwnIdVMrP5Zkyd6anwV7laetRL6bDYrtkXN5rOes4BBWPkbS4iGfIDZi8aiSCiD9h1Zas3HDMw58SBPz9OVN9XnYCBUavm1AbHhLSODwdBEA7QahDAF06gkpzhb_JjQiRh8AUmPzfVtD4ISerAFBXyLvbE7Lh17366rVqTAiXu0GrmZFh1WaRIDZHcBWiktTQUcy34e2K7O_6b960YKmX9DXSkf-pLE0Rj88Gb0EGzT9fWC-HTc7vqvIkLJ-4BY5YaH6Y5BeN7er9Hjk3nmtXsb8208QUSZMdxsdEVgpAFrPe5UoQ2FCFjtAgmtZzvPL0EmN_RHuPZ234Ne0S4Mb8636OLnN9x2knzkJl2jTrl1EbrnsFnUayjYHjnf6VVagN4SSCir0Pj0GB1asJmcy0bPX_oTTzgW3DEeDxqybzMTNnY0KnOd-jwbKfy1E6dmhTEKOAda73ZcL4FAe1IQrxloGYDIl73I8iXmGL_PzqOSolQEd-zQEicEPlXn0wexPWVdvYxFkQN_CU9cd4L_yAIjm2a4-WwLsXsTPUkfk7lqwx5DjQAHkVHpyslpatUf3iWk-xc15byxFVTTGwhyagcff8AbiJRoIayU71Vg9-V4A9886meMq4TZ0aS2SG_B2Bmugj00lEz2_p0Cpk_80ch1fZ2isQzTIo7oLSBFFAfI-GDDnePI-Q50oEMvTkKf9w55lUgrPLd6NAUmQ_rV)

## - Diagrama de Casos de uso;

Esta é apenas a primeira versão do diagrama.

![Diagrama de caso de uso](https://www.plantuml.com/plantuml/png/RP0zJWCn48LxdsAqVOhyX185HNGqW7A0mPui8tazn3DEWpWCP-5YE8iHoqBvdhxtnduxDSnMXkWY7GrC87F_R10uapUMv1nwamntuZ58dYZxUCyiq9n7LgC1dRlaCFMHeBk9fIyK8H2S2eQCsi6h0oXA7hK2jsSspE0b7IERN43yodI02eVzLQKFt_GU0whb6hWVsngpROqpHgfPnYSsRZdb7aWfdojscbQjVbL9qXAjCe7rHH8_SUI0WHgy_lVk_Eh6lRcs3ImMr-EVVjPhrlQljNHjyQPNCxsUwOtRKGfbY9y0)

Diagrama de casos de uso final:

![Diagrama UML](https://www.plantuml.com/plantuml/png/bP51JWCn34NtEOMNi2W7G5LLgOKL6ufWRoPkQp69AoSPeTw60t2ANeoC55Lj4nQpcyZ_VN_FNuQ86fFhJVXYVq151qwyT7iLHn0raJ7OHL5uaGwjwCKheopb_SOXaaDZYWncimNSFUEHHksE_Rqv8_NicbgXnH0L5Tv3ElraeeBRagR7QqAhU3iM7r8VytX3WNJ0KAtuu92mv-FP8i2Qmq7ywNSWhlKRAkhYsCZiE-el1URg9y33k3MRsAnPALdo7MFU18ymdzDt96yN2zEu_HfTevLRg4fN45BUSeTQJkDF7ZqitU2cr3iUqivOASvHgjc_Eutn4WcKT_i8icsL2F3am58WFqW_i2CVnP2tC98rNxKypQ4kTI9VEf_0B_DdSlqV)

## Telas finais da aplicação:
|       |       |
|-------|-------|
|<img src="assets/Login-v3.png" width="550">|<img src="assets/Cadastro-v3.png" width="500">|
|<img src="assets/DashBoardLocador-v3.png" width="600">|<img src="assets/DashboardLocatario-v3.png" width="600">|
|<img src="assets/CadastroQuadra-v3.png" width="600">|<img src="assets/quadraReservada.png" width="600">|

---

## - Modelagem inicial no BlueJ;
Formatação inicial do Model, View e Controller:
![ModelagemBlueJ](assets/Tela_MVC.png)
Modelagem inicial do Model:
![ModelagemBlueJ](assets/Tela_BlueJ_Classes.png)

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



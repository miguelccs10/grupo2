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
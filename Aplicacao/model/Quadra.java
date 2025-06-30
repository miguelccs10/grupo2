package model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "quadras")
public class Quadra {

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(canBeNull = false)
    private String nome;

    @DatabaseField(canBeNull = false)
    private String tipo;

    @DatabaseField(canBeNull = false)
    private String localizacao;

    @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "locador_id")
    private Locador locador;

    public Quadra() {
        // ORMLite precisa de um construtor sem argumentos
    }

    public Quadra(String nome, String tipo, String localizacao, Locador locador) {
        this.nome = nome;
        this.tipo = tipo;
        this.localizacao = localizacao;
        this.locador = locador;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public String getLocalizacao() { return localizacao; }
    public void setLocalizacao(String localizacao) { this.localizacao = localizacao; }
    public Locador getLocador() { return locador; }
    public void setLocador(Locador locador) { this.locador = locador; }

    @Override
    public String toString() {
        return "Quadra{" + "id=" + id + ", nome='" + nome + '\'' + ", tipo='" + tipo + '\'' + '}';
    }
}
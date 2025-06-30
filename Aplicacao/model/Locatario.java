package model;

import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.DataType;

@DatabaseTable(tableName = "locatarios")
public class Locatario extends Usuario {
    @DatabaseField(dataType = DataType.STRING)
    private String telefone;

    public Locatario() {
        // Construtor padrão necessário para ORMLite
    }

    public Locatario(String numero, String nome, String senha, String telefone) {
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
        return "Locatario{id=" + getId() + ", numero='" + getNumero() + "', nome='" + getNome() + "', telefone='" + telefone + "'}";
    }
}
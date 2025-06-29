

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

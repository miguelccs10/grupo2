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

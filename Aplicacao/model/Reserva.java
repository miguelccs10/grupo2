package model;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

@DatabaseTable(tableName = "reservas")
public class Reserva {

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(foreign = true, foreignAutoRefresh = true, canBeNull = false, columnName = "quadra_id")
    private Quadra quadra;

    @DatabaseField(foreign = true, foreignAutoRefresh = true, canBeNull = false, columnName = "locatario_id")
    private Locatario locatario;

    // ATUALIZAÇÃO: Usando java.util.Date, que o ORMLite entende nativamente.
    @DatabaseField(dataType = DataType.DATE_LONG, canBeNull = false)
    private Date dataHora;

    public Reserva() {
        // Construtor padrão para ORMLite
    }

    /**
     * Construtor principal que faz a conversão de LocalDate e LocalTime para Date.
     */
    public Reserva(Quadra quadra, Locatario locatario, LocalDate data, LocalTime hora) {
        this.quadra = quadra;
        this.locatario = locatario;
        // Combina data e hora e converte para java.util.Date
        this.dataHora = Date.from(data.atTime(hora).atZone(ZoneId.systemDefault()).toInstant());
    }


    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public Quadra getQuadra() { return quadra; }
    public void setQuadra(Quadra quadra) { this.quadra = quadra; }
    public Locatario getLocatario() { return locatario; }
    public void setLocatario(Locatario locatario) { this.locatario = locatario; }

    /**
     * Getter que retorna o objeto Date nativo.
     * O ORMLite usará este método internamente.
     */
    public Date getDataHora() {
        return dataHora;
    }

    /**
     * Setter que define o objeto Date nativo.
     */
    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }


    // --- MÉTODOS DE CONVENIÊNCIA ---
    // Estes métodos permitem que o resto do app continue trabalhando com LocalDate e LocalTime.

    /**
     * Converte o Date armazenado para LocalDate.
     */
    public LocalDate getData() {
        if (dataHora == null) return null;
        return Instant.ofEpochMilli(dataHora.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
    }

    /**
     * Converte o Date armazenado para LocalTime.
     */
    public LocalTime getHora() {
        if (dataHora == null) return null;
        return Instant.ofEpochMilli(dataHora.getTime()).atZone(ZoneId.systemDefault()).toLocalTime();
    }
}
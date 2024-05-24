package src.com.merdes.equipe.code;

public class Circuito {

    private int id;
    private String nome;
    private String pais;
    private int record;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getRecord() {
        return record;
    }

    public void setRecord(int record) {
        this.record = record;
    }

    public Circuito(int id, String nome, String pais, int record) {
        this.id = id;
        this.nome = nome;
        this.pais = pais;
        this.record = record;
    }
}
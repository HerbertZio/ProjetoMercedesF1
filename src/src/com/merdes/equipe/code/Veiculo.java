package src.com.merdes.equipe.code;

public class Veiculo {

    private int id;
    private int numero;
    private String modelo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Veiculo(int id, int numero, String modelo) {
        this.id = id;
        this.numero = numero;
        this.modelo = modelo;
    }
}
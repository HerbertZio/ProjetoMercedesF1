package src.com.merdes.equipe.code;

public class Atleta extends Equipe {

    private double altura;
    private double peso;
    private int vitorias;
    private int titulos;
    private Veiculo veiculo;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
        this.salario += 1000.00 * vitorias;
    }

    public int getTitulos() {
        return titulos;
    }

    public void setTitulos(int titulos) {
        this.titulos = titulos;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Atleta(int id, String nome, int idade, String nacionalidade, double salario, double altura,
                  double peso, int vitorias, int titulos, Veiculo veiculo) {
        super(id, nome, idade, nacionalidade, salario);
        this.altura = altura;
        this.peso = peso;
        this.vitorias = vitorias;
        this.titulos = titulos;
        this.veiculo = veiculo;
    }

    public Atleta(int id, String nome, int idade, String nacionalidade, double salario, double altura,
                  double peso, int vitorias, int titulos) {
        super(id, nome, idade, nacionalidade, salario);
        this.altura = altura;
        this.peso = peso;
        this.vitorias = vitorias;
        this.titulos = titulos;
    }

}

package src.com.merdes.equipe.code;

public class Equipe {

    protected int id;
    protected String nome;
    protected int idade;
    protected String nacionalidade;
    protected double salario;

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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Equipe(int id, String nome, int idade, String nacionalidade, double salario) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
        this.salario = salario;
    }
}
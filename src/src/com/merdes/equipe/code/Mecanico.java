package src.com.merdes.equipe.code;

public class Mecanico extends Equipe {

    private String especialidade;
    private int anosExperiencia;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
        this.salario += 500.00 * anosExperiencia;
    }

    public Mecanico(int id, String nome, int idade, String nacionalidade, double salario,
                    String especialidade, int anosExperiencia) {
        super(id, nome, idade, nacionalidade, salario);
        this.especialidade = especialidade;
        this.anosExperiencia = anosExperiencia;
    }
}
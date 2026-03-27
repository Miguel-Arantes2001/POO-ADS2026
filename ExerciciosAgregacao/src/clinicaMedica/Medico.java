package clinicaMedica;

public class Medico {
    private String nome;
    private int id;
    private String especialidade;

    public Medico(String nome, int id, String especialidade) {
        this.nome = nome;
        this.id = id;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Medico: \n" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", especialidade='" + especialidade + '\''
                ;
    }
}

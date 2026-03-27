package timeBasquete;

public class Atleta {

    private int id;
    private String nome;
    private String posicao;

    public Atleta(int id, String nome, String posicao) {
        this.id = id;
        this.nome = nome;
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        return
                "\nid = " + id +
                ", nome = '" + nome + '\'' +
                ", posicao = '" + posicao + '\''
                ;
    }
}

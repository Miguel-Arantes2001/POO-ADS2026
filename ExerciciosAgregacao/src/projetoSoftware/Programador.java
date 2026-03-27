package projetoSoftware;

public class Programador {
    private String nome,linguagemPrincipal;
    private int id;

    public Programador(String nome, String linguagemPrincipal, int id) {
        this.nome = nome;
        this.linguagemPrincipal = linguagemPrincipal;
        this.id = id;
    }

    @Override
    public String toString() {
        return
                " nome = '" + nome + '\'' +
                ", linguagem principal = '" + linguagemPrincipal + '\'' +
                ", id = " + id+"\n"
               ;
    }
}

package supermercado;

public class Produto {
    private int id;
    private double preco;
    private String nome;

    public Produto(int id, double preco, String nome) {
        this.id = id;
        this.preco = preco;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}


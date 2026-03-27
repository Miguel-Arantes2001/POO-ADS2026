package supermercado;

public class ItemVenda {
    private int id,quantidade;
    private Produto produto;

    public ItemVenda(int id, int quantidade, Produto produto) {
        this.id = id;
        this.quantidade = quantidade;
        this.produto = produto;
    }
    public double calcularSubtotal(){
        double subtotal = quantidade * produto.getPreco();
        return subtotal;
    }
    public String getDescricao(){
        return produto.getNome()+" x"+quantidade;
    }

}

package supermercado;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "Cliente 1");
        Produto p1 = new Produto(1,20,"Arroz");
        Produto p2 = new Produto(2,10,"Feijao");

        Venda venda1 = new Venda(1,cliente);
        venda1.adicionarItem(1,5,p1);
        venda1.adicionarItem(2,2,p2);

        venda1.calcularTotal();
        venda1.exibirVenda();
    }
}

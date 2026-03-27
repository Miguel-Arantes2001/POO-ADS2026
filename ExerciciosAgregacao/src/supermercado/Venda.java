package supermercado;

import java.util.ArrayList;

public class Venda {
    private ArrayList<ItemVenda> itens = new ArrayList<ItemVenda>();
    private Cliente cliente;
    private int id;


    public Venda(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
    }

    public void adicionarItem(int id, int quantidade,Produto produto) {
        ItemVenda item = new ItemVenda(id, quantidade, produto);
        itens.add(item);

    }
    public double calcularTotal(){
        double total = 0;
        for (ItemVenda item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public void exibirVenda(){
        System.out.println("Cliente: "+cliente.getNome());
        for(ItemVenda item : itens){
            System.out.println(item.getDescricao());
        }
        System.out.println("Total da venda: "+calcularTotal());
    }
}

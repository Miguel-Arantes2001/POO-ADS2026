package fatecfranca.produto.service;

import fatecfranca.produto.model.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {
    private List<Produto> lista = new ArrayList<>();
    private Long nextId = 1L;

    public List<Produto> listar() {
        return this.lista;
    }

    public Produto buscarPorId(Long id) {
        for (Produto produto : lista) {
            if (produto.getId().equals(id)) {
                return produto;
            }
        }

        return null;
    }

    public Produto criarProduto(Produto produto) {
        produto.setId(nextId++);
        lista.add(produto);
        return produto;
    }

    public boolean deletarProduto(Long id) {
        return lista.removeIf(produto -> produto.getId().equals(id));
    }

    public Produto atualizarProduto(Long id, Produto produto) {
        for (Produto produto1 : lista) {
            if (produto1.getId().equals(id)) {
                produto1.setNome(produto.getNome());
                produto1.setPreco(produto.getPreco());
                return produto;
            }
        }
        return null;
    }

}


package fatecfranca.produto.controller;

import fatecfranca.produto.model.Produto;
import fatecfranca.produto.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired//injeçao de dependencia
    //podemos usar service sem instancia-lo
    private ProdutoService service;

    @GetMapping// verbo get -> CONSULTA
    public ResponseEntity<List<Produto>> listar(){
        // status da resposta é ok (sucesso)
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Produto> criarProduto(@RequestBody Produto produto){
        // chama o garçom
        Produto criado =  service.criarProduto(produto);
        // cria uma uri com o id do produto criado
        // URL - Uniform Resource Locator
        // URI - Uniform Resource Identifier

        URI uri  =  URI.create("/produtos/"+criado.getId());

        // retorna status de sucesso 201 (created)
        return ResponseEntity.created(uri).body(criado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarPorId(@PathVariable Long id) {

        Produto existente = service.buscarPorId(id);
        if(existente ==null){
            return ResponseEntity.notFound().build();
        }
        service.deletarProduto(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produto> atualizar(@PathVariable Long id, @RequestBody Produto produto){
        Produto atualizar = service.atualizarProduto(id,produto);
        if (atualizar == null) {
            return ResponseEntity.notFound().build();
        }
        URI uri  =  URI.create("/produtos/"+atualizar.getId());

        return ResponseEntity.created(uri).body(atualizar);
    }

    }




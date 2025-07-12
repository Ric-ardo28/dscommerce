
package br.com.ricardo.dscommerce.controllers;

import br.com.ricardo.dscommerce.dto.ProductDTO;
import br.com.ricardo.dscommerce.services.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;


// Indica que esta classe é um controller REST
@RestController
// Define o caminho base para os endpoints deste controller
@RequestMapping(value = "/products")
public class ProductController {

    // Injeta o serviço responsável pela lógica de produtos
    @Autowired
    private ProductService service;

    // Endpoint para buscar um produto pelo ID
    @GetMapping(value = "/{id}")
    public ResponseEntity<ProductDTO> findById(@PathVariable Long id) {
        // Retorna o produto encontrado com status 200 OK
        return ResponseEntity.ok(service.findById(id));
    }

    // Endpoint para buscar todos os produtos de forma paginada
    @GetMapping
    public ResponseEntity<Page<ProductDTO>> findAll(Pageable pageable) {
        // Retorna a página de produtos com status 200 OK
        return ResponseEntity.ok(service.findAll(pageable));
    }

    // Endpoint para inserir um novo produto
    @PostMapping
    public ResponseEntity<ProductDTO> insert(@Valid @RequestBody ProductDTO dto) {
        // Salva o novo produto
        dto = service.insert(dto);
        // Cria a URI do novo recurso criado
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
            .buildAndExpand(dto.getId()).toUri();
        // Retorna status 201 Created com a URI do novo produto
        return ResponseEntity.created(uri).body(dto);
    }

    // Endpoint para atualizar um produto existente
    @PutMapping(value = "/{id}")
    public ResponseEntity<ProductDTO> update(@PathVariable Long id, @Valid  @RequestBody ProductDTO dto) {
        // Atualiza o produto e retorna o resultado com status 200 OK
        return ResponseEntity.ok(service.update(id, dto));
    }

    // Endpoint para deletar um produto pelo ID
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        // Remove o produto
        service.delete(id);
        // Retorna status 204 No Content
        return ResponseEntity.noContent().build();
    }
}
package br.com.ricardo.dscommerce.controllers;

import br.com.ricardo.dscommerce.dto.ProductDTO;
import br.com.ricardo.dscommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import java.net.URI;
import java.util.List;


@RestController
@RequestMapping(value = "/products")
public class ProductController {

	@Autowired
	private ProductService service;

/*
Evitar exceção caso o ID não exista:
	@GetMapping
	public ResponseEntity<String> teste() {
		Optional<Product> result = repository.findById(1L);
		return result
				.map(product -> ResponseEntity.ok(product.getDescription()))
				.orElse(ResponseEntity.notFound().build());
	}

 */
	@GetMapping(value = "/{id}")
	public ResponseEntity<ProductDTO> findById(@PathVariable Long id) {

		return ResponseEntity.ok(service.findById(id));
	}
	@GetMapping
	public ResponseEntity<Page<ProductDTO>> findAll(Pageable pageable) {

		return ResponseEntity.ok(service.findAll(pageable));
	}
	@PostMapping
	public ResponseEntity<ProductDTO> insert(@RequestBody ProductDTO dto) {
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(service.insert(dto).getId()).toUri();
		return ResponseEntity.created(uri).body(service.insert(dto));
	}
}
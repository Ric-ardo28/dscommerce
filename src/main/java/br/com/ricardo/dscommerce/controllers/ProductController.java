package br.com.ricardo.dscommerce.controllers;

import br.com.ricardo.dscommerce.dto.ProductDTO;
import br.com.ricardo.dscommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



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
	public ProductDTO findById(@PathVariable Long id) {
		return service.findById(id);
	}
}
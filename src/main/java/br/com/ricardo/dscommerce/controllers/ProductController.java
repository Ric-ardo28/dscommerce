package br.com.ricardo.dscommerce.controllers;

import br.com.ricardo.dscommerce.entities.Product;
import br.com.ricardo.dscommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
	@Autowired
	private ProductRepository repository;

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
	@GetMapping
	public String teste() {
		Optional<Product> result = repository.findById(100L);
		Product product = result.get();
		return product.getDescription();
	}
}
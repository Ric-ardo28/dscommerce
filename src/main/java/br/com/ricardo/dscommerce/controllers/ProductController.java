package br.com.ricardo.dscommerce.controllers;

import br.com.ricardo.dscommerce.dto.ProductDTO;
import br.com.ricardo.dscommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


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
	public ProductDTO findById(@PathVariable Long id) {

		return service.findById(id);
	}
	@GetMapping
	public Page<ProductDTO> findAll(Pageable pageable) {

		return service.findAll(pageable);
	}
	@PostMapping
	public ProductDTO insert(@RequestBody ProductDTO dto) {

		return service.insert(dto);
	}
}
package br.com.ricardo.dscommerce.services;

import br.com.ricardo.dscommerce.dto.ProductDTO;
import br.com.ricardo.dscommerce.entities.Product;
import br.com.ricardo.dscommerce.repository.ProductRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProductService {


	private final ProductRepository repository;

	public ProductService(ProductRepository repository) {
		this.repository = repository;
	}

	@Transactional(readOnly = true)
	public ProductDTO findById(Long id) {
		Optional<Product> result = repository.findById(id);
		Product product = result.get();
		return new ProductDTO(product);

	}
}

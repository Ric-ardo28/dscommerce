package br.com.ricardo.dscommerce.repository;

import br.com.ricardo.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}

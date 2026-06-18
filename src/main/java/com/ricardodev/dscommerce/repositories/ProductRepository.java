package com.ricardodev.dscommerce.repositories;

import com.ricardodev.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

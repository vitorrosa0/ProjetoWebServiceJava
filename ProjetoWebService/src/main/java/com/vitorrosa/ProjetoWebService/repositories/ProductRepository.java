package com.vitorrosa.ProjetoWebService.repositories;

import com.vitorrosa.ProjetoWebService.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
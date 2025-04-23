package com.vitorrosa.ProjetoWebService.repositories;

import com.vitorrosa.ProjetoWebService.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
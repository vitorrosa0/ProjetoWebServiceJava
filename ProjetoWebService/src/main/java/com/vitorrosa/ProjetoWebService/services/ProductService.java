package com.vitorrosa.ProjetoWebService.services;

import com.vitorrosa.ProjetoWebService.entities.Category;
import com.vitorrosa.ProjetoWebService.entities.Product;
import com.vitorrosa.ProjetoWebService.repositories.CategoryRepository;
import com.vitorrosa.ProjetoWebService.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = productRepository.findById(id);
        return obj.get();
    }

}

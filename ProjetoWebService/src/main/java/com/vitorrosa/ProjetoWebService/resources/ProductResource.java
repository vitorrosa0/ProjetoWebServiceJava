package com.vitorrosa.ProjetoWebService.resources;

import com.vitorrosa.ProjetoWebService.entities.Category;
import com.vitorrosa.ProjetoWebService.entities.Product;
import com.vitorrosa.ProjetoWebService.services.CategoryService;
import com.vitorrosa.ProjetoWebService.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductResource {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        List<Product> u = productService.findAll();
        return ResponseEntity.ok().body(u);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        Product obj = productService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}

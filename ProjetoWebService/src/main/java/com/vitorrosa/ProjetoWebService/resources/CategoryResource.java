package com.vitorrosa.ProjetoWebService.resources;

import com.vitorrosa.ProjetoWebService.entities.Category;
import com.vitorrosa.ProjetoWebService.entities.User;
import com.vitorrosa.ProjetoWebService.services.CategoryService;
import com.vitorrosa.ProjetoWebService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryResource {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        List<Category> u = categoryService.findAll();
        return ResponseEntity.ok().body(u);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id){
        Category obj = categoryService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}

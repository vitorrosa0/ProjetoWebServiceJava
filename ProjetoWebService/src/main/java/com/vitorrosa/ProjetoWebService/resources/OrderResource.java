package com.vitorrosa.ProjetoWebService.resources;

import com.vitorrosa.ProjetoWebService.entities.Order;
import com.vitorrosa.ProjetoWebService.entities.User;
import com.vitorrosa.ProjetoWebService.services.OrderService;
import com.vitorrosa.ProjetoWebService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderResource {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public ResponseEntity<List<Order>> findAll(){
        List<Order> u = orderService.findAll();
        return ResponseEntity.ok().body(u);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id){
        Order obj = orderService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}

package com.vitorrosa.ProjetoWebService.repositories;

import com.vitorrosa.ProjetoWebService.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
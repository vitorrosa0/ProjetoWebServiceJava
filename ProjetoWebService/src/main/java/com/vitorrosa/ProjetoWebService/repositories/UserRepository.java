package com.vitorrosa.ProjetoWebService.repositories;

import com.vitorrosa.ProjetoWebService.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
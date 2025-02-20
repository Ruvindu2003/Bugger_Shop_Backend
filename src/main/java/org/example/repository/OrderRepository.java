package org.example.repository;

import org.example.entity.Orderentity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orderentity,String> {

}


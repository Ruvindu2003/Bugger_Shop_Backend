package org.example.repository;

import org.example.entity.Productentity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Productentity,String> {

}

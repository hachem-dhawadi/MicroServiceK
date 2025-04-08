package com.espirt.microservice.productscategories.repository;

import com.espirt.microservice.productscategories.entity.Categorie;
import com.espirt.microservice.productscategories.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductsRepo extends JpaRepository<Products, Long> {
    List<Products> findByCategory(Categorie category);  // Changed to use enum
}
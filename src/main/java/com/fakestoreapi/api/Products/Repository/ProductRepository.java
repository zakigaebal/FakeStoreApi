package com.fakestoreapi.api.Products.Repository;

import com.fakestoreapi.api.Products.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

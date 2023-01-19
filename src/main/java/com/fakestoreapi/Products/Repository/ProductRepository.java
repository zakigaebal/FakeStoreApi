package com.fakestoreapi.Products.Repository;

import com.fakestoreapi.Products.domain.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, Integer> {

}

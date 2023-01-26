package com.fakestoreapi.api.Products.Repository;

import com.fakestoreapi.api.Products.Entity.Category;
import com.fakestoreapi.api.Products.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}

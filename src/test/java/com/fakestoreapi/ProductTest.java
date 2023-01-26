package com.fakestoreapi;

import com.fakestoreapi.api.Products.Entity.Product;
import com.fakestoreapi.api.Products.Repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductTest {
    @Autowired
    private ProductRepository productRepository;

    @Test
    void insertProduct(){
        Product p1 = new Product();
        p1.setDescription("123");
        p1.setTitle("123");
        p1.setPrice(123);
        this.productRepository.save(p1);

        Product p2 = new Product();
        p2.setDescription("12345");
        p2.setTitle("12345");
        p2.setPrice(12345);
        this.productRepository.save(p2);
    }
}

package com.fakestoreapi;

import com.fakestoreapi.Products.Repository.ProductRepository;
import com.fakestoreapi.Products.domain.Products;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FakeStoreApiApplicationTests {
    @Autowired
    private ProductRepository productRepository;
    @Test
    void testJpa(){
        Products p1 = new Products();
        p1.setTitle("상품1");
        p1.setPrice("1000");
        p1.setCategory("카테고리1");
        p1.setDescription("설명1");
        this.productRepository.save(p1);
    }
}

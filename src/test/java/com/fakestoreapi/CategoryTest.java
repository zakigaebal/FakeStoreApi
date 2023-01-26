package com.fakestoreapi;

import com.fakestoreapi.api.Products.Entity.Category;
import com.fakestoreapi.api.Products.Entity.Product;
import com.fakestoreapi.api.Products.Repository.CategoryRepository;
import com.fakestoreapi.api.Products.Repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
public class CategoryTest {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    void categoryInsert() {
        Category q1 = new Category();
        q1.setCategoryName("asdf");
        this.categoryRepository.save(q1);  // 첫번째 질문 저장

        Category q2 = new Category();
        q2.setCategoryName("asdf2");
        this.categoryRepository.save(q2);  // 두번째 질문 저장
    }

    @Test
    void testJpa() {

        Optional<Category> oq = this.categoryRepository.findById(1);
        assertTrue(oq.isPresent());
        Category q = oq.get();

//        Product a = new Product();
//        a.setDescription("네 자동으로 생성됩니다.");
//        a.setCategory(q);  // 어떤 질문의 답변인지 알기위해서 Question 객체가 필요하다.
//        a.setTitle("22");
//        a.setPrice(22);
////        a.setCreateDate(LocalDateTime.now());
//        this.productRepository.save(a);
    }


}

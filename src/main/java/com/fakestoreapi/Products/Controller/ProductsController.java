package com.fakestoreapi.Products.Controller;

import com.fakestoreapi.Products.domain.Products;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RequestMapping("/products")
@RestController
public class ProductsController {
    @GetMapping("/products")
    public String abc(){
        return "abc";
    }

    @PostMapping("/products")
    public String abcd(){
        return "abc";
    }

    @GetMapping("/")
    public List<Products> getList(){
        List<Products> list = new ArrayList<>();
        log.info("product 리스트 를 반환합니다.");
        return list;
    }
}

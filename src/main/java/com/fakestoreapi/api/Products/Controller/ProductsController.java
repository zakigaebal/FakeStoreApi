package com.fakestoreapi.api.Products.Controller;

import com.fakestoreapi.Entity.Users;
import com.fakestoreapi.Service.UserService;
import com.fakestoreapi.api.Products.Entity.Product;
import com.fakestoreapi.api.Products.Service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
public class ProductsController {
    private final ProductService productService;

    @GetMapping(value = "/products")
    public List<Product> getProduct(@RequestParam(required = false, defaultValue = "") String id ){
        return productService.getProductsService(id);
    }

    @PostMapping(value = "/product")
    public String createProduct(@RequestBody Product product){
        return productService.createProductService(product);
    }
}

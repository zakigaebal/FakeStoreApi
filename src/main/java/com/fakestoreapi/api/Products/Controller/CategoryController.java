package com.fakestoreapi.api.Products.Controller;

import com.fakestoreapi.api.Products.Entity.Category;
import com.fakestoreapi.api.Products.Entity.Product;
import com.fakestoreapi.api.Products.Service.CategoryService;
import com.fakestoreapi.api.Products.Service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping(value = "/categories")
    public List<Category> getProduct(@RequestParam(required = false, defaultValue = "") String categoryId ){
        return categoryService.getCategoryService(categoryId);
    }

    @PostMapping(value = "/category")
    public String createProduct(@RequestBody Category category){
        return categoryService.createCategoryService(category);
    }

}



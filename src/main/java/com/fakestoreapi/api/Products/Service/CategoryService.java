package com.fakestoreapi.api.Products.Service;


import com.fakestoreapi.api.Products.Entity.Category;
import com.fakestoreapi.api.Products.Repository.CategoryRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository repository;

    public List<Category> getCategoryService(String categoryId) {
        // name 파라미터가 Null이면 전체 user를 리턴
        if (categoryId.isBlank())
            return repository.findAll();
        else
            return null;
//        else  // name 이 존재를 하면, Like 쿼리로 2개만 리턴
//            return userRepository.findFirst2ByUsernameLikeOrderByIDDesc(name);
    }

    public String createCategoryService(Category category){
        repository.save(category); // User Insert 쿼리 수행
        return "등록 완료";
    }
}

package com.fakestoreapi.api.Products.Service;



import com.fakestoreapi.api.Products.Entity.Product;
import com.fakestoreapi.api.Products.Repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository repository;

    public List<Product> getProductsService(String id) {
        // name 파라미터가 Null이면 전체 user를 리턴
        if (id.isBlank())
            return repository.findAll();
        else
            return null;
//        else  // name 이 존재를 하면, Like 쿼리로 2개만 리턴
//            return userRepository.findFirst2ByUsernameLikeOrderByIDDesc(name);
    }

    public String createProductService(Product product){
        repository.save(product); // User Insert 쿼리 수행
        return "등록 완료";
    }
}

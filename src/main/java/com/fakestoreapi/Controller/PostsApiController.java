package com.fakestoreapi.Controller;


import com.fakestoreapi.dto.PostsSaveRequestDto;
import com.fakestoreapi.Service.PostService;
import com.fakestoreapi.dto.PostsResponseDto;
import com.fakestoreapi.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

//    private final PostService postService;
//
//    @PostMapping("/api/v1/posts")
//    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
//
//        return postService.save(requestDto);
//    }
//    @PutMapping("/api/v1/posts/{id}")
//    public Long update(@PathVariable Long id, @RequestBody
//    PostsUpdateRequestDto requestDto) {
//
//        return postService.update(id, requestDto);
//    }
//
//    @GetMapping("/api/v1/posts/{id}")
//    public PostsResponseDto findById (@PathVariable Long id) {
//
//        return postService.findById(id);
//    }
}
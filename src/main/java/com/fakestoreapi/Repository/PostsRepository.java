package com.fakestoreapi.Repository;

import com.fakestoreapi.Entity.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
}
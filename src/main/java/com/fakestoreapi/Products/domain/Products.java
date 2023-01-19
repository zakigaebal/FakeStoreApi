package com.fakestoreapi.Products.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(length = 200)
    String title;
    @Column(length = 200)
    String price;
    @Column(length = 200)
    String category;
    @Column(length = 200)
    String description;
    String image;
}

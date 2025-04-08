package com.espirt.microservice.productscategories.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)  // Store enum as string in database
    private Categorie category;  // Changed from Category entity to enum

    private String name;
    private String description;
    private Double price;
    private int stockQuantity;
    private String imageUrl;
    private String brand;
    private String sku;
    private Double discountPercentage;
    private Boolean isActive = true;
}
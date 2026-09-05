package com.realestate.marketplace.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "properties")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(length = 2000)
    private String description;

    private BigDecimal price;

    private String propertyType;

    private String listingType;

    private Integer bedrooms;

    private Integer bathrooms;

    private Double area;

    private String city;

    private String state;

    private String pincode;

    private String status;
}

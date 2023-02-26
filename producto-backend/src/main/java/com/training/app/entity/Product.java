/*
 * Copyright (c) 2023.
 * @Author: Yorsh
 * @Social: www.linkedin.com/in/jorge-pr
 */
package com.training.app.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "product", schema = "public")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private Integer idProduct;

    @Column(name = "name")
    private String name;

    @Column(name = "detail")
    private String detail;

    @ManyToMany(cascade = {CascadeType.REFRESH, CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinTable(name = "product_category",
            joinColumns = {@JoinColumn(name = "product_id", referencedColumnName = "id_product")},
            inverseJoinColumns = {@JoinColumn(name = "category_id", referencedColumnName = "id_category")})
    private Set<Category> categories;

}

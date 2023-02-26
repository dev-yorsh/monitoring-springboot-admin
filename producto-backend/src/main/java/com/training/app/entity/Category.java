/*
 * Copyright (c) 2023.
 * @Author: Yorsh
 * @Social: www.linkedin.com/in/jorge-pr
 */
package com.training.app.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "category", schema = "public")
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_category")
    private Integer idCategory;

    @Column(name = "name")
    private String name;

    @Column(name = "detail")
    private String detail;

}

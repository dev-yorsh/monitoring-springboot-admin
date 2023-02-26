/*
 * Copyright (c) 2023.
 * @Author: Yorsh
 * @Social: www.linkedin.com/in/jorge-pr
 */
package com.training.app.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "role", schema = "public")
@Data
public class Role implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_role")
    private Integer idRole;

    @Column(name = "name")
    private String name;

    @Column(name = "detail")
    private String detail;

}

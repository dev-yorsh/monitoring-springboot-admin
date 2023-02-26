/*
 * Copyright (c) 2023.
 * @Author: Yorsh
 * @Social: www.linkedin.com/in/jorge-pr
 */
package com.training.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "client", schema = "public")
@Data
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_client")
    private Integer idClient;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String lastName;

    @Column(name = "status")
    private Boolean status;

    @JsonIgnore
    @ManyToMany(cascade = {CascadeType.REFRESH, CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinTable(name = "client_role",
            joinColumns = {@JoinColumn(name = "client_id", referencedColumnName = "id_client")},
            inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id_role")})
    private Set<Role> roles = new HashSet<>();

}

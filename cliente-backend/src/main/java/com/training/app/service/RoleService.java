package com.training.app.service;

import com.training.app.entity.Role;

import java.util.List;

public interface RoleService {

    Role save(Role role);
    List<Role> findAll();
    void delete(Integer id);

    Role findById(Integer id);
}

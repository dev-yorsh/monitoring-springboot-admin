/*
 * Copyright (c) 2023.
 * @Author: Yorsh
 * @Social: www.linkedin.com/in/jorge-pr
 */
package com.training.app.controller;

import com.training.app.entity.Role;
import com.training.app.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping
    public Role save(@RequestBody Role Role) {
        return roleService.save(Role);
    }

    @GetMapping
    public List<Role> findAll() {
        return roleService.findAll();
    }

    @GetMapping("{id}")
    public Role findAll(@PathVariable Integer id) {
        return roleService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deletedById(@PathVariable(name = "id") Integer id) {
        roleService.delete(id);
    }

}

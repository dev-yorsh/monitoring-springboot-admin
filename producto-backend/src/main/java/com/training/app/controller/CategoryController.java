/*
 * Copyright (c) 2023.
 * @Author: Yorsh
 * @Social: www.linkedin.com/in/jorge-pr
 */
package com.training.app.controller;


import com.training.app.entity.Category;
import com.training.app.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public Category save(@RequestBody Category Category) {
        return categoryService.save(Category);
    }

    @GetMapping
    public List<Category> findAll() {
        return categoryService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deletedById(@PathVariable(name = "id") Integer id) {
        categoryService.delete(id);
    }

}

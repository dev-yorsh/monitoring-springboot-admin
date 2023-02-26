/*
 * Copyright (c) 2023.
 * @Author: Yorsh
 * @Social: www.linkedin.com/in/jorge-pr
 */
package com.training.app.controller;


import com.training.app.entity.Product;
import com.training.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public Product save(@RequestBody Product product) {
        return productService.save(product);
    }

    @GetMapping
    public List<Product> findAll() {
        return productService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deletedById(@PathVariable(name = "id") Integer id) {
        productService.delete(id);
    }
}

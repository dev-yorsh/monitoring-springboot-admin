package com.training.app.service;

import com.training.app.entity.Product;

import java.util.List;

public interface ProductService {

    Product save(Product product);
    List<Product> findAll();
    void delete(Integer id);

}

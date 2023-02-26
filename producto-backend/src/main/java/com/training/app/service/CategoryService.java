package com.training.app.service;

import com.training.app.entity.Category;

import java.util.List;

public interface CategoryService {

    Category save(Category category);
    List<Category> findAll();
    void delete(Integer id);
}

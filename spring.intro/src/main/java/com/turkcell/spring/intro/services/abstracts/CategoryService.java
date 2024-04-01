package com.turkcell.spring.intro.services.abstracts;

import com.turkcell.spring.intro.entities.Category;

import java.util.List;

public interface CategoryService {
    //abstraction
    void add(Category category);
    void update(Category category);
    void delete(int id);

    List<Category> getAll();
    Category getById(int id);
}

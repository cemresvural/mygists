package com.turkcell.spring.intro.services.abstracts;

import com.turkcell.spring.intro.entities.Category;
import com.turkcell.spring.intro.services.dtos.requests.category.AddCategoryRequest;
import com.turkcell.spring.intro.services.dtos.responses.category.AddCategoryResponse;

import java.util.List;
//Services do NOT work directly with entity classes at any point.
public interface CategoryService {
    //abstraction
    AddCategoryResponse add(AddCategoryRequest request);
    void update(Category category);
    void delete(int id);

    List<Category> getAll();
    Category getById(int id);
}

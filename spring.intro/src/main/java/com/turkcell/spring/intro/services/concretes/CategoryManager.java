package com.turkcell.spring.intro.services.concretes;


import com.turkcell.spring.intro.entities.Category;
import com.turkcell.spring.intro.repositories.CategoryRepository;
import com.turkcell.spring.intro.services.abstracts.CategoryService;
import com.turkcell.spring.intro.services.dtos.requests.AddCategoryRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

//Consistency
@Service
@RequiredArgsConstructor
public class CategoryManager implements CategoryService {

    private final CategoryRepository categoryRepository;
    @Override
    public void add(AddCategoryRequest request) {
           if(request.getName().length()<3)
               throw new RuntimeException("Category name must be at least 3 letters.");
         Category category=new Category();
         category.setName(request.getName());
         categoryRepository.save(category);
    }

    @Override
    public void update(Category category) {

    }

    @Override
    public void delete(int id) {
        //will refactor
        Category category=categoryRepository.findById(id).orElse(null);
        if(category==null)
            throw new RuntimeException("The category to be deleted could not be found.");

        categoryRepository.delete(category);

    }

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getById(int id) {
        return  categoryRepository.findById(id).orElseThrow();
    }
}

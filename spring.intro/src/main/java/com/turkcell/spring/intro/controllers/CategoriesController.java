package com.turkcell.spring.intro.controllers;


import com.turkcell.spring.intro.entities.Category;
import com.turkcell.spring.intro.repositories.CategoryRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor

public class CategoriesController {

    private final CategoryRepository categoryRepository;


    @GetMapping
    public List<Category>  getAll(){
        return  categoryRepository.findAll();
    }

    @PostMapping
    public void add(@RequestBody Category category){
        categoryRepository.save(category);
    }
}






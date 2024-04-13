package com.turkcell.spring.intro.controllers;


import com.turkcell.spring.intro.entities.Category;
import com.turkcell.spring.intro.services.abstracts.CategoryService;
import com.turkcell.spring.intro.services.dtos.requests.AddCategoryRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//endpoint tanımlama
@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor

public class CategoriesController {
    //Controllers do NOT implement repositories
    //do service implement,work like firewall

    private final CategoryService categoryService;


    @GetMapping
    public List<Category>  getAll(){
        return  categoryService.getAll();
    }

    @PostMapping
    public void add(@RequestBody AddCategoryRequest request){
        categoryService.add(request);
    }

    @PutMapping
    public void update(@RequestBody Category category){
        categoryService.update(category);
    }
}






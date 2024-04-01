package com.turkcell.spring.intro.controllers;


import com.turkcell.spring.intro.entities.Category;
import com.turkcell.spring.intro.repositories.CategoryRepository;
import com.turkcell.spring.intro.services.abstracts.CategoryService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
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
    public void add(@RequestBody Category category){
        categoryService.add(category);
    }
}






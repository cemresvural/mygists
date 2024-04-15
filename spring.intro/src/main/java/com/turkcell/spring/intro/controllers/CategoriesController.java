package com.turkcell.spring.intro.controllers;


import com.turkcell.spring.intro.entities.Category;
import com.turkcell.spring.intro.services.abstracts.CategoryService;
import com.turkcell.spring.intro.services.dtos.requests.category.AddCategoryRequest;
import com.turkcell.spring.intro.services.dtos.responses.category.AddCategoryResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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

    public ResponseEntity<AddCategoryResponse> add(@RequestBody AddCategoryRequest request){
        AddCategoryResponse response= categoryService.add(request);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(response.getId()).toUri();
       return ResponseEntity.created(location).body(response);
    }

    @GetMapping("{id}")
    public Category getDetails(@PathVariable int id){
        return categoryService.getById(id);
    }
    @PutMapping
    public void update(@RequestBody Category category){
        categoryService.update(category);
    }
}






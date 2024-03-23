package com.turkcell.spring.intro.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
@GetMapping
    public String get(){
        return "Merhaba";
    }
    @GetMapping("get2")
    public String get2(){
    return "Merhaba 2";
    }

}

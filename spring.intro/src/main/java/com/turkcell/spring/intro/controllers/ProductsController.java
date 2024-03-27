package com.turkcell.spring.intro.controllers;

import com.turkcell.spring.intro.entities.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
    //Params
    //Query String

    //http://localhost:8081/api/products?name=Cemre&surname=Vural  GET-Query String @RequestParam
    //http://localhost:8081/api/products/cemre   @PathVariable
    @GetMapping()
    public String get(@RequestParam String name){
        return "Merhaba"+ name;
    }

    @GetMapping("get2")
    public String get2(){
    return "Merhaba 2";
    }
    @PostMapping
    /*public String post(@RequestBody Product product){
       return "Ürün id: "+product.getId() + "isim: "+product.getName() + "fiyat: "+product.getUnitPrice();
    }*/
    public Product post(@RequestBody Product product) {
        return product;
    }

}
//header >side information
//Accept Language
//json convert to java class or java class convert to json,spring
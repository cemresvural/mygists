package com.turkcell.spring.intro.repositories;

import com.turkcell.spring.intro.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//kategoriler tablosu verisine erişmek ✅
//endpoint tanımlama  ❌
public interface CategoryRepository extends JpaRepository <Category, Integer> {


    //Derived Query Methods
   Optional<Category> findByNameIgnoreCase(String name);

}

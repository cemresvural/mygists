package com.turkcell.spring.intro.repositories;

import com.turkcell.spring.intro.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

//kategoriler tablosu verisine erişmek ✅
//endpoint tanımlama  ❌
public interface CategoryRepository extends JpaRepository <Category, Integer> {

}

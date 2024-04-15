package com.turkcell.spring.intro.services.concretes;

import com.turkcell.spring.intro.entities.Product;
import com.turkcell.spring.intro.repositories.ProductRepository;
import com.turkcell.spring.intro.services.abstracts.ProductService;
import com.turkcell.spring.intro.services.dtos.requests.product.AddProductRequest;
import com.turkcell.spring.intro.services.mappers.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductManager implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public void add(AddProductRequest request) {
        Product product= ProductMapper.INSTANCE.productFromAddRequest(request);


        productRepository.save(product);
    }
}

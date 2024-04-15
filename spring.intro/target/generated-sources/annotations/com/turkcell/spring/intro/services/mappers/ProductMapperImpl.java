package com.turkcell.spring.intro.services.mappers;

import com.turkcell.spring.intro.entities.Category;
import com.turkcell.spring.intro.entities.Product;
import com.turkcell.spring.intro.services.dtos.requests.product.AddProductRequest;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-15T22:44:09+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 20.0.1 (Oracle Corporation)"
)
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product productFromAddRequest(AddProductRequest request) {
        if ( request == null ) {
            return null;
        }

        Product product = new Product();

        product.setCategory( addProductRequestToCategory( request ) );
        product.setName( request.getName() );
        product.setUnitPrice( request.getUnitPrice() );

        return product;
    }

    protected Category addProductRequestToCategory(AddProductRequest addProductRequest) {
        if ( addProductRequest == null ) {
            return null;
        }

        Category category = new Category();

        category.setId( addProductRequest.getCategoryId() );

        return category;
    }
}

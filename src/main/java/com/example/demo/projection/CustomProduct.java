package com.example.demo.projection;

import com.example.demo.entity.Product;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;


@Projection(types = Product.class)
public interface CustomProduct {
    Integer getId();

    String getName();
    @Value("#{target.category.id}")
    Integer getCategoryId();
    @Value("#{target.supplier.id}")
    Integer getSupplierId();

    Integer getFactureNumber();

    String getCode();



}

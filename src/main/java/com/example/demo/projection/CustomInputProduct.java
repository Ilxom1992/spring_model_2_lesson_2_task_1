package com.example.demo.projection;

import com.example.demo.entity.Input;
import com.example.demo.entity.Product;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;


@Projection(types = Product.class)
public interface CustomInputProduct {
    Integer getId();
    Integer getProductId();

    Double getAmount();

    Double getPrice();

    Date getExpireDate();

    Input getInput();

    String getCode();

}

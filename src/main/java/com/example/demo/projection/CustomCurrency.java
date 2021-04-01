package com.example.demo.projection;

import com.example.demo.entity.Currency;
import com.example.demo.entity.User;
import org.springframework.data.rest.core.config.Projection;


@Projection(types = Currency.class)
public interface CustomCurrency {
    Integer getId();

    String getName();

    boolean isActive();

}

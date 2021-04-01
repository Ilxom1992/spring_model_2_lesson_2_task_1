package com.example.demo.projection;

import com.example.demo.entity.Supplier;
import com.example.demo.entity.User;
import org.springframework.data.rest.core.config.Projection;


@Projection(types = Supplier.class)
public interface CustomSupplier {
    Integer getId();

    String getName();

    String getPhoneNumber();

    boolean isActive();

}

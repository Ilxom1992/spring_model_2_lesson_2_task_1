package com.example.demo.projection;

import com.example.demo.entity.User;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.Column;


@Projection(types = User.class)
public interface CustomUser {
    Integer getId();

    String getFirstname();

    String getLastName();

    String getPhoneNumber();

    Integer getCode();

    String getPassword();

    boolean isActive();

}

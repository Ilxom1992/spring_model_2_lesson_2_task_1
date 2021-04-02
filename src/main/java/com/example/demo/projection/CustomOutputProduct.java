package com.example.demo.projection;

import com.example.demo.entity.OutputProduct;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;


@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {
    Integer getId();

    Object getProductId();

    Double getAmount();

    Double getPrice();


   Object getOutput();



}

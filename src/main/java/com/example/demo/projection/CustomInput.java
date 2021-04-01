package com.example.demo.projection;

import com.example.demo.entity.Input;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;


@Projection(types = Input.class)
public interface CustomInput {
    Integer getId();

    String getDate();
   @Value("#{target.warehouse.id}")
    Object getWarehouse();

   @Value("#{target.supplier.id}")
    Object getSupplier();

    @Value("#{target.currency.id}")
    Object getCurrency();

    String getFactureNumber();
    Integer getCode();

}

package com.example.demo.projection;

import com.example.demo.entity.Client;
import com.example.demo.entity.Output;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;


@Projection(types = Output.class)
public interface CustomOutput {
    Integer getId();

    String getDate();

    Object getWarehouseId();

    Object getCurrencyId();

    String getFactureNumber();

    Integer getCode();

    Client getClient();


}

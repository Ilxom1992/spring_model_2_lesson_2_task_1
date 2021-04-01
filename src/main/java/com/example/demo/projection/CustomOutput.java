package com.example.demo.projection;

import com.example.demo.entity.Output;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;


@Projection(types = Output.class)
public interface CustomOutput {
    Integer getId();

    String getDate();
    @Value("#{target.warehouse.id}")
    Integer getWarehouseId();
    @Value("#{target.currency.id}")
    Integer getCurrencyId();

    String getFactureNumber();

    Integer getCode();
    @Value("#{target.client.id}")
    Integer getClientId();


}

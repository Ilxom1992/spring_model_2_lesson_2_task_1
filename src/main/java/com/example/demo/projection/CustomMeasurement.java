package com.example.demo.projection;

import com.example.demo.entity.Measurement;
import com.example.demo.entity.User;
import org.springframework.data.rest.core.config.Projection;


@Projection(types = Measurement.class)
public interface CustomMeasurement {
    Integer getId();

    boolean isActive();

}

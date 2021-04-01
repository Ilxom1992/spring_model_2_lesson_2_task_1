package com.example.demo.repositort;


import com.example.demo.entity.Input;
import com.example.demo.projection.CustomInput;
import com.example.demo.projection.CustomInputProduct;
import com.example.demo.projection.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "input", collectionResourceRel = "list",excerptProjection = CustomInput.class)
public interface InputRepository extends JpaRepository<Input, Integer> {
}

package com.example.demo.repositort;


import com.example.demo.entity.OutputProduct;
import com.example.demo.projection.CustomOutputProduct;
import com.example.demo.projection.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "output_product", collectionResourceRel = "list",excerptProjection = CustomOutputProduct.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct, Integer> {
}

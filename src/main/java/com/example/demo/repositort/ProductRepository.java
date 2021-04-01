package com.example.demo.repositort;


import com.example.demo.entity.Product;
import com.example.demo.projection.CustomProduct;
import com.example.demo.projection.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "product", collectionResourceRel = "list",excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {

}

package com.example.demo.repositort;


import com.example.demo.entity.Currency;
import com.example.demo.projection.CustomCurrency;
import com.example.demo.projection.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "currency", collectionResourceRel = "list",excerptProjection = CustomCurrency.class)
public interface CurrencyRepository extends JpaRepository<Currency, Integer> {


}

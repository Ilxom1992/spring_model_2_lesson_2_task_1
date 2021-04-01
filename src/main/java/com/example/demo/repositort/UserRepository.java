package com.example.demo.repositort;


import com.example.demo.entity.User;
import com.example.demo.projection.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "users", collectionResourceRel = "list",excerptProjection = CustomUser.class)
public interface UserRepository extends JpaRepository<User, Integer> {

}

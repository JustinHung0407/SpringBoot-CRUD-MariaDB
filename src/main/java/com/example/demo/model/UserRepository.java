package com.example.demo.model;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends JpaRepository<User, Long> {
    /*@Query("SELECT Id FROM User WHERE name.=:title and a.category=:category")
    List<User> fetchArticles(@Param("title") String title, @Param("category") String category);*/
	User findByName(String name);
}
package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Category;

public interface  CategoryRepository extends JpaRepository<Category, Long>{

}

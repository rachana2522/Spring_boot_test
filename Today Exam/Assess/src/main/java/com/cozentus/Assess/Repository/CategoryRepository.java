package com.cozentus.Assess.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cozentus.Assess.Model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
}



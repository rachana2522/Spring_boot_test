package com.cozentus.Assess.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cozentus.Assess.Model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	List<Product> findByCategory_Id(Integer categoryId);
	List<Product> findByCategoryIdAndIsActiveOrderByViewsDesc(Integer categoryId, boolean isActive);

    void deleteByCategoryId(Integer categoryId);
}




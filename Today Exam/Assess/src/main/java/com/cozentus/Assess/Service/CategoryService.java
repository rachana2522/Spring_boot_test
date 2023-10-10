package com.cozentus.Assess.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cozentus.Assess.Model.Category;
import com.cozentus.Assess.Repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
    public Iterable<Category> getAllCategories() {
    	return categoryRepository.findAll();
    }
    
	public Category createCategory(Category category) {
		return categoryRepository.save(category);
	}
	
    public Category updateCategory(Integer id, String newName) {
    	Category category = categoryRepository.findById(id).get();
    	category.setName(newName);
    	Category updatedCategory = categoryRepository.save(category);
    	return updatedCategory;
    }
    
    public void deleteCategory(Integer id) {
    	categoryRepository.deleteById(id);
    }
    
    public void deleteCategories(List<Integer> categoryIds) {
        for (Integer categoryId : categoryIds) {
            categoryRepository.deleteById(categoryId);
        }
    }
}

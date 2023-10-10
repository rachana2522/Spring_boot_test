package com.cozentus.Assess.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cozentus.Assess.Model.Category;
import com.cozentus.Assess.Service.CategoryService;

@RestController
public class CategoryRestController {
	
	@Autowired
	private CategoryService categoryService;
	
	 @GetMapping("/GET/Category")
	    public ResponseEntity<Iterable<Category>> getAllCategories() {
	        Iterable<Category> categories = categoryService.getAllCategories();
	        return ResponseEntity.ok(categories);
	    }

	    @PostMapping("/POST/Category")
	    public ResponseEntity<Category> createCategory(@RequestBody Category category) {
	        Category createdCategory = categoryService.createCategory(category);
	        return ResponseEntity.ok(createdCategory);
	    }

	    @PutMapping("/DELETE/Category/{id}/{newName}")
	    public ResponseEntity<Category> updateCategory(@PathVariable("id") Integer id, @PathVariable("newName") String newName) {
	        Category updatedCategory = categoryService.updateCategory(id, newName);
	        return ResponseEntity.ok(updatedCategory);
	    }

	    @DeleteMapping("/DELETE/Category/{id}")
	    public ResponseEntity<Void> deleteCategory(@PathVariable("id") Integer id) {
	        categoryService.deleteCategory(id);
	        return ResponseEntity.noContent().build();
	    }

	    @PostMapping("/POST/DeleteCategories")
	    public ResponseEntity<Void> deleteCategories(@RequestBody List<Integer> categoryIds) {
	        categoryService.deleteCategories(categoryIds);
	        return ResponseEntity.noContent().build();
	    }
}

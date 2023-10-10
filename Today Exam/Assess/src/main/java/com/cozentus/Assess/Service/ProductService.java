package com.cozentus.Assess.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cozentus.Assess.Model.Product;
import com.cozentus.Assess.Repository.ProductRepository;


@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
    public Iterable<Product> getAllProducts() {
    	return productRepository.findAll();
    }
    
    public Product getProductById(Integer id) {
        return productRepository.findById(id).get();
    }
	
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}
	
	public Product updateProduct(Integer id, String newName) {
        // Delete the existing product
        productRepository.deleteById(id);

        // Create a new product with the updated name
        Product updatedProduct = new Product();
        updatedProduct.setId(id);
        updatedProduct.setName(newName);

        // Save the updated product
        return productRepository.save(updatedProduct);
    }
    
    public void deleteProduct(Integer id) {
    	productRepository.deleteById(id);
    }
    
	public void deleteProductsByCategory(Integer categoryId) { 
		Iterable<Product> productsToDelete = productRepository.findByCategory_Id(categoryId); 
		for(Product product : productsToDelete) { 
			productRepository.delete(product); 
		} 
	}
}
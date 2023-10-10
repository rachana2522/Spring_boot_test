package com.cozentus.Assess.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cozentus.Assess.Model.Product;
import com.cozentus.Assess.Service.ProductService;
@RestController
@CrossOrigin(allowedHeaders = "*" , origins = "*")
public class ProductRestController {
	
	@Autowired
	private ProductService productService;
	
	 @GetMapping("/GET/Product")
	    public ResponseEntity<Iterable<Product>> getAllProducts() {
	        Iterable<Product> products = productService.getAllProducts();
	        return ResponseEntity.ok(products);
	    }

	    @GetMapping("/GET/Product/{id}")
	    public ResponseEntity<Product> getProductById(@PathVariable("id") Integer id) {
	        Product product = productService.getProductById(id);
	        return ResponseEntity.ok(product);
	    }

	    @PostMapping("/POST/Product")
	    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
	        Product createdProduct = productService.createProduct(product);
	        return ResponseEntity.ok(createdProduct);
	    }

	    // @PutMapping("/DELETE/Product/{id}/{newName}")
	    // public ResponseEntity<Product> updateProduct(@PathVariable("id") Integer id, @PathVariable("newName") String newName) {
	    //     Product updatedProduct = productService.updateProduct(id, newName);
	    //     return ResponseEntity.ok(updatedProduct);
	    // }

	    @DeleteMapping("/DELETE/Product/{id}")
	    public ResponseEntity<Void> deleteProduct(@PathVariable("id") Integer id) {
	        productService.deleteProduct(id);
	        return ResponseEntity.noContent().build();
	    }

		@DeleteMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Integer id, @RequestBody @Validated Product updatedProduct) {
        Product product = productService.updateProduct(id, updatedProduct);
        if (product != null) {
            return ResponseEntity.ok(product);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

	    @DeleteMapping("/DELETE/Product/{categoryId}")
	    public ResponseEntity<Void> deleteProductsByCategory(@PathVariable("categoryId") Integer categoryId) {
	        productService.deleteProductsByCategory(categoryId);
	        return ResponseEntity.noContent().build();
	    }
}

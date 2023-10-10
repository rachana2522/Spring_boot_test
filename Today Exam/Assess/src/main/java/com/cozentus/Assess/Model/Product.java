package com.cozentus.Assess.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String brand;
    private String description;
    private Float unitPrice;
    private Integer quantity;
    private Boolean isActive;
    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;
    private Integer purchases;
    private Integer views;
    
	public Product() {}

	public Product(Integer id, String name, String brand, String description, Float unitPrice, Integer quantity,
			Boolean isActive, Category category, Integer purchases, Integer views) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.description = description;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		this.isActive = isActive;
		this.category = category;
		this.purchases = purchases;
		this.views = views;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String updatedProduct2) {
		this.name = updatedProduct2;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Integer getPurchases() {
		return purchases;
	}

	public void setPurchases(Integer purchases) {
		this.purchases = purchases;
	}

	public Integer getViews() {
		return views;
	}

	public void setViews(Integer views) {
		this.views = views;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", brand=" + brand + ", description=" + description
				+ ", unitPrice=" + unitPrice + ", quantity=" + quantity + ", isActive=" + isActive + ", category="
				+ category + ", purchases=" + purchases + ", views=" + views + "]";
	}

    public void setName(Product updatedProduct2) {
    }

}




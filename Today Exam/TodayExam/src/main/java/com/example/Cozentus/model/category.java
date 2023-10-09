package com.example.Cozentus.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="category")
public class category {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String description;
	private String image_url;
	private String is_active;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public String getIs_active() {
		return is_active;
	}
	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}
	@Override
	public String toString() {
		return "category [id=" + id + ", name=" + name + ", description=" + description + ", image_url=" + image_url
				+ ", is_active=" + is_active + "]";
	}
	public category(int id, String name, String description, String image_url, String is_active) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.image_url = image_url;
		this.is_active = is_active;
	}
	public category() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}

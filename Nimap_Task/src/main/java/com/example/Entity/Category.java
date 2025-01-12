package com.example.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Category {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String name;
	
	private String categorydesciption;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Product> products;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
		

	public String getCategorydesciption() {
		return categorydesciption;
	}

	public void setCategorydesciption(String categorydesciption) {
		this.categorydesciption = categorydesciption;
	}

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Category(Long id, String name, String categorydesciption, List<Product> products) {
		super();
		this.id = id;
		this.name = name;
		this.categorydesciption = categorydesciption;
		this.products = products;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", categorydesciption=" + categorydesciption + ", products="
				+ products + "]";
	}

	
    
    
}

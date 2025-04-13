package com.example.ms_products.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;


@Entity
@Table(name = "products")
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank(message = "Name cannot be blank")
    private String name;
    
    private String description;
    
    @Positive(message = "Price must be positive")
    private Double price;
    
    private Integer quantity;
    
	
	  // Constructors public Product() { }
	  
	public Product(String name, String description, Double price, Integer stock)
	  { this.name = name; this.description = description; this.price = price;
	  this.quantity = stock; }
	
	  
	  // Getters and Setters public Long getId() { return id; }
	  
	  public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void setId(Long id) { this.id = id; }
	  
	  public String getName() { return name; }
	  
	  public void setName(String name) { this.name = name; }
	  
	  public String getDescription() { return description; }
	  
	  public void setDescription(String description) { this.description =
	  description; }
	  
	  public Double getPrice() { return price; }
	  
	  public void setPrice(Double price) { this.price = price; }
	  
	  public Integer getQuantity() { return quantity; }
	  
	  public void setQuantity(Integer stock) { this.quantity = stock; }
	 
    
    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + ", stock="
                + quantity + "]";
    }
}

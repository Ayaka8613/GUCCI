package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

						
@Entity
@Table(name="products")
public class ProductEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable =false)
	private Long id;
	
	@Column(nullable =false)
	private String name;
	
	@Column(nullable =false)
	private int price;
	
	public Long getId(){return id;}
	public void setId(Long id) {this.id=id;}
	
	public String getName() {return name;}
	public void setName(String name) {this.name=name;}
	
	public int getPrice() {return price;}
	public void setPrice(int price) {this.price=price;}
}
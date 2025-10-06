package com.example.demo.form;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class ProductForm {
	@NotBlank(message="商品名は必須です")
	private String name;
	@Min(value=1,message="価格は1以上で入力")
	private int price;
	
	public String getName() {return name;}
	public void setName(String name) {this.name=name ;}
	
	public int getPrice() {return price;}
	public void setPrice(int price) {this.price=price;}
}
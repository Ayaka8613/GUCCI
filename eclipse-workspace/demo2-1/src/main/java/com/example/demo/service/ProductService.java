package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.ProductRepository;
import com.example.demo.entity.ProductEntity;
import com.example.demo.dto.ProductDto;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public String createProduct(String name,int price) {
		ProductEntity product= new ProductEntity();
		product.setName(name);
		product.setPrice(price);
		productRepository.save(product);
		return "追加しました";
	}
	public void save (ProductDto dto) {
		ProductEntity entity =new ProductEntity();
		entity.setName(dto.getName());
		entity.setPrice(dto.getPrice());
		productRepository.save(entity);
	}
    public List<ProductEntity> getAllProduct() {
        return productRepository.findAll();
        }
    }
package com.financial.service;

import java.util.List;

import com.financial.entity.Product;

public interface ProductService {
	//查询所有
	 public List<Product> getProduct();
	 
	//查询（按照ID）
	  public Product findProductById(int id);
	  
	//查询（按照名称）
	  public List<Product> findProductByName(String name);
}
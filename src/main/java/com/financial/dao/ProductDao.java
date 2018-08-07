package com.financial.dao;

import java.util.List;

import com.financial.entity.Product;

public interface ProductDao {
	//查询所有产品
	 public List<Product> getProduct();
	 
	//查询（按照ID）
	  public Product findProductById(int id);
	  
	//查询（按照名称）
	  public List<Product> findProductByName(String name); 
	
	//购买产品
	  public int insertBuyInfo(Product product);
}

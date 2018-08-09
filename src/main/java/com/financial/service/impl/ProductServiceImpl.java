package com.financial.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financial.dao.ProductDao;
import com.financial.entity.BuyInfo;
import com.financial.entity.Product;
import com.financial.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
    @Autowired
	private ProductDao productdao;
	@Override
	public List<Product> getProduct() {
		// TODO Auto-generated method stub
		List<Product> allProduct= productdao.getProduct();
		return allProduct;
	}
	@Override
	public Product findProductById(int id) {
		// TODO Auto-generated method stub
		Product product = productdao.findProductById(id);
		return product;
	}
	@Override
	public List<Product> findProductByName(String name) {
		// TODO Auto-generated method stub
		List<Product> products = productdao.findProductByName(name);
		return products;
	}
	@Override
	public int insertBuyInfo(BuyInfo buyInfo) {
		int flag = 0;
		try {
			flag =  productdao.insertBuyInfo(buyInfo);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

}

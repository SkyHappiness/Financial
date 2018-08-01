package com.ssm.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.financial.entity.Product;
import com.financial.service.ProductService;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring.xml","classpath:spring/spring-mybatis.xml"})
public class ProductTest {
	@Autowired
	private ProductService productService;
	
	@Test
	public void testgetProduct() {
		List<Product> allProduct = productService.getProduct();
		for (Product product : allProduct) {
			System.out.println(product);
		}
	}
	
	@Test
	public void testfindProductById() {
		int id=1;
		Product product = productService.findProductById(id);
		System.out.println(product);
	}
	
	@Test
	public void testfindProductByName() {
		String name="余额宝";
		List<Product> Products = productService.findProductByName(name);
		for (Product product : Products) {
			System.out.println(product);
		}
	}
	
	
}

package com.financial.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.financial.entity.Product;
import com.financial.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	
	//跳转产品详情页
	@RequestMapping("toProductdetail")
	public String getprodetail() {
		return "productdetail";	
	}
	
	//购买并跳转到交易明细列表
	@RequestMapping("buyproduct")
	public String buypro(Model model,Product product) {
		
		return "";
		
	}
	
}

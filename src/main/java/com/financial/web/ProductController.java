package com.financial.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.financial.entity.Product;
import com.financial.service.ProductService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/pro")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	//列表展示
   @RequestMapping("productInfo")
   public String getUsers(@RequestParam(value="pn",defaultValue="1")Integer pn,Model model){
      //从第一条开始 每页查询五条数据
      PageHelper.startPage(pn, 5);
      List<Product> products = productService.getProduct();
      PageInfo<Product> page = new PageInfo<>(products,5);
	  model.addAttribute("pageInfo", page);
	  return "product";
	}
	
	//跳转产品详情页
	@RequestMapping("toProductdetail")
	public String getprodetail(Model model,int id) {
		Product product=productService.findProductById(id);
		model.addAttribute("detailInfo", product);
		return "productdetail";	
	}
	
	//购买并跳转到交易明细列表
	@RequestMapping("buyproduct")
	public String buypro(Model model,Product product) {
		
		return "";
		
	}
	
}

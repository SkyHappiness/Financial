package com.financial.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.financial.enmu.Status;
import com.financial.entity.BuyInfo;
import com.financial.entity.Product;
import com.financial.service.ProductService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/pro")
public class ProductController {
	@Autowired
	private ProductService productService;
	//首页
	@RequestMapping("start")
	public String getIndexPage() {
		return "index";
		
	}
	//列表展示
   @RequestMapping("productInfo")
   public String getProducts(@RequestParam(value="pn",defaultValue="1")Integer pn,Model model){
      //从第一条开始 每页查询五条数据
      PageHelper.startPage(pn, 5);
      List<Product> products = productService.getProduct();
      PageInfo<Product> page = new PageInfo<>(products,5);
	  model.addAttribute("pageInfo", page);
	  return "product";
	}
   //按产品名搜索
   @RequestMapping("searchInfo")
   public String getSearchInfo(@RequestParam(value="pn",defaultValue="1")Integer pn,Model model,String productName){
	  PageHelper.startPage(pn, 5); 
	  List<Product> searchProducts=productService.findProductByName(productName);
	  PageInfo<Product> searchPage = new PageInfo<>(searchProducts,5);
	  model.addAttribute("pageInfo", searchPage);
	  return "product";	   
   }
   
	
	//跳转产品详情页
	@RequestMapping("toProductdetail")
	public String getprodetail(Model model,int id) {
		Product product=productService.findProductById(id);
		model.addAttribute("detailInfo", product);
		return "productdetail";	
	}
	
	//跳到购买页面
		@RequestMapping("toBuyPro")
	    public String toBuyPro(int id,Model model){
			model.addAttribute("product", productService.findProductById(id));         
	        return "buyPro";
	    }
	//购买并跳转到交易明细列表
	@RequestMapping(value = "buyProduct", method = RequestMethod.POST)
	@ResponseBody
	public int buypro(Model model,BuyInfo buyInfo) {
		int status = Status.FAIL.getCode();
		if(buyInfo==null){
			return Status.FAIL.getCode();
		}
		try {
			status = productService.insertBuyInfo(buyInfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
}

package com.financial.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.financial.entity.BuyInfo;
import com.financial.entity.Product;
import com.financial.entity.ProfileInfo;
import com.financial.service.BuyInfoService;
import com.financial.service.ProfileService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/per")
public class PersonalController {
 
	@Autowired
	private BuyInfoService buyInfoService;
	@Autowired
	private ProfileService profileservice;
	
	
	@RequestMapping("personalInfo")
	public String getpersonalInfo(Model model) {
		int buyMoney=buyInfoService.getBuyMoney();
		model.addAttribute("buyMoney", buyMoney);
		return "personal";	
	}
	
	@RequestMapping("toProfileDetail")
    public String toProfileDetail(@RequestParam(value="pn",defaultValue="1")Integer pn,Model model){
		PageHelper.startPage(pn, 5);
		 List<ProfileInfo> profileInfo =profileservice.getProfileInfo();
		 PageInfo<ProfileInfo> page = new PageInfo<>(profileInfo,5);
		 model.addAttribute("pageInfo", page); 
		 
		 double allprofileMoney=profileservice.getallprofileMoney();
		 model.addAttribute("allprofileMoney", allprofileMoney); 
		 
		 double allyesterdayMoney=profileservice.getallyesterdayMoney();
		 model.addAttribute("allyesterdayMoney", allyesterdayMoney); 
         return "profile";
    }
	
	@RequestMapping("toTransDetail")
    public String toTransDetail(@RequestParam(value="pn",defaultValue="1")Integer pn,Model model){
		PageHelper.startPage(pn, 5);
	    List<BuyInfo> buyInfo = buyInfoService.getBuyInfo();
	    PageInfo<BuyInfo> page = new PageInfo<>(buyInfo,5);
		model.addAttribute("pageInfo", page); 
        return "transdetail";
    }
	
}

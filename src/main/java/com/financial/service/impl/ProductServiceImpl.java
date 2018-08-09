package com.financial.service.impl;

import java.text.ParseException;
import java.util.Date;
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
			Product product = productdao.findProductById(buyInfo.getProductId());
			Date endTime = getEndTime(buyInfo.getStartTime(), product.getTimeLong());
			buyInfo.setEndTime(endTime);
			flag =  productdao.insertBuyInfo(buyInfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	/**
	 * 获取结束时间
	 * @param date
	 * @return
	 * @throws ParseException 
	 */
	private static Date getEndTime(Date date,int timeLong) throws ParseException{
		long addTime = timeLong;		//以1为乘以的基数
		addTime *= 1;			//1天以后，如果是30天以后则这里是30
		addTime *= 24;			//1天24小时
		addTime *= 60;			//1天60分钟
		addTime *= 60;			//1天60秒钟
		addTime *= 1000;		//1秒=1000毫秒
		//用毫秒数构造新的日期
		Date endTime = new Date(date.getTime()+addTime);
		return endTime;
	}

}

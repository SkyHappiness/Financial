package com.financial.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * author: hxy
 * time:   2018-7-31
 */
public class BuyInfo {
	
	private Integer buyId;
	private Integer productId;
	private String productName;
	private Integer money;
	private Date buyTime;
	private Date startTime;
	private Date endTime;
	private Integer flag;
	private long time;
	
	
	
	public BuyInfo() throws ParseException {
		this.buyTime = new Date();
		this.startTime = getNextDate(new Date());
		this.flag = 1;
		this.time=System.currentTimeMillis();
	}
	public Integer getBuyId() {
		return buyId;
	}
	public void setBuyId(Integer buyId) {
		this.buyId = buyId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getMoney() {
		return money;
	}
	public void setMoney(Integer money) {
		this.money = money;
	}
	public Date getBuyTime() {
		return buyTime;
	}
	public void setBuyTime(Date buyTime) {
		this.buyTime = buyTime;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Integer getFlag() {
		return flag;
	}
	public void setFlag(Integer flag) {
		this.flag = flag;
	}
	
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "BuyInfo [buyId=" + buyId + ", productId=" + productId + ", productName=" + productName + ", money="
				+ money + ", buyTime=" + buyTime + ", startTime=" + startTime + ", endTime=" + endTime + ", flag="
				+ flag + ", time=" + time + "]";
	}
	
	/**
	 * 获取下一天时间
	 * @param date
	 * @return
	 * @throws ParseException 
	 */
	private static Date getNextDate(Date date) throws ParseException{
		long addTime = 1;		//以1为乘以的基数
		addTime *= 1;			//1天以后，如果是30天以后则这里是30
		addTime *= 24;			//1天24小时
		addTime *= 60;			//1天60分钟
		addTime *= 60;			//1天60秒钟
		addTime *= 1000;		//1秒=1000毫秒
		//用毫秒数构造新的日期
		Date nextDate = new Date(date.getTime()+addTime);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String startTimeString = sdf.format(nextDate) + " 08:00:00";
		Date startTime = sdf2.parse(startTimeString);
		return startTime;
	}
	
	
	
}

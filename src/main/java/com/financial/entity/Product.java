package com.financial.entity;
/*
 * author: hxy
 * time:   2018-7-31
 */
public class Product {
	
	private Integer id;
	private String name;
	private Double yearPro;
	private Double dayPro;
	private Integer timeLong;
	private String buyInfo;
	private String saleInfo;
	private Integer buyMax;
	private Integer flag;
	
	
	public Product() {
		this.flag = 1;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getYearPro() {
		return yearPro;
	}
	public void setYearPro(Double yearPro) {
		this.yearPro = yearPro;
	}
	public Double getDayPro() {
		return dayPro;
	}
	public void setDayPro(Double dayPro) {
		this.dayPro = dayPro;
	}
	public Integer getTimeLong() {
		return timeLong;
	}
	public void setTimeLong(Integer timeLong) {
		this.timeLong = timeLong;
	}
	public String getBuyInfo() {
		return buyInfo;
	}
	public void setBuyInfo(String buyInfo) {
		this.buyInfo = buyInfo;
	}
	public String getSaleInfo() {
		return saleInfo;
	}
	public void setSaleInfo(String saleInfo) {
		this.saleInfo = saleInfo;
	}
	public Integer getBuyMax() {
		return buyMax;
	}
	public void setBuyMax(Integer buyMax) {
		this.buyMax = buyMax;
	}
	public Integer getFlag() {
		return flag;
	}
	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", yearPro=" + yearPro + ", dayPro=" + dayPro + ", timeLong="
				+ timeLong + ", buyInfo=" + buyInfo + ", saleInfo=" + saleInfo + ", buyMax=" + buyMax + ", flag=" + flag
				+ "]";
	}
	
	
	
}

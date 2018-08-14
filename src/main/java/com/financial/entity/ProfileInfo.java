package com.financial.entity;

/*
 * author: hxy
 * time:   2018-7-31
 */
public class ProfileInfo {

	private Integer profileId;
	private Integer profileProId;
	private String profileProName;
	private Integer buyMoney;
	private Double profileYesterday;
	private Double profileMoney;
	private Integer flag;
	private long time;
	
	//扩展属性
	private Double dayPro;

	public ProfileInfo() {
		this.flag = 1;
	}

	public Integer getProfileId() {
		return profileId;
	}

	public void setProfileId(Integer profileId) {
		this.profileId = profileId;
	}

	public Integer getProfileProId() {
		return profileProId;
	}

	public void setProfileProId(Integer profileProId) {
		this.profileProId = profileProId;
	}

	public String getProfileProName() {
		return profileProName;
	}

	public void setProfileProName(String profileProName) {
		this.profileProName = profileProName;
	}
	
	public Integer getBuyMoney() {
		return buyMoney;
	}

	public void setBuyMoney(Integer buyMoney) {
		this.buyMoney = buyMoney;
	}
	public Double getprofileYesterday() {
		return profileYesterday;
	}

	public void setProfileYestoday(Double profileYesterday) {
		this.profileYesterday = profileYesterday;
	}
	
	public Double getProfileMoney() {
		return profileMoney;
	}

	public void setProfileMoney(Double profileMoney) {
		this.profileMoney = profileMoney;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}


	public Double getDayPro() {
		return dayPro;
	}

	public void setDayPro(Double dayPro) {
		this.dayPro = dayPro;
	}
	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "ProfileInfo [profileId=" + profileId + ", profileProId=" + profileProId + ", profileProName="
				+ profileProName + ", buyMoney=" + buyMoney + ", profileYesterday=" + profileYesterday
				+ ", profileMoney=" + profileMoney + ", flag=" + flag + ", dayPro=" + dayPro + ", time=" + time + "]";
	}


	
	

	

	

}

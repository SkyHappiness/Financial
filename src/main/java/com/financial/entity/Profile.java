package com.financial.entity;

/*
 * author: hxy
 * time:   2018-7-31
 */
public class Profile {
	
	private Integer profileId;
	private Integer profileProId;
	private String profileProName;
	private Double profileMoney;
	private Integer flag;
	
	public Profile() {
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
	@Override
	public String toString() {
		return "Profile [profileId=" + profileId + ", profileProId=" + profileProId + ", profileProName="
				+ profileProName + ", profileMoney=" + profileMoney + ", flag=" + flag + "]";
	}
	
	
}

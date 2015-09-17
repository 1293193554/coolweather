package com.zxk.coolweather_model;

public class Province {
private int id;
private String provinceName;
private String provinceCode;
private int cityId;

	public int getId() {
	return id;
}

	public void setId(int id) {
	this.id = id;
}

	public String getProvinceName() {
	return provinceName;
}

	public void setProvinceName(String provinceName) {
	this.provinceName = provinceName;
}

	public String getProvinceCode() {
	return provinceCode;
}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	
}

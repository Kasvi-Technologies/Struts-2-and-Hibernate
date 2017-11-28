package com.comvivaapp.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer {

	private String customerId;
	private String userName;
	private String password;
	private String gender;
	private String address;
	private String country;
	private List hobbies = new ArrayList();
	private Date createdDate;
	private String hobbiesStr;
	
	public String getHobbiesStr() {
		String str = "";
		for (int i = 0; i< hobbies.size(); i++){
			str = str + hobbies.get(i) + ",";
		}
		return str;
	}

	public void setHobbiesStr(String hobbiesStr) {
		this.hobbiesStr = hobbiesStr;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}



	private boolean flag;
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}


	//needs to have setter and getter methods...
	//generate setters and getters using eclipse feature
	
	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List getHobbies() {
		return hobbies;
	}

	public void setHobbies(List hobbies) {
		this.hobbies = hobbies;
	}




	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}

	
}

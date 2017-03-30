package com.webapp.model;

import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.StringLengthFieldValidator;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;

public class Customer {
	private String ID;
	private String Name;
	private String CustomerNo;
	private String DistrictID;
	private String WardID;
	private String ProvinceID;
	private String Street;
	private String AddressNo;
	private String TaxNo;
	private String createdUser;
	private String createdDate;
	private String modifiedUser;
	private String modifiedDate;
	private String status;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCustomerNo() {
		return CustomerNo;
	}
	public void setCustomerNo(String customerNo) {
		CustomerNo = customerNo;
	}
	public String getDistrictID() {
		return DistrictID;
	}
	public void setDistrictID(String districtID) {
		DistrictID = districtID;
	}
	public String getWardID() {
		return WardID;
	}
	public void setWardID(String wardID) {
		WardID = wardID;
	}
	public String getProvinceID() {
		return ProvinceID;
	}
	public void setProvinceID(String provinceID) {
		ProvinceID = provinceID;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getAddressNo() {
		return AddressNo;
	}
	public void setAddressNo(String addressNo) {
		AddressNo = addressNo;
	}
	public String getTaxNo() {
		return TaxNo;
	}
	public void setTaxNo(String taxNo) {
		TaxNo = taxNo;
	}
	public String getCreatedUser() {
		return createdUser;
	}
	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getModifiedUser() {
		return modifiedUser;
	}
	public void setModifiedUser(String modifiedUser) {
		this.modifiedUser = modifiedUser;
	}
	public String getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}

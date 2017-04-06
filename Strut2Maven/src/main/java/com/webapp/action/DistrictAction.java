package com.webapp.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpRequest;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.webapp.model.BaseModel;
import com.webapp.model.Customer;
import com.webapp.service.CustomerService;
import com.webapp.util.Constant;
import com.webapp.util.DbUtil;

public class DistrictAction extends ActionSupport {
	/**
	* 
	*/

	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		return Action.SUCCESS;
	}

	private String province;
	private String district;
	private List<BaseModel> ListDistricts;
	private List<BaseModel> ListProvince;
	private List<BaseModel> ListWard;
	
	public String getProvince() {
		return province;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public List<BaseModel> getListDistricts() {
		return ListDistricts;
	}

	public void setListDistricts(List<BaseModel> listDistricts) {
		ListDistricts = listDistricts;
	}

	public List<BaseModel> getListProvince() {
		return ListProvince;
	}

	public void setListProvince(List<BaseModel> listProvince) {
		ListProvince = listProvince;
	}
	

	public String actionGetListProvince()
	{
		CustomerService cusService = new CustomerService();
		setListProvince(cusService.ListProvinces(""));
		return Action.SUCCESS;
	}
	
	public String actionGetListDistrict()
	{
		CustomerService cusService = new CustomerService();
		setListDistricts(cusService.ListDistricts(this.province));
		return Action.SUCCESS;
	}

	public List<BaseModel> getListWard() {
		return ListWard;
	}

	public void setListWard(List<BaseModel> listWard) {
		ListWard = listWard;
	}
	public String actionGetListWard()
	{
		CustomerService cusService = new CustomerService();
		setListWard(cusService.ListWard(this.district));
		return Action.SUCCESS;
	}

}
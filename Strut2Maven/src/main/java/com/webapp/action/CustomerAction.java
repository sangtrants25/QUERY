package com.webapp.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpRequest;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.webapp.model.Customer;
import com.webapp.service.CustomerService;
import com.webapp.util.Constant;
import com.webapp.util.DbUtil;

public class CustomerAction extends ActionSupport {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {

		CustomerService cusService = new CustomerService();
		HttpServletRequest request = ServletActionContext.getRequest();
		setAction(request.getParameter("action"));

		if (getAction().equalsIgnoreCase(Constant.TYPE_NEW)) { 
			/* action new */
			setCustomer(new Customer());
			getCustomer().setID(DbUtil.createID());
			return "NEW";
			
		} else if (getAction().equalsIgnoreCase("CREATE")) {
			/* action create */
			if (cusService.create(Cus)) {
				setActionForwardURL("home");
				return "actionForward";
			} else {
				return "NEW";
			}

		} else if (getAction().equalsIgnoreCase(Constant.TYPE_UPDATE)) {	
			/* action update */
			return "UPDATE";
		} else if (getAction().equalsIgnoreCase(Constant.TYPE_VIEW)) {		
			/* action view */
			return "VIEW";
		} else {
			return SUCCESS;
		}

	}

	private Customer Cus;
	private List<String> ListString;

	private boolean checkbox;
	private String action;
	private String actionForwardURL;

	public Customer getCustomer() {
		return Cus;
	}

	public void setCustomer(Customer cus) {
		this.Cus = cus;
	}

	public boolean getCheckbox() {
		return checkbox;
	}

	public void setCheckbox(boolean checkbox) {
		this.checkbox = checkbox;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getActionForwardURL() {
		return actionForwardURL;
	}

	public void setActionForwardURL(String actionForwardURL) {
		this.actionForwardURL = actionForwardURL;
	}
	
	public CustomerAction(){
		ListString = new ArrayList<String>();
	}

	public List<String> getListString() {
		return ListString;
	}

	public void setListString(List<String> listString) {
		ListString = listString;
	}
 
}

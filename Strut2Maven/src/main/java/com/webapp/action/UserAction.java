package com.webapp.action;
import com.opensymphony.xwork2.ActionSupport;
import com.webapp.model.User;
import com.webapp.service.UserService;
import com.webapp.util.Constant;

public class UserAction extends ActionSupport{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	  public String execute() throws Exception {
		  if(getType().equals(Constant.TYPE_NEW)){
			  return ERROR;
		  }else if(getType().equals(Constant.TYPE_UPDATE)){
			  UserService userService = new UserService();
			  return SUCCESS;
		  } else{
			  return SUCCESS;
		  }
	      
	  }
	private User user;
	private boolean checkbox;
	private String type;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public boolean getCheckbox() {
		return checkbox;
	}
	public void setCheckbox(boolean checkbox) {
		this.checkbox = checkbox;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}

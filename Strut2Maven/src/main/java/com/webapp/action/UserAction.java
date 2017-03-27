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
		  if(getAction().equals(Constant.TYPE_NEW)){
			  return "NEW";
		  }else if(getAction().equals(Constant.TYPE_UPDATE)){
			  UserService userService = new UserService();
			  return "UPDATE";
		  } else if(getAction().equals(Constant.TYPE_VIEW)){
			  return "VIEW";
		  } else{
			  return SUCCESS;
		  }
	      
	  }
	private User user;
	private boolean checkbox;
	private String action;
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
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
}

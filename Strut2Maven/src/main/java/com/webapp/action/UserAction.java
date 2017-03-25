package com.webapp.action;
import com.opensymphony.xwork2.ActionSupport;
import com.webapp.model.User;
import com.webapp.service.UserService;

public class UserAction extends ActionSupport{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	  public String execute() throws Exception {
	      /*String result = "";
	      UserService studentService = new UserService();*/
	      return SUCCESS;
	  }
	private User user;
	private boolean checkbox;
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
	
}

package com.webapp.action;
import com.opensymphony.xwork2.ActionSupport;
import com.webapp.model.User;
import com.webapp.service.UserService;
import com.webapp.util.Constant;
import com.webapp.util.DbUtil;

public class UserAction extends ActionSupport{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	  public String execute() throws Exception {
		  UserService userService = new UserService();
		  setAction("NEW");
		  if(getAction().equalsIgnoreCase(Constant.TYPE_NEW)){
			  setUser( new User());
			  getUser().setId(DbUtil.createID());
			  return "NEW";
		  }else if(getAction().equalsIgnoreCase(Constant.TYPE_UPDATE)){
			  return "UPDATE";
		  } else if(getAction().equalsIgnoreCase(Constant.TYPE_VIEW)){
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

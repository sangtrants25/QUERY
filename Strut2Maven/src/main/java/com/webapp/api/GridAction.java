package com.webapp.api;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.json.JSONObject;

import com.opensymphony.xwork2.ActionSupport;
import com.webapp.model.User;
import com.webapp.service.UserService;

public class GridAction extends ActionSupport {
	  /**
	   * 
	   */
	  private static final long serialVersionUID = -6556691584844438756L;

	  public GridAction () {
	      super();
	  }
	  
	  public String execute() throws java.io.IOException, javax.servlet.ServletException {
	      HttpServletRequest request = ServletActionContext.getRequest();
	      HttpServletResponse response = ServletActionContext.getResponse();
	      if(1==1){
	    	  Map<String, String> map = new HashMap<String, String>();
	    	  JSONObject json = new JSONObject();
	    	  UserService userService = new UserService();
	    	  List<User> list = userService.listAll();
	    	  
	    	  for(int i=0; i< list.size(); i++){
	  			map.put("id", list.get(i).getId());
	  			map.put("name", list.get(i).getName());
	  			map.put("email", list.get(i).getEmail());
	  			map.put("password", list.get(i).getPassword());
	  			map.put("createdDate", list.get(i).getCreatedDate());
	  			map.put("modifiedDate", list.get(i).getModifiedDate());
	    		map.put("Status", list.get(i).getStatus());
	    	  }
	    	  
	    	  json.append("", JSONObject.wrap(map));
	          PrintWriter writer = response.getWriter();
	          response.setContentType("text/plain");
	          String temp = json.toString();
	          if ( !"".equals(temp)) {
	              writer.print(temp);
	          } else {
	              writer.print("");
	          }
	      } else {
	          //403 Forbidden; not logged in.
	          response.sendError(403, "Not logged in.");
	      }
	      return(null);
	  }
	}
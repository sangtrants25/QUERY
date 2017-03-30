package com.webapp.api;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;
import com.webapp.service.UserService;

public class UserFindAPIAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String jsonString;

    public String execute() {
    	UserService userService = new UserService();
        /*Gson gson = new Gson();
       
        jsonString = gson.toJson(userService.listAll());*/
        
        Gson gson                    = new Gson();
        String jsonString            = gson.toJson(userService.listAll());
        HttpServletResponse response = ServletActionContext.getResponse();

        response.setContentType("text/plain");
        try {
			response.getWriter().write(jsonString );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        return null;
        
        //System.out.println(jsonString);
        //return "success";
    }
    public String getJsonString() {
        return jsonString;
    }

    public void setJsonString(String jsonString) {
        this.jsonString = jsonString;
    }

}

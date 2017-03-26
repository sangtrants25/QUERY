package com.webapp.api;

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
        Gson gson = new Gson();
        UserService userService = new UserService();
        jsonString = gson.toJson(userService.listAll());
        return "success";
    }
    public String getJsonString() {
        return jsonString;
    }

    public void setJsonString(String jsonString) {
        this.jsonString = jsonString;
    }

}

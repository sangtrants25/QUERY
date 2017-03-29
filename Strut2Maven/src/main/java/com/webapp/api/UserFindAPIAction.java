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
        /*JSONObject json = new JSONObject();
        Map<String, String> map = new HashMap<String, String>();

        map.put("SeqNo", (frmAssign.getSeqNo()) + "+" + (frmAssign.getRepName()));
        map.put("txtOfficerBadge", tmp.readFieldData("txtOfficerBadge"));
        map.put("txtOfficerName", tmp.readFieldData("txtOfficerName"));
        map.put("AgencyName", frmAssign.getAgencyName());
        map.put("txtDateAssigned", DateUtility.createDate(frmAssign.getTxtDateAssigned()));
        map.put("txtDateRelease", DateUtility.createDate(frmAssign.getTxtDateRelease()));
        map.put("txtAssignStatus", frmAssign.getTxtAssignStatus());
        map.put("txtCaseNextRevDate", DateUtility.createDate(frmAssign.getTxtCaseNextRevDate()));

        return json;*/
        System.out.println(jsonString);
        return "success";
    }
    public String getJsonString() {
        return jsonString;
    }

    public void setJsonString(String jsonString) {
        this.jsonString = jsonString;
    }

}

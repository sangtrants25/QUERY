package com.webapp.model;

import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.StringLengthFieldValidator;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;

public class User {
	private String id;
	private String name;
	private String password;
	private String email;
	private String createdUser;
	private String createdDate;
	private String modifiedUser;
	private String modifiedDate;
	private String status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@RequiredStringValidator(type = ValidatorType.FIELD, message = "UserName is a required field")
	@StringLengthFieldValidator(type = ValidatorType.FIELD, maxLength = "12", minLength = "6", message = "UserName must be of length between 6 and 12")
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	@RequiredStringValidator(type = ValidatorType.FIELD, message = "password is a required field")
	@StringLengthFieldValidator(type = ValidatorType.FIELD, maxLength = "12", minLength = "6", message = "password must be of length between 6 and 12")
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	@RequiredStringValidator(type = ValidatorType.FIELD, message = "EmailAddress is a required field")
	@EmailValidator(type = ValidatorType.FIELD, message = "Email Address must be valid")
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCreatedUser() {
		return createdUser;
	}
	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getModifiedUser() {
		return modifiedUser;
	}
	public void setModifiedUser(String modifiedUser) {
		this.modifiedUser = modifiedUser;
	}
	public String getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}

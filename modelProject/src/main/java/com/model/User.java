package com.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
	
	@JsonProperty("_id")
	private String id;
	@JsonProperty("lastname")
	private String lastname;
	@JsonProperty("firstname")
	private String firstname;
	@JsonProperty("email")
	private String email;
	@JsonProperty("logId")
	private String logId;
	@JsonProperty("userId")
	private String userId;
	@JsonProperty("__v")
	private Integer v;
	@JsonProperty("failedLogin")
	private List<Object> failedLogin = null;
	@JsonProperty("loggedIn")
	private Boolean loggedIn;
	@JsonProperty("status")
	private String status;
	@JsonProperty("norm")
	private String norm;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogId() {
		return logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getV() {
		return v;
	}

	public void setV(Integer v) {
		this.v = v;
	}

	public List<Object> getFailedLogin() {
		return failedLogin;
	}

	public void setFailedLogin(List<Object> failedLogin) {
		this.failedLogin = failedLogin;
	}

	public Boolean getLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(Boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNorm() {
		return norm;
	}

	public void setNorm(String norm) {
		this.norm = norm;
	}


}

package com.bitcamp.op.member.service;

public class LoginRequest {

	private String id;
	private String password;

	public LoginRequest() {
	}

	public LoginRequest(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}

	public String getid() {
		return id;
	}

	public void setid(String id) {
		this.id = id;
	}

	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginRequest [id=" + id + ", password=" + password + "]";
	}

	
	
}

package com.bitcamp.op.member.controller;

public class RegiInfo {
	private String id;
	private String password;
	private String name;
	private String birth1;
	private String birth2;
	private String birth3;
	private String gender;
	private String checkemail;
	private String phone;
	
	
	
	
	public RegiInfo() {}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth1() {
		return birth1;
	}
	public void setBirth1(String birth1) {
		this.birth1 = birth1;
	}
	public String getBirth2() {
		return birth2;
	}
	public void setBirth2(String birth2) {
		this.birth2 = birth2;
	}
	public String getBirth3() {
		return birth3;
	}
	public void setBirth3(String birth3) {
		this.birth3 = birth3;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCheckemail() {
		return checkemail;
	}
	public void setCheckemail(String checkemail) {
		this.checkemail = checkemail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "RegiInfo [id=" + id + ", password=" + password + ", name=" + name + ", birth1=" + birth1 + ", birth2="
				+ birth2 + ", birth3=" + birth3 + ", gender=" + gender + ", checkemail=" + checkemail + ", phone="
				+ phone + "]";
	}
}

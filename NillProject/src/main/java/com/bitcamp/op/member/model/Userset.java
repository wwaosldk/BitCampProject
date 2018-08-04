package com.bitcamp.op.member.model;

import org.springframework.web.multipart.MultipartFile;

public class Userset {
	
	private int mIdx;
	private String id;
	private String password;
	private String name;
	private String birth1;
	private String birth2;
	private String birth3;
	private String birth;
	private String gender;
	private String checkemail;
	private String phone;
	// 파일 업로드 처리를 위한 변수
	private MultipartFile photoFile;
	// DB 데이터 입력을 위한 변수 
	private String memberPhoto;
	
	
	

	public int getmIdx() {
		return mIdx;
	}
	public void setmIdx(int mIdx) {
		this.mIdx = mIdx;
	}
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
	public String getBirth() {
		birth= birth1+"년"+birth2+"월"+birth3+"일";
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
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
	public MultipartFile getPhotoFile() {
		return photoFile;
	}
	public void setPhotoFile(MultipartFile photoFile) {
		this.photoFile = photoFile;
	}
	public String getMemberPhoto() {
		return memberPhoto;
	}
	public void setMemberPhoto(String memberPhoto) {
		this.memberPhoto = memberPhoto;
	}
	
	public boolean isMatchPassword(String pw) {

		return password.equals(pw) ? true : false;
	}

	@Override
	public String toString() {
		return "Userset [mIdx=" + mIdx + ", id=" + id + ", password=" + password + ", name=" + name + ", birth1="
				+ birth1 + ", birth2=" + birth2 + ", birth3=" + birth3 + ", birth=" + birth + ", gender=" + gender
				+ ", checkemail=" + checkemail + ", phone=" + phone + ", photoFile=" + photoFile + ", memberPhoto="
				+ memberPhoto + "]";
	}
	


}

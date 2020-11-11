package com.session;

public class User {

	//은닉 클래스
	private String id;
	private String pw;
	private String name;
	private String birth;
	
	
	public User() {}

	
	public User(String id, String pw, String name, String birth) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.birth = birth;
	}
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + ", name=" + name + ", birth=" + birth + "]";
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBirth() {
		return birth;
	}


	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	
	
	
	
	
}

package com.seeyon.vo;

public class Person {
	
	private String name;
	
	private int id;
	
	private String pwd;
	
	public Person(String name,String pwd) {
		this.name=name;
		this.pwd=pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}


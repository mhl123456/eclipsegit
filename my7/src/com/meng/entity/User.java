package com.meng.entity;
//用户类123
public class User {
//45465465465465
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [age=" + age + ", " + (name != null ? "name=" + name : "") + "]";
	}
	
	
	
}

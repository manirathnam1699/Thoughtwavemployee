package com.example.demo;

public class StdentModel {
private Long id;
private String name;
private String password;

private Long phonenumber;
public Long getPhonenumber() {
	return phonenumber;
}


public void setPhonenumber(Long phonenumber) {
	this.phonenumber = phonenumber;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public StdentModel() {
	super();
	// TODO Auto-generated constructor stub
}

public StdentModel(Long id, String name, String password) {
	super();
	this.id = id;
	this.name = name;
	this.password = password;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

@Override

public String toString() {
	return "StdentModel [id=" + id + ", name=" + name + ", password=" + password + "]";
}
}

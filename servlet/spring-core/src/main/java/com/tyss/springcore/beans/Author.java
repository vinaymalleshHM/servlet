package com.tyss.springcore.beans;

import org.springframework.stereotype.Component;

@Component
public class Author {
	
// private String name;
// private String penName;
	private String name = "venki test yantra";
	private String penName = "Meow";
 
 public Author() {}
 
public Author(String name, String penName) {
	super();
	this.name = name;
	this.penName = penName;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPenName() {
	return penName;
}
public void setPenName(String penName) {
	this.penName = penName;
}
 
}

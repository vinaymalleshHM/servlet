package com.tyss.springcore.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Book implements Serializable{
	
	public Book() {}
	
	public Book(String bName, Author author) {
		this.bName = bName;
		this.author = author;
	}


//	private String bName;
	private String bName = "prince" ;
	@Autowired
	private Author author;
	
	
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
	

}

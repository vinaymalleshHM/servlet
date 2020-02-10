package com.tyss.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springcore.beans.Book;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("book.xml");
		Book book = context.getBean(Book.class);
		System.out.println(book.getbName());
		System.out.println(book.getAuthor().getName());
		System.out.println(book.getAuthor().getPenName());
		
	}

}

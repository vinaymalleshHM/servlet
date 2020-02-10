package com.tyss.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tyss.springcore.beans.Book;
import com.tyss.springcore.config.BookConfig;

public class AnnotationconfigBookApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BookConfig.class);
		Book book = context.getBean(Book.class);
		System.out.println(book.getbName());
		System.out.println(book.getAuthor().getName());
		System.out.println(book.getAuthor().getPenName());
	}

}

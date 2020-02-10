package com.tyss.springcore;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tyss.springcore.beans.Author;
import com.tyss.springcore.beans.Book;
import com.tyss.springcore.config.BookComponentConfig;

public class AnnotationBookComponentScannApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BookComponentConfig.class);
		Author author = context.getBean(Author.class);
		System.out.println(author.getName());
		System.out.println(author.getPenName());
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*");
		
		Book book = context.getBean(Book.class);
		System.out.println(book.getbName());
		System.out.println(book.getAuthor().getName());
		System.out.println(book.getAuthor().getPenName());
		
		
	}

}

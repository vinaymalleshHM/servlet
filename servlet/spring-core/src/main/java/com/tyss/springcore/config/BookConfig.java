package com.tyss.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tyss.springcore.beans.Author;
import com.tyss.springcore.beans.Book;

@Configuration
public class BookConfig {
	@Bean
	public Book getBook() {
//		Book book = new Book();
//		
//		book.setbName("game");
//		book.setAuthor(getAuthor());
		
		Book book = new Book("venki",getAuthor());
		return book;
		
	}
	@Bean
	public Author getAuthor() {
//		Author author = new Author();
//		author.setName("venki test yantra");
//		author.setPenName("meow");
		
		Author author = new Author("yantra","ryban");
		return author;
		
	}

}

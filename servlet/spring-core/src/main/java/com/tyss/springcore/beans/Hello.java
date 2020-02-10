package com.tyss.springcore.beans;

import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
@Component
public class Hello implements InitializingBean,DisposableBean{
	
	public  Hello() {
		System.out.println("Hello Object Created");
	}
	
	public  Hello(String message ) {
		System.out.println(message);
		
	}
	
	private Map<Integer, String> map;
	
	private List<Integer> list;
	
	private String message;

	
	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

	public Map<Integer, String> getMap() {
		return map;
	}

	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init method");
	}
	 
	@PreDestroy // while typing we may make mistake in a method name so better way to avoid use annotations
	public void destroy() {
		System.out.println("destroy method");
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet method");
		
	}
	

}

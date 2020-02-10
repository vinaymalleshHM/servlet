package com.tyss.springcore.config;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.tyss.springcore.beans.BeanFactoryPostProcesserImpl;
import com.tyss.springcore.beans.BeanPostProcesserImpl;
import com.tyss.springcore.beans.Cat;
import com.tyss.springcore.beans.Dog;
import com.tyss.springcore.beans.Hello;
import com.tyss.springcore.beans.Pet;

@Configuration // is equals configuration file
public class BeansConfog {
	
	@Bean(name="hello"
//			initMethod = "init",destroyMethod = "destroy" // if u don' want to type use anotation
			)
	@Scope("prototype")
	public Hello getHello() {
		Hello hello = new Hello();
		hello.setMessage("I Love Spring");
		return hello;
	}
	
	@Bean("beanFactoryPostProcessor")
	public BeanFactoryPostProcessor getBeanFactoryPostProcessor() {
		return new BeanFactoryPostProcesserImpl();
	}
	@Bean("beanPostProcessor")
	public BeanPostProcessor getBeanPostProcessor() {
		return new  BeanPostProcesserImpl();
		
	}
	
	@Bean("dog")
	public Dog  getDog() {
		return new Dog();
		
	}
	
	@Bean("cat")
	@Primary
	public Cat getCat() {
		return new Cat();
		
	}
	
	// i commented whole  bcz we already making @component as Pet and here wr are doing again bean so we get exception so 
	/*
	 * @Bean public Pet getPet() { // Pet pet = new Pet("rana",getDog());
	 * 
	 * // Pet pet = new Pet(); // pet.setName("Raja"); // pet.setAnimal(getDog());
	 * //here it's not creating new god object it will return existing object
	 * 
	 * Pet pet = new Pet(); pet.setName("Raja"); // pet.setAnimal(getDog()) return
	 * pet;
	 * 
	 * }
	 */

}

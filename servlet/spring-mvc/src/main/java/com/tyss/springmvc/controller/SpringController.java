package com.tyss.springmvc.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tyss.springmvc.beans.User;
@Controller
public class SpringController {

//	@RequestMapping("/hello")
//	public String hellow(ModelMap map) {
//		map.addAttribute("msg", "Hellow ... World...");
//				return "index";
////		return "/WEB-INF/view/index.jsp"; //we can do like this comment bean 
//	}
	
	@RequestMapping("/hello")
	public ModelAndView hellow() {
		ModelAndView map = new ModelAndView();
		map.setViewName("index");
		map.addObject("msg", "Hellow World..!!!!");
		return map; //we can do like this comment bean 
	}

	//	@RequestMapping(path = "/query")
	@GetMapping("/query")
	//	public String query(@RequestParam(name="name",required = false)String name,@RequestParam("age")int age,ModelMap map) {// if u  want to do optional any parameter required= false  
	//	public String query(@RequestParam(name="name",required = false)String name,@RequestParam(name="age",required = false)int age,ModelMap map) { 	//exception int is primitive type to overcome use Wrapper Class
	public String query(@RequestParam(name="name",required = false)String name,@RequestParam(name="age",required = false)Integer age,ModelMap map) {
		map.addAttribute("name", name);
		map.addAttribute("age", age);
		return "query";

	}

	@GetMapping("/form")
	public String form() {
		return "form";

	}

//	@PostMapping("/form")
//	public String form(String name,String email,String password,long mobNo ,ModelMap map) {
//		map.addAttribute("name", name);
//		map.addAttribute("email", email);
//		map.addAttribute("password", password);
//		map.addAttribute("mobile", mobNo);
//
//		return "form-data";
//
//	}
	
	@PostMapping("/form")
	public String form(User user ,ModelMap map) {
		map.addAttribute("name", user.getName());
		map.addAttribute("email", user.getEmail());
		map.addAttribute("password", user.getPassword());
		map.addAttribute("mobile", user.getMobNo());

		return "form-data";

	}
	
	@GetMapping("/path/{name}")
	public String path(@PathVariable("name")String name ,ModelMap map) {
		map.addAttribute("name", name);
		return "path";
		
	}
	
	@GetMapping("/create-cookie")
	public String createCookie(HttpServletResponse response) {
		Cookie cookie = new  Cookie("name", "AlluArjun");
		cookie.setMaxAge(60*60*24*365);
		response.addCookie(cookie);
		return "create-cookie";
		
	}
	
	@GetMapping("/read-cookie")
//	public String readCookie(@CookieValue("name") String name, ModelMap map) { //mandatory
	public String readCookie(@CookieValue(name ="name",required = false) String name, ModelMap map) {
	map.addAttribute("name", name);
		return "read-cookie";
		
	}
	
	@GetMapping("/forward")
	public String forward() {
		return "forward:hello";
		
	}
	
	@GetMapping("/redirect")
	public String redirect() {
		return "redirect:http://www.google.com";
		
	}
	
	

}

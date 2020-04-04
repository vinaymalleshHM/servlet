package com.tyss.springsecurityrest.filters;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.MediaType;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tyss.springsecurityrest.bean.UserBean;

public class CustomUsernamePasswordAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
	private UserBean bean;
	@Override
	protected String obtainUsername(HttpServletRequest request) {
		if (request.getContentType().equals(MediaType.APPLICATION_JSON_VALUE)) {
			try {
				UserBean bean = getUserBean(request);
				return bean.getUsername();
			} catch (IOException e) {
				return "";
			}
		} else {
			return super.obtainUsername(request);
		}
	}

	@Override
	protected String obtainPassword(HttpServletRequest request) {
		if (request.getContentType().equals(MediaType.APPLICATION_JSON_VALUE)) {
			try {
				UserBean bean = getUserBean(request);
				return bean.getPassword();
			} catch (IOException e) {
				return "";
			}
		}
		return super.obtainPassword(request);
	}

	private UserBean getUserBean(HttpServletRequest request) throws IOException {
		if (bean == null) {
			ObjectMapper mapper = new ObjectMapper();
			String json = "";
			BufferedReader reader = request.getReader();
			while (reader.ready()) {
				json = json + reader.readLine();
			}
			bean = mapper.readValue(json, UserBean.class);
		}
		return bean;
	}
}

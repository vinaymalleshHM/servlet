package com.tyss.springsecurityrest;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.security.web.savedrequest.SavedRequest;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tyss.springsecurityrest.bean.UserResponce;

@Component
public class MySimpleUrlAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
	//private RequestCache requestCache = new HttpSessionRequestCache();

//	@Override
//	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
//			Authentication authentication) throws ServletException, IOException {
//
//		SavedRequest savedRequest = requestCache.getRequest(request, response);
//
//		if (savedRequest == null) {
//			clearAuthenticationAttributes(request);
//			return;
//		}
//		String targetUrlParam = getTargetUrlParameter();
//		if (isAlwaysUseDefaultTargetUrl()
//				|| (targetUrlParam != null && StringUtils.hasText(request.getParameter(targetUrlParam)))) {
//			requestCache.removeRequest(request, response);
//			clearAuthenticationAttributes(request);
//			return;
//		}
//
//		clearAuthenticationAttributes(request);
//	}
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		ObjectMapper mapper = new ObjectMapper();
		UserResponce userResponce = new UserResponce();
		userResponce.setStatusCode(201);
		userResponce.setMessage("Success");
		userResponce.setDescription("Login success");
		response.setContentType(MediaType.APPLICATION_JSON_VALUE);
		response.getWriter().write(mapper.writeValueAsString(userResponce));
		response.setStatus(200);
	}

//	public void setRequestCache(RequestCache requestCache) {
//		this.requestCache = requestCache;
//	}
}

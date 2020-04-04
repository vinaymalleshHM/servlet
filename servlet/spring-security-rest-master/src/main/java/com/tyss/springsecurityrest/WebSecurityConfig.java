package com.tyss.springsecurityrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.tyss.springsecurityrest.filters.CustomUsernamePasswordAuthenticationFilter;

@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private UserDetailsService userDetailsService;
	@Autowired
	private AuthenticationEntryPoint restAuthenticationEntryPoint;
	@Autowired
	private MySimpleUrlAuthenticationSuccessHandler successHandler;
	
	@Bean
	public SimpleUrlAuthenticationFailureHandler getSimpleUrlAuthenticationFailureHandler() {
		return new SimpleUrlAuthenticationFailureHandler();
	}
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder(12);
	}
	@Bean
	public CustomUsernamePasswordAuthenticationFilter getCustomUsernamePasswordAuthenticationFilter() throws Exception {
		CustomUsernamePasswordAuthenticationFilter filter = new CustomUsernamePasswordAuthenticationFilter();
		filter.setAuthenticationSuccessHandler(successHandler);
		filter.setAuthenticationFailureHandler(getSimpleUrlAuthenticationFailureHandler());
		//filter.setRequiresAuthenticationRequestMatcher(new AntPathRequestMatcher("/login", "POST"));
		filter.setAuthenticationManager(authenticationManager());
		return filter;
	}
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(getPasswordEncoder());
	}
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http
	    .csrf().disable()
	    .exceptionHandling()
	    .authenticationEntryPoint(restAuthenticationEntryPoint)
	    .and()
	    .authorizeRequests()
	    .antMatchers("/home").permitAll().and().authorizeRequests()
	    .antMatchers("/admin").hasRole("ADMIN")
	    .and()
	    .addFilterBefore(getCustomUsernamePasswordAuthenticationFilter(), CustomUsernamePasswordAuthenticationFilter.class)
	    //.formLogin()
	    //.successHandler(successHandler)
	    //.failureHandler(getSimpleUrlAuthenticationFailureHandler())
	    //.and()
	    .logout();
	}
}
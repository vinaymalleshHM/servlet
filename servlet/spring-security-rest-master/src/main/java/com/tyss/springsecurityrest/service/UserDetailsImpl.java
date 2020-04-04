package com.tyss.springsecurityrest.service;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.tyss.springsecurityrest.bean.UserBean;

@SuppressWarnings("serial")
public class UserDetailsImpl implements UserDetails {

	private transient UserBean bean;
	
	public UserDetailsImpl(UserBean bean) {
		this.bean = bean;
	}
	
	public UserBean getBean() {
		return bean;
	}

	public void setBean(UserBean bean) {
		this.bean = bean;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		SimpleGrantedAuthority authority = new SimpleGrantedAuthority(bean.getRole());
		return Arrays.asList(authority);
	}

	@Override
	public String getPassword() {
		return bean.getPassword();
	}

	@Override
	public String getUsername() {
		return bean.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}

package com.tyss.springwebsecurity.service;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.tyss.springwebsecurity.bean.UserBean;

public class UserDetailsImpl implements UserDetails {

	private UserBean bean;
	
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
        //return user.getAuthorities().stream().map(authority -> new SimpleGrantedAuthority(authority.getName().toString())).collect(Collectors.toList());
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

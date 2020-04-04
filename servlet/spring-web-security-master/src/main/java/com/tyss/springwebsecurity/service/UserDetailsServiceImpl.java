package com.tyss.springwebsecurity.service;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.tyss.springwebsecurity.bean.UserBean;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private PasswordEncoder encoder;
	
	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public UserDetails loadUserByUsername(String username) {
		if(username==null) {
			throw new UsernameNotFoundException("User Name is null");
		}
		EntityManager manager = factory.createEntityManager();
		TypedQuery<UserBean> query = manager.createQuery("from UserBean where username=:un", UserBean.class);
		query.setParameter("un", username);
		try {
			UserBean bean = query.getSingleResult();
			Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
			authorities.add(new SimpleGrantedAuthority(bean.getRole()));
			User user = new User(username, bean.getPassword(), authorities);
			return user;
		} catch (Exception e) {
			return null;
		}
	}
	
	public boolean register(UserBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		bean.setPassword(encoder.encode(bean.getPassword()));
		try {
			manager.persist(bean);
			transaction.commit();
			return true;
		}catch (Exception e) {
			return false;
		}
	}
	
	public UserBean auth(String username, String password) {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<UserBean> query = manager.createQuery("from UserBean where username=:un and password=:pass", UserBean.class);
		query.setParameter("un", username);
		query.setParameter("pass", password);
		try {
			UserBean bean = query.getSingleResult();
			return bean;
		} catch (Exception e) {
			return null;
		}
	}

}

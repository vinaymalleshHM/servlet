package com.tyss.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.springrest.dao.EmployeeDAO;
import com.tyss.springrest.dto.EmployeeInfoBean;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeDAO dao;
	@Override
	public EmployeeInfoBean auth(String email, String password) {
		return dao.auth(email, password);
	}

	@Override
	public boolean register(EmployeeInfoBean bean) {
		return dao.register(bean);
	}

	@Override
	public boolean changePassword(int id, String password) {
		dao.changePassword(id, password);
		return true;
	}

	@Override
	public List<EmployeeInfoBean> search(String name) {
		return dao.search(name);
	}

	@Override
	public boolean deleteEmployee(int id) {
		return dao.deleteEmployee(id);
	}

}

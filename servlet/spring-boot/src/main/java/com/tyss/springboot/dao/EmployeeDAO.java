package com.tyss.springboot.dao;

import java.util.List;

import com.tyss.springboot.dto.EmployeeInfoBean;

public interface EmployeeDAO {

	EmployeeInfoBean auth(String email, String password);
	boolean register(EmployeeInfoBean bean);
	boolean changePassword(int id,String password);
	List<EmployeeInfoBean> search(String name);
	boolean deleteEmployee(int id);

}

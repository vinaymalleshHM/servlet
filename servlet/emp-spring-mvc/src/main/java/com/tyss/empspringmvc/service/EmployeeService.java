package com.tyss.empspringmvc.service;

import java.util.List;

import com.tyss.empspringmvc.dto.EmployeeInfoBean;

//service layer is used to write a BL apart from DB operation
public interface EmployeeService {
	
	EmployeeInfoBean auth(String email, String password);
	boolean register(EmployeeInfoBean bean);
	void changePassword(int id,String password);
	List<EmployeeInfoBean> search(String name);


}

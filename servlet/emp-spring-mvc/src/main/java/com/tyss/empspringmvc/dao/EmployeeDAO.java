package com.tyss.empspringmvc.dao;

import java.util.List;

import com.tyss.empspringmvc.dto.EmployeeInfoBean;

public interface EmployeeDAO {

	EmployeeInfoBean auth(String email, String password);
	boolean register(EmployeeInfoBean bean);
	void changePassword(int id,String password);
	List<EmployeeInfoBean> search(String name);

}

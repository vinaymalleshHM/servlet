package com.tyss.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.springboot.dto.EmployeeInfoBean;
import com.tyss.springboot.dto.EmployeeResponse;
import com.tyss.springboot.service.EmployeeService;
@CrossOrigin(origins = "*",allowedHeaders = "*",allowCredentials = "true")
@RestController
public class EmployeeRestController {

	@Autowired
	private EmployeeService service;


	@GetMapping(path="/search",produces = MediaType.APPLICATION_JSON_VALUE)
	public  EmployeeResponse search(@RequestParam("name")String name) {	
		List< EmployeeInfoBean> beans = service.search(name);
		EmployeeResponse response = new EmployeeResponse();
		if (beans != null && !beans.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data found in DB for the requsted name");
			response.setBeans(beans);
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not found in DB for the requsted name");
		}
		return response;

	}
	
	@PostMapping(path = "/register",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse register(@RequestBody EmployeeInfoBean bean) {
		//		return service.register(bean);

		EmployeeResponse response = new EmployeeResponse();
		if (service.register(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data inserted into the DB");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not inserted into the DB");
		}
		return response;

	}

	@PostMapping(path = "/auth", produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse auth(@RequestBody EmployeeInfoBean bean) {
		//		return service.auth(bean.getEmail(), bean.getPassword());

		EmployeeInfoBean infoBean = service.auth(bean.getEmail(), bean.getPassword());
		EmployeeResponse response = new EmployeeResponse();
		if (infoBean != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Valid Credential");
			response.setBeans(Arrays.asList(infoBean));
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Invalid Credential");
		}
		return response;
	}

	@PutMapping(path = "/change-password",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse changePassword(@RequestBody EmployeeInfoBean bean) {

		//		return service.changePassword(bean.getId(), bean.getPassword());
		EmployeeResponse response = new EmployeeResponse();
		if (service.changePassword(bean.getId(), bean.getPassword())) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Password Changed Successfuly");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Password  doesn't Changed");
		}
		return response;

	}

	@DeleteMapping(path = "/delete/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse deleteEmployee(@PathVariable("id")int id) {
		//		return service.deleteEmployee(id);

		EmployeeResponse response = new EmployeeResponse();
		if (service.deleteEmployee(id)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("record deleted Successfuly");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("record  doesn't deleted");
		}
		return response;

	}

}

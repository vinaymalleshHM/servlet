package com.tyss.productspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.productspringboot.dto.ProductInfoBean;
import com.tyss.productspringboot.dto.ProductResponse;
import com.tyss.productspringboot.service.ProductService;

@CrossOrigin(origins = "*",allowCredentials = "true")
@RestController
public class ProductRestController {
	@Autowired
	private ProductService service;
	
	@PostMapping(path = "/add",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse addProduct(@RequestBody ProductInfoBean bean) {
		ProductResponse response = new ProductResponse();
		if (service.addProduct(bean)) {
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

	@GetMapping(path = "/delete/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse removeProduct(@PathVariable("id") int id) {
		ProductResponse response = new ProductResponse();
		if (service.removeProduct(id)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("record deleted Successfuly");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("record  doesn't deleted");
		}
		return response;
		
	}
	@PutMapping(path = "/update",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse updateProduct(@RequestBody ProductInfoBean bean) {
		ProductResponse response = new ProductResponse();
		if (service.updateProduct(bean)) {
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
	
	
	@GetMapping(path="/search",produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getProductByName(@RequestParam("name")String name){
		List<ProductInfoBean> beans = service.getProductByName(name);
		ProductResponse response = new ProductResponse();
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
	
	
	@GetMapping(path="/searchall",produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getAllProduct() {
		List< ProductInfoBean> beans = service.getAllProduct();
        ProductResponse response = new ProductResponse();
		if (beans != null && !beans.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("All Data founds");
			response.setBeans(beans);
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not found in DB");
		}
		return response;
	}
	
}

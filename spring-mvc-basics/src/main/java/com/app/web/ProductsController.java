package com.app.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductsController {
//
//	@RequestMapping(
//			value = "/products", 
//			method = RequestMethod.GET, 
//			headers = { "my-header=my" },
//			params= {"!limit"})
	@GetMapping(
			value = "/products", 
			headers = { "my-header=my" },
			params= {"!limit"}
			)
	public @ResponseBody String getAllv1() {
		return "url:/products, method:GET - ProductsController::getAllv1";
	}
	

	@RequestMapping(
			value = "/products", 
			method = RequestMethod.GET, 
			params= {"limit"})
	public @ResponseBody String getAllv2() {
		return "url:/products, method:GET - ProductsController::getAllv2";
	}

	@RequestMapping(value = "/products", method = RequestMethod.GET, headers = { "my-header=yours" })
	public @ResponseBody String getAllV3() {
		return "url:/products, method:GET - ProductsController::getAllv3";
	}
	
	@RequestMapping(value = "/products", method = RequestMethod.GET,produces= {"application/xml"})
	public @ResponseBody String getXML() {
		return "url:/products, method:GET - ProductsController::getXML response payload";
	}



	@RequestMapping(value = "/products", method = RequestMethod.POST,consumes= {"application/json"})
	public @ResponseBody String save() {
		return "url:/products, method:POST - ProductsController::save with JSON request payload";
	}
	

}

package com.app.components;

import com.vendor.RequestMapping;
import com.vendor.RequestMethod;

public class UserController {

	@RequestMapping(url = "/login", method = RequestMethod.POST)
	public void doLogin() {
		System.out.println("Login..");
	}

	@RequestMapping(url = "/register", method = RequestMethod.POST)
	public void doRegister() {
		System.out.println("Register..");
	}

}

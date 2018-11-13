package com.app.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView sayHello(HttpServletRequest req) {
		String model = "Hello, Welcome to Spring web";
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", model);
		mav.setViewName("welcome");
		return mav;
	}

}

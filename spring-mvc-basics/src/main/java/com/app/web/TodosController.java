package com.app.web;

import java.security.Principal;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.web.model.Todo;

@Controller
public class TodosController {

//	@GetMapping("/todos")
//	public @ResponseBody String getAllv1(@RequestParam(required=false,defaultValue="10") Integer limit) {
//		return "url:/todos, method:GET - TodosController::getAllv1 , limit :" + limit;
//	}

//	@GetMapping("/todos")
//	public @ResponseBody String getAllv1(@RequestHeader int header, @CookieValue String JSESSIONID,Locale locale,Principal principal) {
//		return "url:/todos, method:GET - TodosController::getAllv1 , header :" + header + " JSESSIONID-" + JSESSIONID +" - Locale "+locale.getCountry();
//	}

//	@PostMapping("/todos")
//	public @ResponseBody String save(@ModelAttribute Todo todo, BindingResult result,HttpServletRequest req,HttpServletResponse resp,HttpSession session) {
//		if (result.hasErrors()) {
//			return "Invalid Todo params";
//		}
//		return "url:/todos, method:POST - TodosController::save" + todo;
//	}

	

//	@PostMapping(value="/todos",consumes= {"application/xml","application/json"})
//	public @ResponseBody String saveXMLOrJSONTodo(@RequestBody Todo todo) {
//		return "url:/todos, method:POST - TodosController::save" + todo;
//	}

	@GetMapping("/todos/{id}")
	public @ResponseBody Todo getTodo(@PathVariable int id) {
		Todo todo=new Todo();
		todo.setId(id);
		todo.setTitle("new Todo");
		return todo;
	}
	
}

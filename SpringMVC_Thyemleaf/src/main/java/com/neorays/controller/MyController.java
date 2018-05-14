package com.neorays.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.neorays.command.Customer;

@Controller
public class MyController {

	@RequestMapping("home.htm")
	public String index(Map<String, Object> map,@ModelAttribute Customer customer) {
		System.out.println("controller index");
		map.put("message", "Hello Mithilesh !"+new Date());
		return "form";
	}// method

	@RequestMapping(value = "/form.htm", method = RequestMethod.GET)
	public String customerSubmit(Map<String, Object> map,@ModelAttribute Customer customer) {
      System.out.println(customer);
		map.put("customer", customer);
		String info = String.format("Customer Submission: id = %d, firstname = %s, lastname = %s", customer.getId(),
				customer.getFirstname(), customer.getLastname());
		// log.info(info);

		return "result";
	}// method
}// class
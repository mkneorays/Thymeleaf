package com.neorays.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.neorays.command.Customer;

@Controller
public class MyController {

	@RequestMapping("home.htm")
	public String index(Map<String, Object> map,@ModelAttribute Customer customer) {
		System.out.println("controller");
		return "welcome";
	}// method

	@RequestMapping(value = "/form.htm", method = RequestMethod.GET)
	public ModelAndView createPolicy(ModelAndView mv, @ModelAttribute @Valid Customer customer,
			BindingResult bindingResult) {
		System.out.println("createPolicy");

		if (bindingResult.hasErrors()) {
			System.out.println("has error");
			
			mv.setViewName("welcome");
		} else {
			mv.setViewName("result");
		}
		return mv;
		//return "result";
	}// method
	
	
}// class
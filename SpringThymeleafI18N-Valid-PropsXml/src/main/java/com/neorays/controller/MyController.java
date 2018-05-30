package com.neorays.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neorays.command.Person;

@Controller
public class MyController {

   @RequestMapping("home.htm")
   public String index(@ModelAttribute("person")  Person person ) {
 System.out.println("controller");
     // map.put("message", "Hello Spring MVC 5!");
      return "welcome";
      
   }//method
   
	
	/*@RequestMapping("/")    //its also working
	public String index(Model model){
		System.out.println("first method");
		model.addAttribute("person", new Person());
		return "welcome";
	}
	*/
   @RequestMapping("form.htm")
   public String processData(Map<String,Object> map,@ModelAttribute("person")@Valid Person person,BindingResult bindingResult ) {
 System.out.println("second");
      map.put("message", "Hello Spring MVC 5!");
      if (bindingResult.hasErrors()) {
			System.out.println("has error");
			
			 return "welcome";
		} else {
			System.out.println("no error");

			 return "result";
		      
		}
		
   }//method
}//class
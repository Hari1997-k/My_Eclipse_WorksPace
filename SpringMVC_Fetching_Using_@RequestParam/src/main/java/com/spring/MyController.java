package com.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping("/")
	protected ModelAndView show(HttpServletRequest request , HttpServletResponse response) {
		ModelAndView model = new ModelAndView("index");
		return model;
	}
	
	@RequestMapping("/welcome")
	protected ModelAndView show1	(
			@RequestParam("name") String name ,
			@RequestParam("pass") String pass ,
			@RequestParam("gender") String gender ,
			@RequestParam("cbox") String mstatus ,
			@RequestParam("occ") String occupation ,
			@RequestParam("hob") String hobbies 
									) {
		
		ModelAndView model = new ModelAndView("welcome");
		
		model.addObject("name" , name);
		model.addObject("pass", pass);
		model.addObject("gender" , gender);
		model.addObject("cbox", mstatus);
		model.addObject("occupation", occupation);
		model.addObject("hobbies", hobbies);

		return model;
	}

}

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
	protected ModelAndView show1(HttpServletRequest request , 
			HttpServletResponse response ,
			@RequestParam("name") String name ,
			@RequestParam("pass") String pass ,
			@RequestParam("gender") String gender ,
			@RequestParam("cbox") String mstatus ,
			@RequestParam("occ") String occupation ,
			@RequestParam("hob") String hobbies ) {
		
		ModelAndView model = new ModelAndView("welcome");
		/*
		 * String name = request.getParameter("name"); String pass =
		 * request.getParameter("pass"); String gender = request.getParameter("gender");
		 * String mstatus = request.getParameter("cbox"); String occupation =
		 * request.getParameter("occ"); String hobbies = request.getParameter("hob");
		 */
		model.addObject("name" , name);
		model.addObject("pass", pass);
		model.addObject("gender" , gender);
		model.addObject("cbox", mstatus);
		model.addObject("occupation", occupation);
		model.addObject("hobbies", hobbies);

		return model;
	}

}

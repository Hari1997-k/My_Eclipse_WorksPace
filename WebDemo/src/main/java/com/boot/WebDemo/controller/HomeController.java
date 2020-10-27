package com.boot.WebDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	String fname = "";

	@RequestMapping("/")
	public ModelAndView goHome() {
		ModelAndView model = new ModelAndView("index");
	
		System.out.println(" Home Controller called " );
		return model;

	}
	
	@PostMapping("/home")
	public ModelAndView welcome(@RequestParam("name") String name ) {
		ModelAndView model = new ModelAndView("welcome");
		fname = name;
		System.out.println(" Welcome  Controller called " );

		model.addObject("name" , fname);
		return model;

	}

}

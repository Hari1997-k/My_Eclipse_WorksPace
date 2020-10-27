package com.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController1 {
	@RequestMapping("/")
	protected ModelAndView show(HttpServletRequest request , HttpServletResponse response) {
		ModelAndView model = new ModelAndView("index");
		String msg = "Welcome To MyController1";
		model.addObject("msg", msg);
		return model;
		
	}

}

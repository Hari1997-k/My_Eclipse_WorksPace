package com.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.DAO.UserDAO;
import com.spring.domain.User;

@Controller
public class UserController {
	@Autowired
	private UserDAO userDAO;
	@RequestMapping(value="/")
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("index");
		return model;
	}
	@RequestMapping(value="/saveUser")
	public ModelAndView saveUser(@ModelAttribute("user") User user) {
		userDAO.saveUser(user);
		ModelAndView model = new ModelAndView("home");
		return model;
	}
}

package com.spring.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.DAO.UserDAO;
import com.spring.domain.User;

@Controller
public class UserController {
	Integer ida = 0 ;
	@Autowired
	private UserDAO userDAO;
	@RequestMapping(value="/")
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("index");
		return model;
	}
	String name= "";
	@RequestMapping(value="/login")
	public ModelAndView login(@ModelAttribute("user") User user) {
		String userName = user.getUserName();
		String password = user.getPassword();
		ida = userDAO.UsersList(userName);
		//System.out.println("***************************************"+ida);
		User u = userDAO.checkUserExist(userName, password);
		ModelAndView model = null;
		if(u!=null) {
			model = new ModelAndView("home");
		}
		return model;
	}
	@RequestMapping(value="/user")
	public ModelAndView userDetails(@ModelAttribute("user") User user) {
		User u = userDAO.getUserById(ida);
		//System.out.println("AAAAA++++  "+ida);
		ModelAndView model = new ModelAndView("user");
		model.addObject("user",u);
		return model;
	}
	@RequestMapping(value="/editPage")
	public ModelAndView editPage() {
		ModelAndView model = new ModelAndView("edit");
		return model;
	}
	@RequestMapping(value="/edit")
	public ModelAndView editMyAccount(@RequestParam("name") String userName,
			@RequestParam("mobile") String mobile,
			@RequestParam("password") String password,
			@RequestParam("gender") String gender,
			@RequestParam("address") String address,
			@RequestParam("email") String email,
			@RequestParam("dob") String dob) throws ParseException {
		  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		  Date date = sdf.parse(dob);
		User user = new User(userName, mobile, password,gender,address,email,date);
		ModelAndView model = null;
		userDAO.editMyAccount(user);
		model = new ModelAndView();
		model.setViewName("exit");
		model.addObject("user",user);
		return model;
	}
}

package com.spring.controllers;

import com.spring.domain.*;
import com.spring.services.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@SessionAttributes("user")
@Controller
public class UserController {

	HttpSession session;
	@Autowired
	private UserService userService;
	@Autowired
	private RoleService roleService;
	

	@RequestMapping("/index")
	public String indexPage() {
		return "/index";
	}


	@RequestMapping("/editMyAccount")
	public ModelAndView editMyaccount(@RequestParam("userId") Integer userId) {
		User userIns = userService.getUserById(userId);
		return new ModelAndView("/editMyAccount","userIns",userIns);
	}
	
	
	@RequestMapping("/signup")
	public String signupPage() {
		return "/signup";
	}
	
	
	
	
	
	


	
	
	

   @RequestMapping("/loginUser")
	public ModelAndView login(@RequestParam("userName") String userName, @RequestParam("password") String password,Model model,
			HttpServletRequest request) {
		User user=(userService.checkUserExist(userName,password));
		if (user!= null) {
			session = request.getSession();
			session.setAttribute("user", user );
			session.setAttribute("loginStatus", "true");
			return new ModelAndView("/welcome");
				
		}
		else
		{
			return new ModelAndView("/index", "error", "Username or password is incorrect");
			
		}
	}


	@RequestMapping("/listUser")
	public ModelAndView list(Model model, @ModelAttribute String message) {
		List<User> userList = new ArrayList<User>();
		userList = userService.listUser();
		model.addAttribute("message", message);
		return new ModelAndView("/listUser", "userList", userList);
	}


	@RequestMapping("/showUser")
	public ModelAndView showUser(@ModelAttribute("user")User user) {
		return new ModelAndView("/showUser", "userIns", user);
	}


	@RequestMapping("/editUser")
	public ModelAndView editPage(@RequestParam("userId") Integer userId,Model model) {
		User userIns = userService.getUserById(userId);
		List<Role> roleList = new ArrayList<Role>();
		roleList = roleService.listRole();
		model.addAttribute("roleList", roleList);
		return new ModelAndView("/createUser", "userIns", userIns);
	}

	@RequestMapping("/updateUser")
	public ModelAndView edit(@RequestParam("userName")String userName, @RequestParam("email")String email,
			@RequestParam("address")String address,@RequestParam("userId")Integer userId,
			@RequestParam("password")String password,@RequestParam("mobile")String mobile,
			Model model,@RequestParam("roleId")Integer roleId,@RequestParam("dob")String dob,
			@RequestParam("gender")String gender
			) {
		Role roleIns = roleService.getRoleById(roleId);
		User userIns=new User(userId,userName,  dob, gender, email,  roleIns, password, mobile,address);
		Boolean b = userService.editUser(userIns);
		model.addAttribute("message", "User Updated Successfully!");
		if (b) {
			return new ModelAndView("redirect:/listUser.do", "userIns", userIns);
		}
		return null;

	}
	
	@RequestMapping("/updateMyAccount")
	public ModelAndView editMyAccount(@RequestParam("userName")String userName, @RequestParam("email")String email,
			@RequestParam("address")String address,@RequestParam("userId")Integer userId,
			@RequestParam("password")String password,@RequestParam("mobile")String mobile,
			Model model,@RequestParam("gender")String gender,@RequestParam("dob")String dob) {
		User user=userService.getUserById(userId);
		Role roleIns = roleService.getRoleById(user.getRole().getId());
		User userIns=new User(userId,userName,  email, dob,  gender, roleIns, password, mobile,address);
	
		Boolean b = userService.editUser(userIns);
		model.addAttribute("message", "User Updated Successfully!");
		if (b) {
			return new ModelAndView("/showUser", "userIns", userIns);
		}
		return null;

	}

	@RequestMapping("/deleteUser")
	public ModelAndView delete(@RequestParam("userId") Integer userId, Model model, HttpServletRequest request) {
		User userIns = userService.getUserById(userId);
		Boolean b = userService.deleteUser(userIns);
		String message = "";
		// session = request.getSession();
		if (b) {
			message = "User Deleted Successfully";
			return new ModelAndView("redirect:listUser.do", "message", message);
		} else {
			message = "Could not delete user!";
			return new ModelAndView("redirect:listUser.do", "message", message);
		}

	}


	@RequestMapping(value = "/logout", method = RequestMethod.GET)
    public ModelAndView invalidate(@ModelAttribute User user) {
        session.removeAttribute("user");
        session.invalidate();
        System.out.println("Session status" + session == null);
        return new ModelAndView("/index");
    }
	
}

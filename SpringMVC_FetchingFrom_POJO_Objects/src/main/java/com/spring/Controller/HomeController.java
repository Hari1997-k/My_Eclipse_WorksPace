package com.spring.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.model.Address;
import com.spring.model.Employee;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String show() {
		return "index";
	}
	
	@RequestMapping("/home")
			public String show1() {
		return "home";				
			}
	
	@RequestMapping("/welcome")
	public String show2() {
		return "welcome";				
	}
	@RequestMapping("/model")
	protected ModelAndView userModel(HttpServletRequest request , HttpServletResponse response) {
		Address add = new Address();
		add.setCity("Mumbai");
		add.setDoorNo(199);
		add.setStreet("NayaSteet-1");
		Employee e = new Employee();
		e.setEid(100);
		e.setEname("Hari");
		e.setErole("Fulstack");
		e.setEmpAddress(add);
		String msg = "Gud Morning Hari";
		ModelAndView model  = new ModelAndView("model");
		model.addObject("msg" , msg);
		model.addObject("Emp", e);
		return model ;
		
	}
}

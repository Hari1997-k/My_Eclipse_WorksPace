package com.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.DAO.CompanyDAO;
import com.spring.domain.Company;
@Controller
public class CmpnyController {
	HttpServletResponse response ;
	@Autowired
	private CompanyDAO cdao;
	@RequestMapping(value = "/")
	public String  demo() {
		return  "login" ;
	}
	@RequestMapping(value = "/index" , method =RequestMethod.POST)
	public ModelAndView login(
			@RequestParam("lid") int cid , 
			@RequestParam("lname") String cname) {
		int id = 0 ;
		String name = null;
		ModelAndView model = new ModelAndView("index");
		ModelAndView model1 = new ModelAndView("signup");
		Company cmp = cdao.login(cid, cname);
		if(cmp!=null) 
		return  model ;
		else
		return model1;
		
	}
	@RequestMapping(value = "/signup")
	public ModelAndView  signup() {
			ModelAndView model = new ModelAndView("signup");
					return model;
		}
		
	@RequestMapping(value = "/home")
	public String  demo1() {
		return  "index" ;
	}
	
	@RequestMapping(value = "/signin" , method =RequestMethod.POST)
	public ModelAndView  signin(
		@RequestParam("cid") int cid ,
			@RequestParam("cname") String cname ,
			@RequestParam("ctype") String ctype ,
			@RequestParam("cbranch") String cbranch ,
			Model m) {
		Company cmp = new Company();
		cmp.setCid(cid);
		cmp.setCname(cname);
		cmp.setCtype(ctype);
		cmp.setCbranches(cbranch);
		ModelAndView model = new ModelAndView("view");
		cdao.createCompany(cmp);
		List<Company> clist = cdao.clist();
		model.addObject("clist" , clist);
		int empNum = clist.size();
		m.addAttribute("ecount",empNum );
		return  model ;
	}
	
	@RequestMapping(value = "/view", method =RequestMethod.POST)
	public ModelAndView  create(
		@RequestParam("cid") int cid ,
			@RequestParam("cname") String cname ,
			@RequestParam("ctype") String ctype ,
			@RequestParam("cbranch") String cbranch ,
			Model m) {
		Company cmp = new Company();
		cmp.setCid(cid);
		cmp.setCname(cname);
		cmp.setCtype(ctype);
		cmp.setCbranches(cbranch);
		ModelAndView model = new ModelAndView("view");
		cdao.createCompany(cmp);
		List<Company> clist = cdao.clist();
		model.addObject("clist" , clist);
		int empNum = clist.size();
		m.addAttribute("ecount",empNum );
		return  model ;
	}
	
	@RequestMapping(value ="/emplist")
	public ModelAndView EmpList(Model m) {
		ModelAndView model = new ModelAndView("view");
		List<Company> clist = cdao.clist();
		int empNum = clist.size();
		m.addAttribute("ecount",empNum );
		model.addObject("clist" , clist);
		 return model ;
		
	}
	
	@RequestMapping(value = "/delete/{cid}")
	public ModelAndView delete (@PathVariable("cid") int cid , Model m) {
		ModelAndView model = new ModelAndView("view");
		cdao.DeleteCmpny(cid);
		List<Company> clist = cdao.clist();
		model.addObject("clist" , clist);
		int empNum = clist.size();
		m.addAttribute("ecount",empNum );
		return model;
		
	}
	@RequestMapping(value = "update/{cid}")
	public ModelAndView Update(@PathVariable int cid , Model m) {
		Company cmp = cdao.CmpById(cid);
		ModelAndView model = new ModelAndView("update");
		m.addAttribute("command", cmp);
		return model ;
		
	}
	
	
	@RequestMapping(value = "uview")
	public ModelAndView UpdateCmp(
			@RequestParam("cid") int cid ,
			@RequestParam("cname") String cname  ,
			@RequestParam("ctype") String ctype ,
			@RequestParam("cbranches") String cbranches , Model m )  {
	ModelAndView model = new ModelAndView("view");
	Company cmp = new Company();
	cmp.setCid(cid);
	cmp.setCbranches(cbranches);
	cmp.setCname(cname);
	cmp.setCtype(ctype);
	cdao.UpdateEmployee(cmp);
	List<Company> clist = cdao.clist();
	model.addObject("clist" , clist);
	int empNum = clist.size();
	m.addAttribute("ecount",empNum );
	return model;
	
	}
	
}

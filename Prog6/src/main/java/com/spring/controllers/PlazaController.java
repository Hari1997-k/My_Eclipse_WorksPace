package com.spring.controllers;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.spring.DAO.PlazaDAO;
import com.spring.domain.Plaza;
@Controller
public class PlazaController {
	private PlazaDAO plazaDAO = new PlazaDAO();
	@RequestMapping(value="/")
	public ModelAndView listPlaza() {
		List<Plaza> list = plazaDAO.listPlaza();
		return new ModelAndView("listPlaza","list",list);
	}
	@RequestMapping(value="/deletePlaza")
	public ModelAndView deletePlaza(@ModelAttribute("plaza") Plaza plaza) {
		Boolean result = plazaDAO.deletePlaza(plaza);
		ModelAndView model = null;
		if(result == true) {
			model = new ModelAndView("index");
		}
		return model;
	}
}

package com.spring.controllers;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.services.FareDAO;
import com.spring.services.PlazaDAO;
import com.spring.services.TollBoothDAO;
import com.spring.services.TripsDAO;
import com.spring.services.VehicleDAO;
import com.spring.domain.Fare;
import com.spring.domain.Plaza;
import com.spring.domain.TollBooth;
import com.spring.domain.Trips;
import com.spring.domain.Vehicle;

@Controller
@Transactional
public class TripsController {
	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private PlazaDAO plazaDAO;
	@Autowired
	private FareDAO fareDAO;
	@Autowired
	private TollBoothDAO tollBoothDAO;
	@Autowired
	private TripsDAO tripsDAO;
	@Autowired
	private VehicleDAO vehicleDAO;
	@RequestMapping(value="/")
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("index");
		return model;
	}

	@RequestMapping("/receipt")
    public ModelAndView saveTrips(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        ModelAndView model = null;
        
        @SuppressWarnings("deprecation")
		java.sql.Date d = new java.sql.Date(new java.util.Date().getYear(), new java.util.Date().getMonth(), new java.util.Date().getDay());
        
        
        HttpSession session = request.getSession(true);
        String vehicleType = request.getParameter("vehicleType");
        String vehicleNumber = request.getParameter("vehicleNumber");
        String plazaName = request.getParameter("plazaName");
        String laneNumber = request.getParameter("laneNumber");
        String journeyType = request.getParameter("journeyType");
        session.setAttribute("vehicleType", vehicleType);
        session.setAttribute("vehicleNumber", vehicleNumber);
        session.setAttribute("plazaName", plazaName);
        session.setAttribute("laneNumber", laneNumber);
        session.setAttribute("journeyType", journeyType);
		
		  Vehicle vehicle = new Vehicle(); vehicle.setId(6);
		  vehicle.setNumberPlate(vehicleNumber); vehicle.setVehicleType(vehicleType);
		  Session ses = sessionFactory.getCurrentSession(); ses.save(vehicle);
		 
        
        Vehicle ve = vehicleDAO.getVehicleByNumberPlate(vehicleNumber);
        
        
        Plaza pl =  plazaDAO.getPlazaByName(plazaName),pl1 = new Plaza();
        
        pl1.setName(plazaName);
        TollBooth td = tollBoothDAO.getToll(Integer.parseInt(laneNumber), pl);
        
        
        Trips trip = new Trips();
        trip.setDate(d);
        trip.setTollBooth(td);
        trip.setVehicle(ve);
        trip.setJourneyType(journeyType);
        Fare f = fareDAO.getFare(pl1, vehicleType),f1 = new Fare();
        Double rate = null;
        if(journeyType.equals("single")) {
            int fid = f.getId();
            f1 = fareDAO.getFareById(fid);
            rate = f1.getOneWayRate();
        }else if(journeyType.equals("double")) {
            int fid = f.getId();
            f1 = fareDAO.getFareById(fid);
            rate = f1.getTwoWayRate();
        }
        session.setAttribute("fare", rate.toString());
        session.setAttribute("date", d.toString());
        trip.setFare(f);
        if(tripsDAO.saveTrips(trip)==true) {
        	model = new ModelAndView("recipt");
        }
        return model;
    }
}

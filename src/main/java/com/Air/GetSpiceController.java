package com.Air;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Air.Model.AdminLogin;
import com.Air.Model.Buisnessclass;
import com.Air.Model.Contact;
import com.Air.Model.Hotelbooking;
import com.Air.Model.Login;
import com.Air.Model.Standard;


@Controller
public class GetSpiceController {
	
	
	@Autowired
	SessionFactory sf;
	
	
	
	@RequestMapping("/admin")
	public String Toset(@ModelAttribute AdminLogin l1, Model model) {
	Session ss=sf.openSession();
	
	Login dblogin=ss.get(Login.class, l1.getUsername());
	l1.getUsername().equals(l1.getUsername());
	String page="adminhome";
	String msg = null;
	
	
	if(dblogin !=null) {
		if(l1.getPassword().equals(l1.getPassword())) {
			page="adminhome";
		}else {
			msg="invalid password";
		}
	}else {
		msg="invalid Username";
	}
	model.addAttribute("msg",msg);
	return page;
	}
	
	
	
	@GetMapping("/hotelbk")
	public ModelAndView Tocon() {
	Session ss=sf.openSession();
	
	Criteria cr1=ss.createCriteria(Hotelbooking.class);
	java.util.List<Hotelbooking> l1= cr1.list();
	
	System.out.println(cr1.list());
	ModelAndView view= new ModelAndView();
	view.addObject("l1", l1);
	System.out.println(l1);
	view.setViewName("showhotelbooking");
	return view;
	}
	
	
	@GetMapping("/buibook")
	public ModelAndView Tobuisnessk() {
		Session ss=sf.openSession();
		
		Criteria cr2=ss.createCriteria(Buisnessclass.class);
		List<Buisnessclass> k45=cr2.list();
		k45.forEach(System.out::println);
		
	    ModelAndView view=new ModelAndView();
		view.addObject("k45",k45);
		System.out.println(k45);
		view.setViewName("showbuinessbooking");
		return view;		
	}
	
	
	
	@GetMapping("/adminStPage")
	public ModelAndView Tostandard() {
		Session ss=sf.openSession();
		
		Criteria cr3=ss.createCriteria(Standard.class);
		List<Standard> k46=cr3.list();
		k46.forEach(System.out::println);
		
		ModelAndView view=new ModelAndView();
		view.addObject("k46",k46);
		System.out.println(k46);
		view.setViewName("showstandardbooking");
		return view;
		
	}
	
	
	
	

}

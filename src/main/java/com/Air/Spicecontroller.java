package com.Air;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Air.Model.Buisnessclass;
import com.Air.Model.Buisnesspay;
import com.Air.Model.Career;
import com.Air.Model.Contact;
import com.Air.Model.Creditcard;
import com.Air.Model.Debitcard;
import com.Air.Model.Economy;
import com.Air.Model.Hotelbooking;
import com.Air.Model.Hotelroompay;
import com.Air.Model.Login;
import com.Air.Model.Standard;
import com.Air.Model.Standardpay;

import antlr.collections.List;

@Controller
public class Spicecontroller {

	@Autowired
	SessionFactory sf;

	@GetMapping("/con")
	public ModelAndView Tocon() {
		Session ss = sf.openSession();

		Criteria cr1 = ss.createCriteria(Contact.class);
		java.util.List<Contact> l1 = cr1.list();

		System.out.println(cr1.list());
		ModelAndView view = new ModelAndView();
		view.addObject("l1", l1);
		System.out.println(l1);
		view.setViewName("showcontact");
		return view;
	}

	@RequestMapping("/")
	public String Tostart() {
		return "loginpage";
	}
	
	@RequestMapping("/signup")
	String signuppage() {
		return "signup";
	}

	@RequestMapping("/loginpage")
	public String Toset(@ModelAttribute Login l1, Model model,RedirectAttributes rd) {
		Session ss = sf.openSession();

		Login dblogin = ss.get(Login.class, l1.getUsername());
		System.out.println("Login model"+l1.toString());
		l1.getUsername().equals(l1.getUsername());
		String page = "loginpage";
		String msg = null;

		if (dblogin != null) {
			if (l1.getPassword().equals(l1.getPassword())) {
				page = "home";
			} else {
				msg = "invalid password";
			}
		} else {
			msg = "invalid Username";
		}
		model.addAttribute("msg", msg);
		return page;
	}

	@RequestMapping("/sign")
	public String sign(@ModelAttribute Login l1,Model model,RedirectAttributes rd) {
		Session session = sf.openSession();
		model.addAttribute("msg", "hello");
		System.out.println("sign model"+l1.toString());
		org.hibernate.Transaction tx=null;
		tx=session.beginTransaction();
		Login lg=new Login();
		lg.setUsername(l1.getUsername());
		lg.setPassword(l1.password);
		session.save(lg);
		tx.commit();
		String page = "signup";
		page = "home";
		String message=null; model.addAttribute("msg", message); // front end
		rd.addFlashAttribute("id","username");
		rd.addAttribute("id","username").addFlashAttribute("message","Account created!"); 
		return page;
		 

	}

	@RequestMapping("/servicePage")
	public String Tokate() {
		return "service";
	}

	@RequestMapping("/aboutPage")
	public String Toabt() {
		return "about";
	}

	@RequestMapping("/contactPage")
	public String Tocontact() {
		return "contact";
	}

	@RequestMapping("/contact")
	public Contact Tocon(@ModelAttribute Contact c1) {
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();

		ss.save(c1);
		tx.commit();
		System.out.println(c1);
		return c1;

	}

	@RequestMapping("/logoutPage")
	public String Tologout() {
		return "loginpage";
	}

	@RequestMapping("/FlightPage")
	public String Tofly() {
		return "flight";
	}

	@RequestMapping("/EconomyPage")
	public String Toeco() {
		return "economy";
	}

	@RequestMapping("/economy")
	public Economy Tocon(@ModelAttribute Economy c1) {
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();

		ss.save(c1);
		tx.commit();
		System.out.println(c1);
		return c1;

	}

	@RequestMapping("/StandardPage")
	public String Tostandard() {
		return "standard";
	}

	@RequestMapping("/standard")
	public Standard Tostan(@ModelAttribute Standard s1) {
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();

		ss.save(s1);
		tx.commit();
		System.out.println(s1);
		return s1;
	}

	@RequestMapping("/PaymentPage")
	public String Topay() {
		return "payeco";
	}

	@RequestMapping("/payeco")
	public Debitcard Todebt(@ModelAttribute Debitcard debt) {
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();

		ss.save(debt);
		tx.commit();
		System.out.println(debt);
		return debt;
	}

	@RequestMapping("/Toupi")
	public String ToUPI() {
		return "pay1";
	}

	@RequestMapping("/pay1")
	public Creditcard Todebt(@ModelAttribute Creditcard cre) {

		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();

		ss.save(cre);
		tx.commit();
		System.out.println(cre);
		return cre;
	}

	@RequestMapping("/standardpayment")
	public String toPaystan() {
		return "paystandard";
	}

	@RequestMapping("/paystandard")
	public Standardpay Tostandardpay(@ModelAttribute Standardpay stanpay) {
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();

		ss.save(stanpay);
		tx.commit();
		System.out.println(stanpay);
		return stanpay;

	}

	@RequestMapping("/buisnessclasspage")
	public String Tobuisness() {
		return "buisness";
	}

	@RequestMapping("/buisness")
	public Buisnessclass Tobusiness(@ModelAttribute Buisnessclass bus) {
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();

		ss.save(bus);
		tx.commit();
		System.out.println(bus);
		return bus;

	}

	@RequestMapping("/paybuisnessclass")
	public String Topaybuisness() {
		return "paybuisness";
	}

	@RequestMapping("/paybuisness")
	public Buisnesspay Tosat(@ModelAttribute Buisnesspay jet) {
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();

		ss.save(jet);
		tx.commit();
		System.out.println(jet);
		return jet;
	}

	@RequestMapping("/hotelpage")
	public String Tohotel() {
		return "hotel";
	}

	@RequestMapping("/hotel")
	public Hotelbooking TobookHotelroom(@ModelAttribute Hotelbooking hot) {
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();

		ss.save(hot);
		tx.commit();
		System.out.println(hot);
		return hot;
	}

	@RequestMapping("/videopage")
	public String Tovideo() {
		return "video";
	}

	@RequestMapping("/hotelpaymentpage")
	public String Tohotelpay() {
		return "payhotelroom";
	}

	@RequestMapping("/payhotelroom")
	public Hotelroompay Topayroombill(@ModelAttribute Hotelroompay room) {
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		ss.save(room);
		tx.commit();
		System.out.println(room);
		return room;

	}

	@RequestMapping("/homePage")
	public String Tohome() {
		return "home";
	}

	@RequestMapping("/teampage")
	public String Toteam() {
		return "team";
	}

	@RequestMapping("/continent")
	public String Tocontinent() {
		return "continent";
	}

	@RequestMapping("/ecofacipage")
	public String Toecofaci() {
		return "ecofaci";
	}

	@RequestMapping("careerpage")
	public String Tofind() {
		return "career";
	}

	@RequestMapping("career")
	public Career Tofound(@ModelAttribute Career los) {
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();

		ss.save(los);
		tx.commit();
		System.out.println(los);
		return los;
	}

	@RequestMapping("/carpage")
	public String Tocarbook() {
		return "car";
	}

}

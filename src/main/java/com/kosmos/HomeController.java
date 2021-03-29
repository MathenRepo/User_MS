package com.kosmos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@RestController
@Controller
public class HomeController {


	@RequestMapping(value = "/home")
	public ModelAndView home() {
		try {
			System.out.println("Hi");
			ModelAndView mv = new ModelAndView();
			mv.setViewName("home");
			return mv;
		} catch (Exception ex) {
			ex.printStackTrace();
			ModelAndView mv = new ModelAndView();
			mv.setViewName("error");
			return mv;
		}
	}
	
	@RequestMapping(value = "/login")
	public ModelAndView login() {
		try {
			System.out.println("Hi");
			ModelAndView mv = new ModelAndView();
			mv.setViewName("login");
			return mv;
		} catch (Exception ex) {
			ex.printStackTrace();
			ModelAndView mv = new ModelAndView();
			mv.setViewName("error");
			return mv;
		}
	}

	
}

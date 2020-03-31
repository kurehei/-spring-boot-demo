package com.example.demo;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
// controllerのアノテーション
public class HomeController {
	@RequestMapping("/")
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("index");
		return mav;
	}

	@RequestMapping("/home")
	public String home() {
		return "forward:/";
	}
	
}

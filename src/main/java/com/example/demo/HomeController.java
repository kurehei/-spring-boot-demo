package com.example.demo;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;

@Controller
// controllerのアノテーション
public class HomeController {
	@RequestMapping("/")
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("index");
		return mav;
	}

	@RequestMapping("/other")
	public String other() {
		return "refirect:/";
	}

	@RequestMapping("/home")
	public String home() {
		return "forword:/";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ModelAndView send(
	  // valueがパラメーターで受け取る名前、
	  @RequestParam(value="check1",required=false)boolean check1,
	  @RequestParam(value="radio1",required=false)String radio1,
	  @RequestParam(value="select1",required=false)String select1,
	  @RequestParam(value="select2",required=false)String[] select2,
	  ModelAndView mav
	) {
	  String res = "";
	  try {
		res = "check1:" + check1 +
		"radio:" + radio1 +
		" select:" + select1 +
		" \nselect2:";
		  } catch(NullPointerException e) {}
		try {
		  res += select2[0];
		  for(int i = 0; i < select2.length;i++)
		  res += "," + select2[i];	
		} catch(NullPointerException e) {
		  res += "null";
		}
	  mav.addObject("msg",res);
	  mav.setViewName("index");
	  return mav;
	}
}

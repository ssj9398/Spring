package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.biz.Member;

@Controller
public class HelloController {
	@RequestMapping("/")
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("index");
		mav.addObject("msg", "Current data.");
		Member obj = new Member(123, "javaexpert", 24);
		mav.addObject("object", obj);
		return mav;
	}
}

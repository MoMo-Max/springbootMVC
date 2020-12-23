package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class TestController {

	
	@GetMapping("/test1")
	public ModelAndView Hello(){
		ModelAndView model = new ModelAndView("test");
		model.addObject("message", "this test model");
		System.out.println("my first controller123");
		return model;
	}
}

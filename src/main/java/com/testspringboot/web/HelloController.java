package com.testspringboot.web;

import java.text.DateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String hello(Model model) throws Exception {
		model.addAttribute("now", DateFormat.getDateInstance().format(new Date()));
		if(true) {
			throw new Exception("Some exception");
		}
		return "hello";
	}
}

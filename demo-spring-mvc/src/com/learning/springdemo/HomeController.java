package com.learning.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showMyPage() {
		return "index";
	}

	@RequestMapping("/home")
	public String showMyHomepage() {
		return "main-menu";
	}

}

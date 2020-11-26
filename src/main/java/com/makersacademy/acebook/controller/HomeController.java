package com.makersacademy.acebook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/userLogin")
	public String userLogin() {
		return "userLogin";
	}

}

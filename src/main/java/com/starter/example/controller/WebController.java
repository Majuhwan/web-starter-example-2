package com.starter.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WebController {
	
	@GetMapping("naver")
	public String naver(Model model) {
		return "naver";
	}
}

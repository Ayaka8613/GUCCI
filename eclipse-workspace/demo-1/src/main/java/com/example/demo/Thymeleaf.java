package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Thymeleaf{
	
	@GetMapping("/")
	public String thymeleaf (Model model){
		model.addAttribute("message", "テストです");
		return "thymeleaf";
	}
}
package com.example.demo;

import com.example.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class Thymeleaf  {
	@GetMapping("/")
	public String index (Model model) {
		model.addAttribute("list",java.util.Arrays.asList("TOP","ABOUT","CONTACT"));
		
		User user= new User();
		user.setName("田中　太郎");
		user.setAddress("tanaka.taro@example.com");
		user.setTel("000-000-0000");
		model.addAttribute("user",user);
		
		ContactForm contactForm =new ContactForm();
		model.addAttribute("contactForm",contactForm);
		
		List<String> inquiryTypes =Arrays.asList("○○○の問い合わせ","×××の問い合わせ","△△△の問い合わせ");
		model.addAttribute("inquiryTypes",inquiryTypes);
		return "fragment";
	}
	@GetMapping("/sample")
	public String SampleControlloer(Model model) {
		model.addAttribute("list",List.of("Profile","SNS","Contact"));
		
		User user= new User();
		user.setName("池田　愛美");
		user.setAddress("manami.ikeda@example.com");
		user.setTel("XXX-XXXX-XXXX");
		model.addAttribute("user",user);
		
		ContactForm contactForm =new ContactForm();
		model.addAttribute("contactForm",contactForm);
		List<String> inquiryTypes =Arrays.asList("○○○の問い合わせ","×××の問い合わせ","△△△の問い合わせ");
		model.addAttribute("inquiryTypes",inquiryTypes);
		
		return "sample";
	}
}
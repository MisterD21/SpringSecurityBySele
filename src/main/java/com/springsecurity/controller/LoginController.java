package com.springsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springsecurity.dto.SignUpDto;
import com.springsecurity.repository.SignUpDao;

@Controller
public class LoginController {

	@Autowired
	private PasswordEncoder encoder;
	
	@Autowired
	private SignUpDao signUpDao;
	@GetMapping("/mycustomlogin")
	public String login() {
		
		return "login";
	}
	
	@GetMapping("/signup")
	public String signup(@ModelAttribute("signupdto") SignUpDto signUpDto) {
		
		return "signup";
	}
	
	@PostMapping("/process-signup")
	public String signupProcess(SignUpDto signUpDto) {
		
		String password = signUpDto.getPassword();
		String encode = encoder.encode(password);
		signUpDto.setPassword(encode);
		signUpDao.saveUser(signUpDto);
		return "redirect:/mycustomlogin";
	}
	
}

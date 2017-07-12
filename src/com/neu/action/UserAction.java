package com.neu.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neu.service.UserService;

@Controller
public class UserAction {

	@Autowired
	public UserService us;

	public UserService getUs() {
		return us;
	}

	public void setUs(UserService us) {
		this.us = us;
	}
	
	@RequestMapping("login.do")
	public String longin(){
		return "index";
	}
}

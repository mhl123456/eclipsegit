package com.meng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.meng.entity.User;

@Controller
public class UserController {
	@RequestMapping("/1.do")
	public void add(User user) {
		//System.out.println(name);
		System.out.println(user);
	}
}

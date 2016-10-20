package com.annotation.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	@RequestMapping(value = "/frame")
	public ModelAndView frame() {
		try {
			ModelAndView mv = new ModelAndView();
			System.out.println("sdf");
			mv.setViewName("/frameWork/user/userForm");
			return mv;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
}

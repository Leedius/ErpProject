package com.study.test.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

	/*
	 * //로그인 페이지
	 * 
	 * @GetMapping("/log") public String login() {
	 * 
	 * return "content/login"; }
	 */
		//메인페이지이동
		@GetMapping("/main")
		public String main() {
			return "content/user/main";

		}
		



}

package com.study.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	//로그인 시 메인 페이지로 이동
	@GetMapping("/")
	public String index() {
		
		return "user/main";

	}
	/*
	 * //미인가 시 이동할 페이지
	 * 
	 * @GetMapping("/accessDeny") public String accessDeny() {
	 * 
	 * return "content/access_deny"; }
	 */
	
}


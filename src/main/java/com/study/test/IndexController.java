package com.study.test;

import java.io.IOException;
import java.text.ParseException;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;


@Controller
public class IndexController {
//	@Resource(name = "memberService")
//	private MemberService memberService;
//	
//	@Resource(name = "schoolService")
//	private SchoolService schoolService;
//	
//	@Resource(name = "stuService")
//	private StuService stuService;
	
	@GetMapping("/")
	public String index(Model model) throws IOException, ParseException {
		
		System.out.println("@@@@@@@@@@@몇번나오는지 확인@@@@@@@@@@@@");
		
		return "content/login/login_page";
	}
	
	@ResponseBody
	@GetMapping("/restApi")
	public String getData() throws JsonProcessingException{
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:5001/predict?sentence";
		//url로 요청후 응답결과 reponse에 저장
		//ObjectMapper mapper = new ObjectMapper();
		//Map<String, Map<String, Integer>> data = restTemplate.getForObject(url, Map.class);
		//내용을 string 으로 받기
        //String jsonData = mapper.writeValueAsString(data);
        
        //다른방법
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        String jsonData = response.getBody();
        
		return jsonData;
	}
	
}

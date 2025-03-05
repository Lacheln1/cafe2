package com.shop.cafe.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shop.cafe.dto.Member;
import com.shop.cafe.service.MemberService;

@RestController
@CrossOrigin("http://127.0.0.1:5500")
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	
	@PostMapping("insertMember")
	public Map<String, String> insertMember(@RequestBody Member m) {//body에 있는 내용을 member객체에 똑같이 넣어달라는 뜻 member엔 email,pwd,nickname이 있음
		
		Map<String,String> responseData = new HashMap();
		try {
			memberService.insertMember(m);
			responseData.put("msg","ok");
		} catch (Exception e) {
			e.printStackTrace();
			responseData.put("msg", e.getMessage());
		}
		
		return responseData;
	}
}

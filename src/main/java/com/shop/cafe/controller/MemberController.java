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

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@RestController
//@CrossOrigin("http://127.0.0.1:5500")
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	@PostMapping("login")
	public Map<String, String> login(@RequestBody Member m , HttpServletRequest request) {
		Map<String,String> responseData = new HashMap();
		try {
			m=memberService.login(m);
			if(m!=null) {
				HttpSession session = request.getSession();
				System.out.println(session.getId());
				session.setAttribute("member", m);
				responseData.put("msg", "ok");
			} else {
				responseData.put("msg", "다시 로그인 해주세요");
			}
		} catch (Exception e) {
			e.printStackTrace();
			responseData.put("msg", "다시 로그인 해주세요");
		}
		return responseData;
	}
	
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

package com.shop.cafe.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@RestController
public class CartController {
	@PostMapping("addCart")
	public String addCart(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		System.out.println("addCart() 호출됨" + session);
		return "ok";
	}
}

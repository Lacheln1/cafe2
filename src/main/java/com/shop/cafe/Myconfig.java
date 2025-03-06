package com.shop.cafe;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Myconfig implements WebMvcConfigurer {
	
//	@Override
//	public void addCorsMappings(CorsRegistry registry) {
//		registry.addMapping("/**")
//		.allowedOrigins("http://127.0.0.1:8080")
//		.allowedMethods("*") //get방식 또는 post방식을 요청하는곳
//		.allowedHeaders("*")
//		.allowCredentials(true); // 쿠키, 세션 정보도 허용
//	}
	
}

package com.shop.cafe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.shop.cafe.dao.ProductDao;
import com.shop.cafe.dto.Product;

//@Component // component가 붙어있는 애들만 new를 해준다 다 하면 과부하가 걸리기 때문
@Service
public class ProductService {

	@Autowired // productDao에 component를 해줘야함
	ProductDao productDao;
	
	public List<Product> getAllProducts() throws Exception {
		return productDao.getAllProducts();
	}
}

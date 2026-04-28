package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

	@GetMapping("/products")
	public String showList() {
		//商品一覧ぺージを作成する
		return "product/list";
	}
}

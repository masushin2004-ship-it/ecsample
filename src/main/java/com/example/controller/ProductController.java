package com.example.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.ecsample.mapper.ProductMapper;
import com.example.entity.Product;

@Controller
public class ProductController {

	private final ProductMapper productMapper;

	public ProductController(ProductMapper productMapper) {
		this.productMapper = productMapper;
	}

	@GetMapping("/products")
	public String showList(Model model) {
		// 仮のデータをべた書き
		List<Product> products = productMapper.findAll();
		model.addAttribute("products", products);
		//商品一覧ぺージを作成する
		return "product/list";
	}

	@GetMapping("/product/{id}")
	public String showDetail(@PathVariable("id") int id, Model model) {
		Product product = productMapper.findById(id);
		model.addAttribute("product", product);

		// 商品詳細ページを表示する
		return "product/detail";
	}
}

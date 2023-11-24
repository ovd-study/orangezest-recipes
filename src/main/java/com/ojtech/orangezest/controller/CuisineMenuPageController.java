package com.ojtech.orangezest.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import model.Cuisine;

@Controller
public class CuisineMenuPageController {

	@Autowired
	ObjectMapper objectMapper;

	@GetMapping("/cuisine-menu-page")
	public String index(Model model) throws IOException {
		Resource resource = new ClassPathResource("static/data/cuisine/cuisine_list.json");
		InputStream is = resource.getInputStream();
		System.out.println(is);
		TypeReference<List<Cuisine>> typeReference = new TypeReference<List<Cuisine>>() {
		};

		List<Cuisine> cuisines = objectMapper.readValue(is, typeReference);

		model.addAttribute("listData", cuisines);

		return "cuisine-menu-page";
	}
}

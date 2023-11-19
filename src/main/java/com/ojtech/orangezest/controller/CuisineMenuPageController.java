package com.ojtech.orangezest.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
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
		File file = ResourceUtils.getFile("classpath:static/data/Cuisine/Cuisine_List.json");
		System.out.println(file.getPath());
		TypeReference<List<Cuisine>> typeReference = new TypeReference<List<Cuisine>>() {
		};

		List<Cuisine> cuisines = objectMapper.readValue(file, typeReference);

		model.addAttribute("listData", cuisines);

		return "/cuisine-menu-page";
	}
}

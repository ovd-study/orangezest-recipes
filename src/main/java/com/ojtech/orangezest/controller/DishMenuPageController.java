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
import org.springframework.web.bind.annotation.ModelAttribute;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import model.Dish;

@Controller
public class DishMenuPageController {

	@Autowired
	ObjectMapper objectMapper;

	@GetMapping("/dish-menu-page")
	public String dishmenuPage(Model model, @ModelAttribute("idCuisine") Integer idCuisine) throws IOException {
		Resource resource = new ClassPathResource("static/data/cuisine/" + idCuisine + "_dish/dish_list.json");
		InputStream is = resource.getInputStream();
		System.out.println(is);
		TypeReference<List<Dish>> typeReference = new TypeReference<List<Dish>>() {
		};

		List<Dish> dishes = objectMapper.readValue(is, typeReference);

		model.addAttribute("listData", dishes);

		return "dish-menu-page";
	}

}

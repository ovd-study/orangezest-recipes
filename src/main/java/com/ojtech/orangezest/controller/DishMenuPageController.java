package com.ojtech.orangezest.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
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
		File file = ResourceUtils.getFile("classpath:static/data/Cuisine/" + idCuisine + "_Dish/Dish_List.json");
		System.out.println(file.getPath());
		TypeReference<List<Dish>> typeReference = new TypeReference<List<Dish>>() {
		};

		List<Dish> dishes = objectMapper.readValue(file, typeReference);

		model.addAttribute("listData", dishes);

		return "/dish-menu-page";
	}

}

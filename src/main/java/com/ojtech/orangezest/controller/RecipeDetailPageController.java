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

import model.Recipe;

@Controller
public class RecipeDetailPageController {

	@Autowired
	ObjectMapper objectMapper;

	@GetMapping("/recipe-detail-page")
	public String RecipeDetailPage(Model model, @ModelAttribute("idCuisine") Integer idCuisine,
			@ModelAttribute("idDish") Integer idDish) throws IOException {
		File file = ResourceUtils
				.getFile("classpath:static/data/Cuisine/" + idCuisine + "_Dish/" + idDish + "_Recipe/Recipe_List.json");
		System.out.println(file.getPath());
		TypeReference<List<Recipe>> typeReference = new TypeReference<List<Recipe>>() {
		};

		List<Recipe> recipes = objectMapper.readValue(file, typeReference);

		model.addAttribute("listData", recipes);

		return "recipe-detail-page";
	}

}

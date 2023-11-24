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

import model.Recipe;

@Controller
public class RecipeDetailPageController {

	@Autowired
	ObjectMapper objectMapper;

	@GetMapping("/recipe-detail-page")
	public String RecipeDetailPage(Model model, @ModelAttribute("idCuisine") Integer idCuisine,
			@ModelAttribute("idDish") Integer idDish) throws IOException {
		Resource resource = new ClassPathResource(
				"static/data/cuisine/" + idCuisine + "_dish/" + idDish + "_recipe/recipe_list.json");
		InputStream is = resource.getInputStream();
		System.out.println(is);
		TypeReference<List<Recipe>> typeReference = new TypeReference<List<Recipe>>() {
		};

		List<Recipe> recipes = objectMapper.readValue(is, typeReference);

		model.addAttribute("listData", recipes);

		return "recipe-detail-page";
	}

}

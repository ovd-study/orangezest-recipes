package com.ojtech.orangezest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/hello")
	public String index() {
		return "hello";
	}

	@GetMapping("/hello-boostrap")
	public String indexBootstrap() {
		return "hello_bootstrap";
	}

	@GetMapping("/hello-boostrap-grid")
	public String indexBootstrapGrid() {
		return "hello_bootstrap_grid";
	}
}

package com.company.social.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.company.social.services.LocationService;
import com.company.social.services.PostService;
import com.company.social.services.UserService;

@Controller
public class Controllers {
	
	@Autowired
	LocationService locationService;
	
	@Autowired
	UserService userService;
	
	@Autowired
	PostService postService;
	
	@RequestMapping(value = "/locations.html", method = RequestMethod.GET)
	public String getAllLocations(Model model) {
		model.addAttribute("locations", locationService.findAll());
		return "locations.html";
	}
	
	@RequestMapping(value = "/users.html", method = RequestMethod.GET)
	public String getAllUsers(Model model) {
		model.addAttribute("users", userService.findAll());
		return "users.html";
	}
	
	@RequestMapping(value = "/posts.html", method = RequestMethod.GET)
	public String getAllPosts(Model model) {
		
		model.addAttribute("posts", postService.findAll());
		return "posts.html";
	}
	
	@RequestMapping(value = "/home.html")
	public static String welcome() {
		return "index.html";
	}
}

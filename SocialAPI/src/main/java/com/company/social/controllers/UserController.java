package com.company.social.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.social.models.User;
import com.company.social.services.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userService.findAll();
	}

	@GetMapping("/users/{id}")
	public Optional<User> getUserById(@PathVariable Integer id) {
		return userService.findById(id);
	}
	
	@GetMapping("/users/location/{id}")
	public List<User> getUsersByLocationId(@PathVariable Integer id) {
	    return userService.getUsersByLocation(id);
	}
	
	@PostMapping("/users")
	public void addUser(@RequestBody User user) {
	    userService.addUser(user);
	}
	
	@PutMapping("/users/{id}")
	public void updateUser(@RequestBody User user, @PathVariable Integer id) {
	    userService.updateUser(user);
	}
	
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable Integer id) {
	     userService.deleteUser(id);
	}
}

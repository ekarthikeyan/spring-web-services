package com.karthik.rest.webservices.restfulwebservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.karthik.rest.webservices.restfulwebservices.user.User;
import com.karthik.rest.webservices.restfulwebservices.user.UserDaoService;

@RestController
public class HelloWorldController {

	@Autowired
	private UserDaoService service;
	
	@GetMapping("/HelloWorld")
	public String helloWorld()
	{
		return "HelloWorld";
	}
	@GetMapping("/users")
	public List<User> allUsers()
	{
		return service.findAll();
	}
	@GetMapping("/user/{uid}")
	public User oneUser(@PathVariable int uid)
	{
		return service.findOne(uid);
	}
	
}

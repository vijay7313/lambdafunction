package com.aws.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mainController")
public class MainController {

	@GetMapping("/users")
	public List<User> getUser() {
		List<User> list = new ArrayList<User>();
		list.add(new User("Vijay", "vraja7313@gmail.com"));
		list.add(new User("karthi", "karthi@gmail.com"));
		System.out.println(list.get(0).getName());
		return list;
	}

	@GetMapping("/apitest")
	public String message() {
		return "success";
	}

}

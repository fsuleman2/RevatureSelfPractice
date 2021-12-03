package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class MyController {
	
	@GetMapping("/foos")
	public String getFooByIdUsingQueryParam1(@RequestParam String id) {
	    return "ID: " + id;
	}
	@GetMapping("{userId}")
	public Integer getFooByIdUsingQueryParam(@PathVariable("userId") Integer id) {
	    return id;
	}
}

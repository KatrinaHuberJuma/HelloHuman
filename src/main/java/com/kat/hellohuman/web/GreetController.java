package com.kat.hellohuman.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
	
	@RequestMapping("/")
	public String greet(@RequestParam(value="name", required=false) String name) {
		if (name == null){
			return "Hello ....Human.";
		} else {
			return "Hello " + name + "! Nice to meet you!";
		}
	}
	
}

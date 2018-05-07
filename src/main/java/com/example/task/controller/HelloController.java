package com.example.task.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(value="/")
	public Map<String, String> helloWorld(){
		Map<String, String> message = new HashMap<>();
		message.put("message", "hello world!!");
		return message;
	}
}

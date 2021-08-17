package com.bjss.jacksavage.quizmanager.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class QuizController {

	@GetMapping("/api/hello-world")
	public String helloWorld(@RequestParam(value = "name", defaultValue = "World") String name) {
		log.info("/hello-world hit");
		return String.format("Hello, %s!", name);
	}
}

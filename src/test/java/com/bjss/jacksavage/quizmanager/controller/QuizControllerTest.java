package com.bjss.jacksavage.quizmanager.controller;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
public class QuizControllerTest {

	@Autowired
	private MockMvc mockMvc;

	private final String HELLO_WORLD_PATH = "/api/hello-world";

	@Test
	public void returnsHelloWorld() throws Exception {
		mockMvc.perform(get(HELLO_WORLD_PATH)).andDo(print())
			.andExpect(status().isOk())
			.andExpect(content().string(containsString("Hello, World")));
	}

	@Test
	public void returnsPersonalisedHelloWorld() throws Exception {
		mockMvc.perform(get(HELLO_WORLD_PATH + "?name=Jason")).andDo(print())
			.andExpect(status().isOk())
			.andExpect(content().string(containsString("Hello, Jason")));
	}
}

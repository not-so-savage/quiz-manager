package com.bjss.jacksavage.quizmanager;

import static org.assertj.core.api.Assertions.assertThat;

import com.bjss.jacksavage.quizmanager.controller.QuizController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class QuizManagerApplicationTests {

	@Autowired
	private QuizController controller;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}

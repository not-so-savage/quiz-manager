package com.bjss.jacksavage.quizmanager.controller;

import com.intuit.karate.junit5.Karate;

public class QuizRunner {

	@Karate.Test
	Karate testAll() {
		return Karate.run().relativeTo(getClass());
	}
}

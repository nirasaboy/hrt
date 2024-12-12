package com.bluepal.service;

import java.util.List;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;

@FeignClient(url = "http://localhost:8082",value = "Question-Client")
public interface QuestionClient {
	
	List<Question> getQuestionOfQuiz();

}

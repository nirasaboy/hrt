package com.bluepal.service;

import java.util.List;

import com.bluepal.entity.Quiz;

public interface QuizService {
	
	Quiz add(Quiz quiz);
	
	List<Quiz> get();
	
	Quiz get(Long id);

}

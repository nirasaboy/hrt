package com.bluepal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluepal.entity.Quiz;
import com.bluepal.repo.QuizRepository;

@Service
public class QuizServiceImpl implements QuizService {
	
	@Autowired
	private QuizRepository quizRepository;
	
	public QuizServiceImpl(QuizRepository quizRepository) {
		this.quizRepository = quizRepository;
	}
	


	@Override
	public Quiz add(Quiz quiz) {
		// TODO Auto-generated method stub
		return quizRepository.save(quiz);
	}

	@Override
	public List<Quiz> get() {
		// TODO Auto-generated method stub
		return quizRepository.findAll();
	}

	@Override
	public Quiz get(Long id) {
		// TODO Auto-generated method stub
		return quizRepository.findById(id).orElseThrow(() -> new RuntimeException("Quiz not found"));
	}

}

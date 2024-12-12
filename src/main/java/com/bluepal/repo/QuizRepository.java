package com.bluepal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bluepal.entity.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long> {

}

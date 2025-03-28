package com.question.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.question.entities.Question;

public interface QuestionRepository extends JpaRepository<Question, Long>{

	List<Question> findByQuizId(long quizId);
	
}

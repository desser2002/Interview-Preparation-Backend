package org.dzianisbova.interviewprepback.domain.repository;

import org.dzianisbova.interviewprepback.domain.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}

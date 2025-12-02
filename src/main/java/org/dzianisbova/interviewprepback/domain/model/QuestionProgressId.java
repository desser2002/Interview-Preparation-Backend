package org.dzianisbova.interviewprepback.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class QuestionProgressId implements Serializable {
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "question_id")
    private Long questionId;
}

package org.dzianisbova.interviewprepback.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.dzianisbova.interviewprepback.domain.model.QuestionProgressId;

@Entity
@Table(name = "question_progress")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestionProgress {
    @EmbeddedId
    private QuestionProgressId questionProgressId;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @MapsId("questionId")
    @JoinColumn(name = "question_id")
    private Question question;

    private boolean isPassed;
}

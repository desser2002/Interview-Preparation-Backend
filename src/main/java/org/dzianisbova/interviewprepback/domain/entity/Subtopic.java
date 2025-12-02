package org.dzianisbova.interviewprepback.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="subtopics")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subtopic {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @ManyToOne
    @JoinColumn(name="topic_id",nullable = false)
    private Topic topic;

    @OneToMany(mappedBy = "subtopic",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Question> question = new ArrayList<>();

    public Subtopic(String name, Topic topic) {
        this.name = name;
        this.topic = topic;
    }
}

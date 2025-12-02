package org.dzianisbova.interviewprepback.domain.repository;

import org.dzianisbova.interviewprepback.domain.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic,Long> {
}

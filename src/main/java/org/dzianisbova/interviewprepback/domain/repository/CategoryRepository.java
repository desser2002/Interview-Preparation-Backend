package org.dzianisbova.interviewprepback.domain.repository;

import org.dzianisbova.interviewprepback.domain.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

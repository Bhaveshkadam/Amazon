package com.amazon.persistance.repository;

import com.amazon.persistance.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity,Integer> {
}

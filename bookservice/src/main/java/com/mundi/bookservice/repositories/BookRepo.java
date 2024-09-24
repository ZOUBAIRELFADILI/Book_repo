package com.mundi.bookservice.repositories;

import com.mundi.bookservice.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Long> {

}

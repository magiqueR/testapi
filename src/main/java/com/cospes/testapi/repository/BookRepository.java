package com.cospes.testapi.repository;

import com.cospes.testapi.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long>{


}

package com.library_api.repository;

import com.library_api.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.Year;
import java.util.Optional;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {


    Iterable<Book> findByAuthor(String author);

    Optional<Book> findByIsbn(String isbn);

    Iterable<Book> findByYear(Year year);
}

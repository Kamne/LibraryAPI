package com.library_api.controller;

import com.library_api.model.Book;
import com.library_api.repository.BookRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Year;
import java.util.Optional;

@RestController
@RequestMapping("/books/")
@Tag(name = "Library API Controller", description = "This REST Controller provide services to manage books in the Book Tracker application")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Creates a new book in the book tracker application")
    public Book createBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    @Operation(summary = "Provides all books available in the book tracker application")
    public Iterable<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @GetMapping("{id}")
    @ResponseStatus(code = HttpStatus.OK)
    @Operation(summary = "Provides book details for the supplied book id from book tracker application")
    public ResponseEntity<Book> getBookById(
            @PathVariable("id") Long  bookId) {
        Optional<Book> optionalBook =  bookRepository.findById(bookId);
        if(optionalBook.isPresent()){
            return new ResponseEntity<>(optionalBook.get(), HttpStatus.OK);
        }
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

    }

    @GetMapping("author/{author}")
    @ResponseStatus(code = HttpStatus.OK)
    @Operation(summary = "Provides book details for the supplied book author from book tracker application")
    public Iterable<Book> getBookByAuthor(@PathVariable String author) {
        return bookRepository.findByAuthor(author);
    }

    @GetMapping("isbn/{isbn}")
    @ResponseStatus(code = HttpStatus.OK)
    @Operation(summary = "Provides book details for the supplied book isbn from book tracker application")
    public ResponseEntity<Book> getBookByISBN(@PathVariable String isbn) {
        Optional<Book> optionalBook = bookRepository.findByIsbn(isbn);
        if(optionalBook.isPresent())
            return new ResponseEntity<>(optionalBook.get(), HttpStatus.OK);
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @GetMapping("year/{year}")
    @ResponseStatus(code = HttpStatus.OK)
    @Operation(summary = "Provides book details for the supplied book year from book tracker application")
    public Iterable<Book> getAllBooksByYear(@PathVariable Year year) {
        return bookRepository.findByYear(year);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    @Operation(summary = "Updates the book details for the supplied book id from book tracker application")
    public Book updateBook(
            @PathVariable Long id,
            @RequestBody Book book) {
        book.setId(id);
        return bookRepository.save(book);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    @Operation(summary = "Deletes book details for the supplied book id from book tracker application")
    public void deleteBook(
           @PathVariable Long id) {
        bookRepository.deleteById(id);
    }

    @DeleteMapping
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    @Operation(summary = "Deletes all book  from book tracker application")
    public void deleteBooks() {
        bookRepository.deleteAll();
    }
}

package com.library_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.time.Year;


@Data
@Builder
@Entity
@Table(name = "Books")
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "ISBN")
    private String isbn;

    @Column(name = "author")
    private String author;

    @Column(name = "year")
    private Year year;

    @Column(name = "publisher")
    private String publisher;

}

# LibraryAPI
Create a simple REST API application for managing books in a library using Spring, MySQL as the database, and Postman for testing.

## Tech
- Java 17
- Spring Boot
- MySQL
- Maven
- IDE: IntelliJ o Spring Tool Suite

## API
## POST `http://localhost:8080/books/`
**Description:** Creates a new book in the book  application

**Body JSON:**
```json
{
    "title": "Shōgun",
    "description": "After Englishman John Blackthorne is lost at sea, he awakens in a place few Europeans know of and even fewer have seen: Nippon. Thrust into the closed society that is seventeenth-century Japan, a land where the line between life and death is razor-thin, Blackthorne must negotiate not only a foreign people, with unknown customs and language, but also his own definitions of morality, truth, and freedom. As internal political strife and a clash of cultures lead to seemingly inevitable conflict, Blackthorne’s loyalty and strength of character are tested by both passion and loss, and he is torn between two worlds that will each be forever changed.",
    "isbn": " 979-8212173476",
    "author": "James Clavell",
    "year": 2023,
    "publisher": "Blackstone Publishing, Inc."
    
}
```
**Response:**
```json
[
  {
    "id": 2,
    "title": "Shōgun",
    "description": "After Englishman John Blackthorne is lost at sea, he awakens in a place few Europeans know of and even fewer have seen: Nippon. Thrust into the closed society that is seventeenth-century Japan, a land where the line between life and death is razor-thin, Blackthorne must negotiate not only a foreign people, with unknown customs and language, but also his own definitions of morality, truth, and freedom. As internal political strife and a clash of cultures lead to seemingly inevitable conflict, Blackthorne’s loyalty and strength of character are tested by both passion and loss, and he is torn between two worlds that will each be forever changed.",
    "isbn": " 979-8212173476",
    "author": "James Clavell",
    "year": "2023",
    "publisher": "Blackstone Publishing, Inc."
  }
]
```
**HttpStatus Codes:**
- 201 Created - Book created
- 500 Internal Server Error

## GET `http://localhost:8080/books/`
**Description:** Provides all books available in the book application

**Response:**
```json
[
  {
    "id": 2,
    "title": "Shōgun",
    "description": "After Englishman John Blackthorne is lost at sea, he awakens in a place few Europeans know of and even fewer have seen: Nippon. Thrust into the closed society that is seventeenth-century Japan, a land where the line between life and death is razor-thin, Blackthorne must negotiate not only a foreign people, with unknown customs and language, but also his own definitions of morality, truth, and freedom. As internal political strife and a clash of cultures lead to seemingly inevitable conflict, Blackthorne’s loyalty and strength of character are tested by both passion and loss, and he is torn between two worlds that will each be forever changed.",
    "isbn": " 979-8212173476",
    "author": "James Clavell",
    "year": "2023",
    "publisher": "Blackstone Publishing, Inc."
  },
  {
    "id": 5,
    "title": "The Hobbit",
    "description": "Bilbo Baggins is a hobbit who enjoys a comfortable, unambitious life, rarely travelling further than the pantry of his hobbit-hole in Bag End. But his contentment is disturbed when the wizard, Gandalf, and a company of thirteen dwarves arrive on his doorstep one day to whisk him away on an unexpected journey ‘there and back again.’ They have a plot to raid the treasure hoard of Smaug the Magnificent, a large and very dangerous dragon . . .",
    "isbn": "978-0063347533",
    "author": "J. R. R. Tolkien",
    "year": "1937",
    "publisher": "George Allen & Unwin"
  }
]
```
**HttpStatus Codes:**
- 200 OK - Result

## GET `http://localhost:8080/books/5`
**Description:** Provides book details for the supplied book id from book application

**Response:**
```json
[
  {
    "id": 5,
    "title": "The Hobbit",
    "description": "Bilbo Baggins is a hobbit who enjoys a comfortable, unambitious life, rarely travelling further than the pantry of his hobbit-hole in Bag End. But his contentment is disturbed when the wizard, Gandalf, and a company of thirteen dwarves arrive on his doorstep one day to whisk him away on an unexpected journey ‘there and back again.’ They have a plot to raid the treasure hoard of Smaug the Magnificent, a large and very dangerous dragon . . .",
    "isbn": "978-0063347533",
    "author": "J. R. R. Tolkien",
    "year": "1937",
    "publisher": "George Allen & Unwin"
  }
]
```
**HttpStatus Codes:**
- 200 OK - Result
- 404 Not found

## GET `http://localhost:8080/books/isbn/978-0063347533`
**Description:** Provides book details for the supplied book isbn from book application

**Response:**
```json
[
  {
    "id": 5,
    "title": "The Hobbit",
    "description": "Bilbo Baggins is a hobbit who enjoys a comfortable, unambitious life, rarely travelling further than the pantry of his hobbit-hole in Bag End. But his contentment is disturbed when the wizard, Gandalf, and a company of thirteen dwarves arrive on his doorstep one day to whisk him away on an unexpected journey ‘there and back again.’ They have a plot to raid the treasure hoard of Smaug the Magnificent, a large and very dangerous dragon . . .",
    "isbn": "978-0063347533",
    "author": "J. R. R. Tolkien",
    "year": "1937",
    "publisher": "George Allen & Unwin"
  }
]
```
**HttpStatus Codes:**
- 200 OK - Result
- 404 Not found

## GET `http://localhost:8080/books/year/1937`
**Description:** Provides book details for the supplied book year from book application

**Response:**
```json
[
  {
    "id": 5,
    "title": "The Hobbit",
    "description": "Bilbo Baggins is a hobbit who enjoys a comfortable, unambitious life, rarely travelling further than the pantry of his hobbit-hole in Bag End. But his contentment is disturbed when the wizard, Gandalf, and a company of thirteen dwarves arrive on his doorstep one day to whisk him away on an unexpected journey ‘there and back again.’ They have a plot to raid the treasure hoard of Smaug the Magnificent, a large and very dangerous dragon . . .",
    "isbn": "978-0063347533",
    "author": "J. R. R. Tolkien",
    "year": "1937",
    "publisher": "George Allen & Unwin"
  }
]
```
**HttpStatus Codes:**
- 200 OK - Result
- 404 Not found
- 
## PUT `http://localhost:8080/books/5`
**Description:** Updates the book details for the supplied book id from book application

**HttpStatus Codes:**
- 204 No content - Success
- 404 Not found

## DELETE `http://localhost:8080/books/5`
**Description:** Deletes book details for the supplied book id from book application

**HttpStatus Codes:**
- 204 No content - Success
- 404 Not found

## DELETE `http://localhost:8080/books/`
**Description:** Deletes all book  from book application

**HttpStatus Codes:**
- 204 No content - Success
- 404 Not found

## Links

[WritingCode on Youtube channel](https://www.youtube.com/@WritingCode-bq3gk)

[On Youtube channel: Spring Boot + MySQL + Postman. Complete step-by-step guide. API CRUD](https://youtu.be/y5uwdRaZa3E)
CREATE TABLE books
(
    id            BIGINT AUTO_INCREMENT NOT NULL,
    title         VARCHAR(255)          NULL,
    `description` text          NULL,
    isbn          VARCHAR(15)     UNIQUE     NOT NULL,
    author        VARCHAR(255)          NULL,
    year          year                  NULL,
    publisher     VARCHAR(255)          NULL,
    CONSTRAINT pk_books PRIMARY KEY (id)

);
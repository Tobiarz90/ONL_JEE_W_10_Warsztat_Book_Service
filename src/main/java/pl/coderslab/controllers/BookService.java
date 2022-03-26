package pl.coderslab.controllers;

import pl.coderslab.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();

    Book getBook(long id);

    void editBook(Book book);

    void deleteBook(long id);

    void addBook(Book book);
}

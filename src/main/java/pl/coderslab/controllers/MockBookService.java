package pl.coderslab.controllers;

import org.springframework.stereotype.Component;
import pl.coderslab.model.Book;

import java.util.ArrayList;
import java.util.List;

@Component
public class MockBookService implements BookService {
    /*
    Klasa ta powinna posiadać metody:
    - pobieranie listy wszystkich książek,
    - pobieranie obiektu po wskazanym identyfikatorze,
    - edycja obiektu,
    - usuwanie obiektu.
     */

    private final List<Book> bookList;

    public MockBookService() {
        bookList = new ArrayList<>();
        bookList.add(new Book(1L, "9788324631766", "Thiniking in Java", "Bruce Eckel", "Helion", "programming"));
        bookList.add(new Book(2L, "9788324627738", "Rusz glowa Java.", "Sierra Kathy, Bates Bert", "Helion",
                "programming"));
        bookList.add(new Book(3L, "9780130819338", "Java 2. Podstawy", "Cay Horstmann, Gary Cornell", "Helion",
                "programming"));
    }

    @Override
    public List<Book> getAllBooks() {
        return bookList;
    }

    @Override
    public Book getBook(long id) {
        for (Book book : bookList) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    @Override
    public void editBook(Book book) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getId().equals(book.getId())) {
                bookList.set(i, book);
            }
        }
    }

    @Override
    public void deleteBook(long id) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getId() == id) {
                bookList.remove(i);
            }
        }
    }

    @Override
    public void addBook(Book book) {
        bookList.add(book);
    }
}

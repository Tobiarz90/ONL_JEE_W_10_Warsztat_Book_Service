package pl.coderslab.controllers;

import org.springframework.web.bind.annotation.*;
import pl.coderslab.model.Book;

import java.util.List;


@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping()
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable Long id) {
        return bookService.getBook(id);
    }

    @PostMapping()
    public void addBook(@RequestBody Book book) {
        bookService.addBook(book);
    }

    @PutMapping()
    public void updateBook(@RequestBody Book book) {
        bookService.editBook(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }
}

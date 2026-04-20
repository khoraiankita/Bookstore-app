package com.bookstore.bookstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookRepository repo;

    @GetMapping("/")
    public String home() {
        return "Bookstore App is Running 🚀";
    }

    @PostMapping("/add")
    public Book addBook(@RequestBody Book book) {
        return repo.save(book);
    }

    @GetMapping("/books")
    public List<Book> getBooks() {
        return repo.findAll();
    }
    
    @PutMapping("/books/{id}")
    public Book updateBook(@PathVariable int id, @RequestBody Book book) {
        book.setId(id);
        return repo.save(book);
    }
    
    @DeleteMapping("/books/{id}")
    public String deleteBook(@PathVariable int id) {
        repo.deleteById(id);
        return "Book deleted!";
    }
    @GetMapping("/search/title")
    public List<Book> searchByTitle(@RequestParam String title) {
        return repo.findByTitleContaining(title);
    }

    @GetMapping("/search/author")
    public List<Book> searchByAuthor(@RequestParam String author) {
        return repo.findByAuthorContaining(author);
    }

    @GetMapping("/filter/category")
    public List<Book> filterByCategory(@RequestParam String category) {
        return repo.findByCategory(category);
    }

    @GetMapping("/filter/price")
    public List<Book> filterByPrice(@RequestParam double min, @RequestParam double max) {
        return repo.findByPriceBetween(min, max);
    }
}
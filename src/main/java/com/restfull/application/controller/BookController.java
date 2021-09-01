package com.restfull.application.controller;

import com.restfull.application.model.Book;
import com.restfull.application.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Book> getAllBook(){
        return bookService.getBookList();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Book addBook(@RequestBody Book book){
        return bookService.saveBook(book);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Book updateBook(@PathVariable Long id,@RequestBody Book book){
        return bookService.updateBook(book,id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteBook(@PathVariable Long id){
        bookService.deleteBook(id);
    }
}

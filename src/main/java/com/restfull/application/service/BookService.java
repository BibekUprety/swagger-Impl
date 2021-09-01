package com.restfull.application.service;

import com.restfull.application.model.Book;

import java.util.List;

public interface BookService {

    List<Book> getBookList();

    Book saveBook(Book book);

    Book updateBook(Book book,Long id);

    void deleteBook(Long id);

}

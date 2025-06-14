package com.example.LMS_api.service;

import com.example.LMS_api.model.Book;
import com.example.LMS_api.repository.BookRepository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface BookService {
    Book saveBook(Book book);
    List<Book> getAllBooks();
    Optional<Book> getBookById(String id);
    Map<String, List<Book>> getBooksGroupedByAuthor();
    void deleteBook(String id);
}

package com.example.LMS_api.service;

import com.example.LMS_api.model.Book;
import com.example.LMS_api.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository repository;

    public BookServiceImpl(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public Book saveBook(Book book) {
        return repository.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return repository.findAll();
    }



    @Override
    public Map<String, List<Book>> getBooksGroupedByAuthor() {
        return Map.of();
    }

    @Override
    public void deleteBook(String id) {
         repository.deleteById(id);
    }

    @Override
    public Optional<Book> getBookById(String id) {
        return repository.findById(id);
    }

}

package com.example.Controle.service;

import com.example.Controle.dto.BookDTO;
import com.example.Controle.entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
        List<Book> getAllBooks();
        Optional<Book> getBookById(Long id);
        Book addBook(Book book);
        boolean deleteBook(Long id);
        Book updateBook(Book book);

        List<BookDTO> saveAvions(List<BookDTO> bookDtos);

        <BookDto> BookDto saveBook(BookDTO book);
}
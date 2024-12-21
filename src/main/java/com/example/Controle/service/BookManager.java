package com.example.Controle.service;

import com.example.Controle.dto.BookDTO;
import com.example.Controle.entity.Book;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    @Controller
    @AllArgsConstructor
    public class BookManager implements BookService{
        private BookRepository bookRepository;
        private BookMapper bookMapper;
        @Override
        public BookDTO saveBook(BookDTO bookDto) {
            Book book= bookMapper.BookDTOBook(bookDto);
            book=bookRepository.save(book);
            bookDto=bookMapper.fromBookToBookDTO(book);
            return bookDto;
        }


        @Override
        public Boolean deleteBook(Long id) {
            try{
                bookRepository.findById(id);
                return true;
            }catch (Exception exception){
                return  false;
            }
        }

        @Override
        public List<BookDTO> getBookByTitle(String title) {
            List<Book>books=bookRepository.findBookByTitle(title);
            List<BookDTO>bookDtos=new ArrayList<>();
            for(Book book:books){
                bookDtos.add(bookMapper.fromBookToBookDTO(book));
            }

            return bookDtos;
        }

        @Override
        public List<BookDTO> saveAvions(List<BookDTO> bookDtos) {
            List<Book>books=new ArrayList<>();
            for(BookDTO bookDto:bookDtos){
                books.add(bookMapper.BookDTOBook(bookDto));
            }


            return bookDtos;
        }


        @Override
        public List<BookDTO> getBookByTitleAndAuthor(String title, String Author) {
            List<Book>books=bookRepository.findBookByTitleAndAuthor(title,Author);
            List<BookDTO> bookDtos=new ArrayList<>();
            for (Book book:books) {
                bookDtos.add(bookMapper.fromBookToBookDTO(book));
            }


            return bookDtos;
        }
    }

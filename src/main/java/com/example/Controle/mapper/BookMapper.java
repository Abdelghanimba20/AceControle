package com.example.Controle.mapper;

import com.example.Controle.dto.BookDTO;
import com.example.Controle.entity.Book;
import org.springframework.stereotype.Component;


    @Component
    public class BookMapper {
        public BookDTO toDTO(Book book) {
            if (book == null) {
                return null;
            }
            return BookDTO.builder()
                    .titre(book.getTitre())
                    .publisher(book.getPublisher())
                    .datePublication(book.getDatePublication())
                    .price(book.getPrice())
                    .resume(book.getResume())
                    .build();
        }
        public Book toEntity(BookDTO bookDTO) {
            if (bookDTO == null) {
                return null;
            }
            return new Book(
                    null, // L'ID sera généré automatiquement par la base de données
                    bookDTO.getTitre(),
                    bookDTO.getPublisher(),
                    bookDTO.getDatePublication(),
                    bookDTO.getPrice(),
                    bookDTO.getResume()
            );
        }
    }


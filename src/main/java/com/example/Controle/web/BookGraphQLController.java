package com.example.Controle.web;

import com.example.Controle.dto.BookDTO;
import com.example.Controle.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

public class BookGraphQLController {
    @Controller
    @AllArgsConstructor
    public static class BookGraphQlController {
        private BookService bookService;
        @MutationMapping
        public <BookDto> BookDto saveBook(@Argument BookDTO book ){
            return bookService.saveBook(book);
        }
        @QueryMapping
        public List<BookDTO> getBookByTitle(@Argument  String title){
            return bookService.getBookByTitle(title);
        }
    }

}

package com.example.Controle.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public class BookDTO {

        private String titre;
        private String publisher;
        private LocalDate datePublication;
        private Double price;
        private String resume;
}
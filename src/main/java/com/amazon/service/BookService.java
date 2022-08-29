package com.amazon.service;

import com.amazon.persistance.POJO.BookRequest;
import com.amazon.persistance.POJO.BookResponse;
import com.amazon.persistance.entity.BookEntity;
import com.amazon.persistance.repository.BookRepository;
import com.sun.istack.NotNull;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public BookResponse addBook(final BookRequest request) {
        final BookEntity byName = bookRepository.save(BookEntity.builder()
                .name(request.getName())
                .bookDescription(request.getBookDescription())
                .bookPrice(request.getBookPrice())
                .bookAvailability(request.getBookAvailability())
                .build());
        return toBook(byName);
    }
    private BookResponse toBook (@NotNull final BookEntity bookEntity) {
        return BookResponse.builder()
                .bookId(bookEntity.getBookId())
                .name(bookEntity.getName())
                .message("Book created successfully")
                .build();
    }
}

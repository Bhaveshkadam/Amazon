package com.amazon.controller;

import com.amazon.persistance.POJO.BookRequest;
import com.amazon.persistance.POJO.BookResponse;
import com.amazon.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1")
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/book")
    public ResponseEntity<BookResponse> addBook(@RequestBody final BookRequest bookRequest) {
        return ResponseEntity.ok(bookService.addBook(bookRequest));
    }
}

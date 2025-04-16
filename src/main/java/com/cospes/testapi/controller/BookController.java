package com.cospes.testapi.controller;

import com.cospes.testapi.model.Book;
import com.cospes.testapi.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/libri")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public List<Book> getAll(){
        return bookRepository.findAll();

    }

    @PostMapping
    public Book create(@RequestBody Book book){
        return bookRepository.save(book);
    }

    @GetMapping("/id")
    public Book getById(@PathVariable long id){
        return bookRepository.findById(id).orElse(null);
    }
}

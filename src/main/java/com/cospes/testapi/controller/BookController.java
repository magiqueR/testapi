package com.cospes.testapi.controller;

import com.cospes.testapi.model.Book;
import com.cospes.testapi.repository.BookRepository;
import org.springanche a me da erroframework.beans.factory.annotation.Autowired;
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

    public Book updateBook (@PathVariable Long id, @RequestBody Book updateBook){
        return bookRepository.findById(id).map( book -->
        {
             book.setTitolo(updateBook.getTitolo());
             book.setAutore(updateBook.getAutore());
             return bookRepository.save(book);
        }).orElse(null);

        //versione alternativa
        Book updateBook2 = bookRepository.findById(id);

        if(bookFromDB != null){
            bookFromDB.setAutore(updateBook.getAutore());
            bookFromDB.setTitolo(updateBook.getTitolo());

            bookRepository.save(bookFromDB);
        }
        else{
            return null;
        }
    }
}

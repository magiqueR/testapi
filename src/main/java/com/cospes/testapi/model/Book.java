package com.cospes.testapi.model;

import jakarta.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String titolo;
    private String autore;

    //costruttore
    public Book(){}

    public Book(String titolo, String autore){
        this.titolo = titolo;
        this.autore = autore;
    }

    public String getAutore() {
        return autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
}

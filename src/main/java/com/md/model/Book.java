package com.md.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "BOOK")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDBOOK")
    private Integer bookId;

    //@OneToMany
    //List<Reader> readers;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "pages")
    private int pages;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Integer getBookId() {
        return bookId;
    }

    /*public List<Reader> getReaders() {
        return readers;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public void setReaders(List<Reader> readers) {
        this.readers = readers;
    }
*/}

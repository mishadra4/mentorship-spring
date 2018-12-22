package com.md.dao.impl;

import com.md.dao.BookDao;
import com.md.model.Book;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class BookDaoImpl implements BookDao {

    @PersistenceContext
    EntityManager entityManager;


    @Override
    public Book getBookById(int ID) {
        return null;
    }

    @Override
    public List<Book> getBooksByReaderID(int ID) {
        return null;
    }

    @Override
    public void RemoveBookById(int ID) {

    }

    @Override
    public void insertBook(Book book) {

    }

    @Override
    public void updateBook(Book book) {

    }
}

package com.md.dao;

import com.md.model.Reader;

import java.util.List;

public interface ReaderDAO {
    Reader getReader(Integer id);
    Reader getReader(String username);
    List<Reader> getAllReaders();

}

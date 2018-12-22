package com.md.dao.impl;

import com.md.dao.ReaderDAO;
import com.md.model.Reader;
import com.md.repository.ReaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.Collections;
import java.util.List;

@Repository
@Transactional
public class ReaderDaoImpl implements ReaderDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private ReaderRepository readerRepository;

    @Override
    public Reader getReader(Integer id) {
        return readerRepository.findOne(id);//entityManager.find(Reader.class, id);
    }

    @Override
    public Reader getReader(String username) {
        String query= "from Student where username = ?";
        TypedQuery<Reader> typedQuery = entityManager.createQuery(query, Reader.class);
        typedQuery.setParameter(1, username);
        return typedQuery.getSingleResult();
    }

    @Override
    public List<Reader> getAllReaders(){
        /*String query = "from Student order by ID";
        TypedQuery<Reader> typedQuery = entityManager.createQuery(query, Reader.class);
        return typedQuery.getResultList();*/
        return (List<Reader>) readerRepository.findAll(Collections.EMPTY_LIST);
    }

    public static void main(String[] args) {
    }

    public void deleteReader(int id) {
        /*String queryString = "delete from student where idStudent=?";
        Query query = entityManager.createNativeQuery(queryString);
        query.setParameter(1, idStudent);
        int result = query.executeUpdate();

        return result > 0;*/
        readerRepository.delete(id);
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public ReaderRepository getReaderRepository() {
        return readerRepository;
    }

    public void setReaderRepository(ReaderRepository readerRepository) {
        this.readerRepository = readerRepository;
    }
}

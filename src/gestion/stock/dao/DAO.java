package gestion.stock.dao;

import java.util.List;
import java.util.UUID;

public interface DAO<T> {
    void create(T obj) throws Exception;
    T findById(UUID id) throws Exception;
    List<T> findAll() throws Exception;
    void update(T obj) throws Exception;
    void delete(UUID id) throws Exception;
}
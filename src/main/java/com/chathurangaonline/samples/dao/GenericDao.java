package com.chathurangaonline.samples.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDao <T> {

    T save(T t);

    void update(T t);

    void delete(T t);

    T findById(Serializable id);

    List<T> findAll();

}

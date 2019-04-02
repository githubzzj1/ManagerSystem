package com.z.manager.dao;

import java.util.List;

public interface IBaseDao<T> {
    int add(T t);
    int delete(T t);
    int update(T t);
    T getById(int id);
    List<T> getList();


}

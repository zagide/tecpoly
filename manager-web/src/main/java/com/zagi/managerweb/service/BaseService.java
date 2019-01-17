package com.zagi.managerweb.service;

public interface BaseService<T> {


    T getById(String id);

    int updateById(String id, T t);

}

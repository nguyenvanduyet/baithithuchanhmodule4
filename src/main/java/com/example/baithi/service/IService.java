package com.example.baithi.service;

import java.util.List;

public interface IService <T>{
    List <T> findAll();
    void delete (Long id);
    T edit (T t);
    T create (T t);
}

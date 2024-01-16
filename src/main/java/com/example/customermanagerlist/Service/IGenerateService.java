package com.example.customermanagerlist.Service;

import org.springframework.data.domain.Page;

import java.util.Optional;

public interface IGenerateService<T> {
    Iterable<T> findAll();

    void save(T t);

    Optional<T> findById(int id);

    void remove(int id);
}

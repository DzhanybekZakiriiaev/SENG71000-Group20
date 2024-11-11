package com.example.SENG71000_Group20.service.common;

import jakarta.validation.constraints.NotNull;
import org.webjars.NotFoundException;

import java.util.List;

public interface BaseService <T, P> {

    T get(@NotNull P id) throws NotFoundException;

    List<T> get(@NotNull List<P> ids) throws NotFoundException;

    T saveOrUpdate(@NotNull T t);

    List<T> saveOrUpdate(@NotNull List<T> t);

    void delete(T t);

    void deleteById(@NotNull Long id);
}
package com.example.SENG71000_Group20.service.common.impl;

import com.example.SENG71000_Group20.service.common.BaseService;
import org.webjars.NotFoundException;

import java.io.Serializable;
import java.util.List;

public class DefaultBaseService<T, P> implements BaseService<T,P> {
    @Override
    public Object get(Object id) throws NotFoundException {
        return null;
    }

    @Override
    public List get(List ids) throws NotFoundException {
        return null;
    }

    @Override
    public Object saveOrUpdate(Object o) {
        return null;
    }

    @Override
    public List saveOrUpdate(List t) {
        return null;
    }

    @Override
    public void delete(Object o) {

    }

    @Override
    public void deleteById(Long id) {

    }
}

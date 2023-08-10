package com.backend.integrador.dao;

import com.backend.integrador.entity.Odontologo;

import java.util.List;

public interface IDao<T> {
    T registrarOdontologo(T t);
    List<T> listarOdontologos();
}

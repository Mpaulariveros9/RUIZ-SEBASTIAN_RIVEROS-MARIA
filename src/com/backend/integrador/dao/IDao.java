package com.backend.integrador.dao;

import com.backend.integrador.entity.Odontologo;

import java.util.List;

public interface IDao<T> {
    //en esta instancia los metodos debieran ser generales, porque puede haber otras entidades, ej registrar(), listar()
    T registrarOdontologo(T t);
    List<T> listarOdontologos();
}

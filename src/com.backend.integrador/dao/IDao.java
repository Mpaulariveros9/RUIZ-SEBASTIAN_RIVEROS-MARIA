package impl;

import java.util.list;
public interface IDao<T> {
    T registrar(T t);
    T buscarPorId(int id);
    void eliminar(int id);
    List<T> listarTodos();

}
package mos.car.service;

import java.util.List;

public interface IGenericService<T>{
    T create(T t);
    T get(String id);
    T delete (String id);
    T update(T t);
    List<T> getAll();
}

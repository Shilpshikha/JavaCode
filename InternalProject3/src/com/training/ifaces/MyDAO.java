package com.training.ifaces;
import java.io.Serializable;
import java.util.*;
public interface MyDAO<T> {

	public Serializable add(T t);
	public List<T> find(Serializable obj);
	public List<T> findAll();
	public T update(T obj);
	public boolean delete(Serializable obj);
}

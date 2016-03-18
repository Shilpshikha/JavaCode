package com.training.ifaces;
import java.io.Serializable;
import java.util.*;
public interface MyDAO<T> {

	public Object add(T t);
	public T find(Serializable obj);
	public List<T> findAll();
	public T update(T obj);
	public boolean delete(Serializable obj);
}

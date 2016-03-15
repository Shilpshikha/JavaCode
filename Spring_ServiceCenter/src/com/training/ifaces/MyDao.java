package com.training.ifaces;

import java.util.List;

public interface MyDao<T> {

	public boolean add(T t);
	public T find(int key);
	public List<T> findAll();
}

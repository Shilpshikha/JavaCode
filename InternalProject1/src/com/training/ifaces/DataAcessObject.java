package com.training.ifaces;

import java.util.List;

public interface DataAcessObject<T> {

	public int add(T t);
	public T find(String key);
	public List<T> findAll();
	public int update(String key);
	public int delete(String key);
	
}

package com.training.ifaces;

import java.util.List;

import com.training.daos.Customer;

public interface DataAccessObject<T> {
	
	//create, read, update, delete
	public int add(T t);
	public T find(int cid);
	public List<T> findAll();
	public int update(int key);
	public int delete(int key);

}

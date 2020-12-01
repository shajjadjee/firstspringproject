package com.firstspringproject.customer;

public interface DataAccess<T> {
	public T save(T entity);
	public T update(T entity);
	public T getbyId(T entity);

//	public String save(T object);
}

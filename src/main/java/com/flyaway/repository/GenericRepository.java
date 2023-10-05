package com.flyaway.repository;

import java.util.List;

public interface GenericRepository<ID, M> {
	
	public M findById(ID id);
	public List<M> findAll();
	public M save(M m);
	public void deleteById(ID id);
	public M update(M m);

}

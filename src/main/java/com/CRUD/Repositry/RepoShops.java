package com.CRUD.Repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CRUD.Entities.Shops;

public interface RepoShops extends JpaRepository<Shops, Integer>{

	//List<Shops> findbyName();
	List<Shops> findByname(String name);
	
	List<Shops> findByRent(Integer rent);
}

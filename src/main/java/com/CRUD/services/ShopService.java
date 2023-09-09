package com.CRUD.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.CRUD.Entities.Shops;


public interface ShopService {

	List<Shops> getdata(String sorte);

	
	Shops createdata(Shops product);


	Shops updatedataput(Shops product, Integer shopid);


	Shops updatedatapatch(Shops product, Integer shopid);


	Page<Shops> getpagination();


	Shops getdatabyname(Integer name);


	Page<Shops> getpagination(Integer offset, Integer pagesize);




	



	

	
}

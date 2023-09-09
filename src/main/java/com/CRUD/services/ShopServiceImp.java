package com.CRUD.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.CRUD.Entities.Shops;
import com.CRUD.Repositry.*;

@Service
public class ShopServiceImp implements ShopService {

	@Autowired
	public RepoShops RepoShops;
	
	
	@Override
	public List<Shops> getdata(String sorte) {
		// TODO Auto-generated method stub
		return  RepoShops.findAll(Sort.by(sorte));
	}


	@Override
	public Shops createdata(Shops product) {
		// TODO Auto-generated method stub
		return RepoShops.save(product);
	}


	@Override
	public Shops updatedataput(Shops product, Integer shopid) {
		
		return RepoShops.save(product);
	}


	@Override
	public Shops updatedatapatch(Shops product, Integer shopid) {
		// TODO Auto-generated method stub
		return RepoShops.save(product);
	}


	@Override
	public Page<Shops> getpagination(Integer offset, Integer pagesize) {
		// TODO Auto-generated method stub
		 PageRequest pageRequest = PageRequest.of(1,9);
		 
		 Page<Shops> shopsPage = RepoShops.findAll(pageRequest);
	        List<Shops> shopsList = shopsPage.getContent();
	        return shopsPage;
	}


	@Override
	public Shops getdatabyname(Integer name) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Page<Shops> getpagination() {
		// TODO Auto-generated method stub
		return null;
	}





}

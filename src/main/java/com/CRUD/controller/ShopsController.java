package com.CRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.CRUD.Entities.Shops;
import com.CRUD.services.ShopService;



@RestController
public class ShopsController {
	
	@Autowired
	public ShopService ShopService ;
	
	//http://localhost:8080/shop
	@GetMapping("shop/{sorte}")
	public List<Shops> getdata(@PathVariable String sorte){
		return this.ShopService.getdata(sorte);
		
	}
	
	
	@GetMapping("page")
	public Page<Shops> getpage(){
		return (Page<Shops>) this.ShopService.getpagination();
		
	}

	@PostMapping("shopp")
	public Shops createdata(@RequestBody Shops product){
		return this.ShopService.createdata(product);
		
	}
	@PutMapping("shopp/{shopid}")
	public Shops updatedata(@RequestBody Shops product,@PathVariable Integer shopid){
		return this.ShopService.updatedataput(product,shopid);
		
	}
	
	@PatchMapping("shopp/{shopid}")
	public Shops updatedata2(@RequestBody Shops product,@PathVariable Integer shopid){
		return this.ShopService.updatedatapatch(product,shopid);
		
	}
	
	@GetMapping("name/{rent}")
	public Shops getdatabyname(@PathVariable Integer name){
		 return this.ShopService.getdatabyname(name);
		
	}
	
}

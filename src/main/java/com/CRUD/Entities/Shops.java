package com.CRUD.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Shops {
@Id
private int shopID;
private String name;
private int rent;
public Shops(int shopID, String name, int rent) {
	super();
	this.shopID = shopID;
	this.name = name;
	this.rent = rent;
}
public int getShopID() {
	return shopID;
}
public void setShopID(int shopID) {
	this.shopID = shopID;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRent() {
	return rent;
}
public void setRent(int rent) {
	this.rent = rent;
}
public Shops() {
	super();
}

	
}

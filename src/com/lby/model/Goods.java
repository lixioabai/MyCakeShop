package com.lby.model;

public class Goods 
{
 private String name;
 private String cover;
 private String image1;
 private String image2;
 private float price;
 private String intro;
 private int stock;
 private Type type;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCover() {
	return cover;
}
public void setCover(String cover) {
	this.cover = cover;
}
public String getImage1() {
	return image1;
}
public void setImage1(String image1) {
	this.image1 = image1;
}
public String getImage2() {
	return image2;
}
public void setImage2(String image2) {
	this.image2 = image2;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public String getIntro() {
	return intro;
}
public void setIntro(String intro) {
	this.intro = intro;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
public Type getType() {
	return type;
}
public void setType(Type type) {
	this.type = type;
}
public Goods(String name, String cover, String image1, String image2, float price, String intro, int stock, Type type) {
	super();
	this.name = name;
	this.cover = cover;
	this.image1 = image1;
	this.image2 = image2;
	this.price = price;
	this.intro = intro;
	this.stock = stock;
	this.type = type;
}

public Goods() {
	super();
}
 
  
}

package com.zensar.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	
@Id	
 private int cid;
 private String cname;
 private int mobileno;
 private String city;
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public Customer(int cid, String cname, int mobileno, String city) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.mobileno = mobileno;
	this.city = city;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public int getMobileno() {
	return mobileno;
}
public void setMobileno(int mobileno) {
	this.mobileno = mobileno;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Customer [cid=" + cid + ", cname=" + cname + ", mobileno=" + mobileno + ", city=" + city + "]";
}
 
 
 
}

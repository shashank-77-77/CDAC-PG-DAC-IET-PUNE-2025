package com.demo.bean;

import java.time.LocalDate;

public class Product {
   private int pid;
   private String pname;
   private int qty;
   private double price;
   private LocalDate expdate;
   private int cid;
public Product() {
	super();
}
public Product(int pid, String pname, int qty, double price, LocalDate expdate, int cid) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.qty = qty;
	this.price = price;
	this.expdate = expdate;
	this.cid = cid;
}

@Override
public int hashCode() {
	return pid;
}
@Override
public boolean equals(Object obj) {
	return this.pid==((Product)obj).pid;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public LocalDate getExpdate() {
	return expdate;
}
public void setExpdate(LocalDate expdate) {
	this.expdate = expdate;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", qty=" + qty + ", price=" + price + ", expdate=" + expdate
			+ ", cid=" + cid + "]";
}
   
   
}

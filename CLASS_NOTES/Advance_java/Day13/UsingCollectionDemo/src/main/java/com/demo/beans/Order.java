package com.demo.beans;

import java.util.List;

public class Order {
	private int orderid;
	private String cname;
	List<Product> plist;
	public Order() {
		super();
	}
	public Order(int orderid, String cname, List<Product> plist) {
		super();
		this.orderid = orderid;
		this.cname = cname;
		this.plist = plist;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public List<Product> getPlist() {
		return plist;
	}
	public void setPlist(List<Product> plist) {
		this.plist = plist;
	}
	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", cname=" + cname + ", plist=" + plist + "]";
	}
	

}

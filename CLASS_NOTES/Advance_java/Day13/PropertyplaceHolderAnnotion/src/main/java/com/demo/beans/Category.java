package com.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Category {
	@Value("${cat.cid}")
 private int cid;
	@Value("${cat.cname}")
 private String cname;
	@Value("${cat.cdesc}")
 private String description;
public Category() {
	super();
}
public Category(int cid, String cname, String description) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.description = description;
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
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
@Override
public String toString() {
	return "Category [cid=" + cid + ", cname=" + cname + ", description=" + description + "]";
}
 
}

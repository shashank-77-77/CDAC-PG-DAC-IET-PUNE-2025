package com.demo.CategoryRestWebService.dto;

public class ProductDto {
	private int pid;
	private String pname;
	private int qty;
	private double price;
	private String ldtstr;
	private int cid;
	public ProductDto() {
		super();
	}
	public ProductDto(int pid, String pname, int qty, double price, String ldtstr, int cid) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
		this.ldtstr = ldtstr;
		this.cid = cid;
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
	public String getLdtstr() {
		return ldtstr;
	}
	public void setLdtstr(String ldtstr) {
		this.ldtstr = ldtstr;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "ProductDto [pid=" + pid + ", pname=" + pname + ", qty=" + qty + ", price=" + price + ", ldtstr="
				+ ldtstr + ", cid=" + cid + "]";
	}
	
}

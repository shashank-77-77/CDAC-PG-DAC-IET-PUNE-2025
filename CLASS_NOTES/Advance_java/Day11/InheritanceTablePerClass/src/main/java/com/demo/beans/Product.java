package com.demo.beans;

import java.time.LocalDate;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="myproduct")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Product {
	@Id
	private int pid;
	private String pname;
	private int qty;
	private double price;
	private LocalDate mfgdate;
	public Product() {
		super();
	}
	public Product(int pid, String pname, int qty, double price, LocalDate mfgdate) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
		this.mfgdate = mfgdate;
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
	public LocalDate getMfgdate() {
		return mfgdate;
	}
	public void setMfgdate(LocalDate mfgdate) {
		this.mfgdate = mfgdate;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", qty=" + qty + ", price=" + price + ", mfgdate=" + mfgdate
				+ "]";
	}
	

}

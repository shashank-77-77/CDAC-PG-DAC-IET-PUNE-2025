package com.demo.beans;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="perishable")
public class PerishableProduct extends Product {
  private LocalDate expdate;

public PerishableProduct() {
	super();
}

public PerishableProduct(int pid, String pname, int qty, double price, LocalDate mfgdate,LocalDate expdate) {
	super(pid,pname,qty,price,mfgdate);
	this.expdate = expdate;
}

public LocalDate getExpdate() {
	return expdate;
}

public void setExpdate(LocalDate expdate) {
	this.expdate = expdate;
}

@Override
public String toString() {
	return super.toString()+"PeroshableProduct [expdate=" + expdate + "]";
}

  
}

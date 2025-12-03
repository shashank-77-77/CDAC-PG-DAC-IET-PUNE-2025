package com.demo.beans;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("nonperishable")
public class NonPerishable extends Product{
	private int garentee;

	public NonPerishable() {
		super();
	}

	public NonPerishable(int pid, String pname, int qty, double price, LocalDate mfgdate,int garentee) {
		super(pid, pname, qty, price, mfgdate);
		this.garentee=garentee;
	}

	public int getGarentee() {
		return garentee;
	}

	public void setGarentee(int garentee) {
		this.garentee = garentee;
	}

	@Override
	public String toString() {
		return super.toString()+"NonPeroshable [garentee=" + garentee + "]";
	}

}

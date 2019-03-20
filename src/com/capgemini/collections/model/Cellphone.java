package com.capgemini.collections.model;

import java.util.Objects;

public class Cellphone {
	private String company;
	private String model;
	private String descrption;
	private String operatingSystem;
	private double price;
	public Cellphone() {
		super();
	}
	public Cellphone(String company, String model, String descrption, String operatingSystem, double price) {
		super();
		this.company = company;
		this.model = model;
		this.descrption = descrption;
		this.operatingSystem = operatingSystem;
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getDescrption() {
		return descrption;
	}
	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(!(obj instanceof Cellphone))
			return false;
		if(this==obj)
			return true;
		Cellphone cells=(Cellphone) obj;
		if(this.company==cells.company && this.model==cells.model && this.descrption==cells.descrption)
			return true;
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(company,model,descrption);
	}
}

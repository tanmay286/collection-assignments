package com.capgemini.collections.model;

import java.util.Objects;

public class Television {
	private String company;
	private String type;
	private boolean enabled3d;
	private double price;
	
	
	public Television() {
		super();
	}


	public Television(String company, String type, boolean enabled3d, double price) {
		super();
		this.company = company;
		this.type = type;
		this.enabled3d = enabled3d;
		this.price = price;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public boolean isEnabled3d() {
		return enabled3d;
	}


	public void setEnabled3d(boolean enabled3d) {
		this.enabled3d = enabled3d;
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
    	if(!(obj instanceof Television))
    		return false;
    	if(this==obj)
    		return true;
    	Television televisions=(Television) obj;
    	if(this.company==televisions.company && this.type==televisions.type && this.enabled3d==televisions.enabled3d && this.price==televisions.price)
    		return true;
    	return false;
    	
    }
    
    @Override
    public int hashCode() {
    	
    	return Objects.hash(company,type,enabled3d,price);
    }
}

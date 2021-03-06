package com.capgemini.collections.model;

import java.util.Objects;

public class Laptop {
	
	private String company;
	private String model;
	private String operatingSystem;
	private String processor;
		
	public Laptop() {
		super();
	}

	public Laptop(String company, String model, String operatingSystem, String processor) {
		super();
		this.company = company;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.processor = processor;
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

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(!(obj instanceof Laptop))
			return false;
		if(this==obj)
			return true;
		Laptop laptops=(Laptop) obj;
		if(this.company==laptops.company && this.model==laptops.model)
			return true;
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(company,model);
	}
}

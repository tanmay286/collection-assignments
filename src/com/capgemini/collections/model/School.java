package com.capgemini.collections.model;

import java.util.Objects;

public class School {
	private String name;
	private String city;
	private String schoolDistrict;
	private int schoolRanking;
	
	
	public School() {
		super();
	}


	public School(String name, String city, String schoolDistrict, int schoolRanking) {
		super();
		this.name = name;
		this.city = city;
		this.schoolDistrict = schoolDistrict;
		this.schoolRanking = schoolRanking;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getSchoolDistrict() {
		return schoolDistrict;
	}


	public void setSchoolDistrict(String schoolDistrict) {
		this.schoolDistrict = schoolDistrict;
	}


	public int getSchoolRanking() {
		return schoolRanking;
	}


	public void setSchoolRanking(int schoolRanking) {
		this.schoolRanking = schoolRanking;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(!(obj instanceof School))
			return false;
		if(this==obj)
			return true;
		School schools=(School) obj;
		if(this.name==schools.name && this.city==schools.city && this.schoolDistrict==schools.schoolDistrict)
			return true;
		return false;
	}

	@Override
	public int hashCode() {

		return Objects.hash(name,city,schoolDistrict);
	}
}

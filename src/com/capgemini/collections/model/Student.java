package com.capgemini.collections.model;

import java.util.Objects;

public class Student implements Comparable<Student> {
	
	private String name;
	private int age;
	private int id;
	public Student() {
		super();
	}
	public Student(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(!(obj instanceof Student))
			return false;
		if(this==obj)
			return true;
		Student students=(Student) obj;
		if(this.name==students.name && this.id==students.id && this.age==students.age)
			return true;
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name,id,age);
	}
	 @Override
	public int compareTo(Student students) {
		return Integer.compare(this.id,students.id);
	}
	
}

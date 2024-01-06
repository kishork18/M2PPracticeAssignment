package com.masai.entity;

public class Employee {
  private int id;
  private String name;
  private int age;
  private String address;
	
	public Employee(int id, String name, int age, String address) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.address = address;
}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
  
}

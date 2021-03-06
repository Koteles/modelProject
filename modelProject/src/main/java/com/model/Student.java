package com.model;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	
	/**
	 * 	Model class for Student
	 */

	private String id;

	private String name;

	private int age;
	
	private double height;

	public String getId() {
		return id;
	}
	
	@XmlElement
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	@XmlElement
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getHeight() {
		return height;
	}
	
	@XmlElement
	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return id + "\t" + name + "\t" + age + "\t" + height;
	}
}
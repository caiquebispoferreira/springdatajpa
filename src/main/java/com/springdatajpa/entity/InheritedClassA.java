package com.springdatajpa.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table()
@DiscriminatorValue("InheritedClassA")
public class InheritedClassA extends BaseClass {

	protected String name;
	
	public InheritedClassA() {
		
	}
	public InheritedClassA(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}

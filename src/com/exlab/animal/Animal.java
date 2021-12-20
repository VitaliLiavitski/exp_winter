package com.exlab.animal;

public abstract class Animal {
	
	private String type = "Pet";
	
	public Animal() {
		
	}
	
	public Animal(String type) {
		this.type = type;
	}
	
	public abstract void eat();
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
	
}

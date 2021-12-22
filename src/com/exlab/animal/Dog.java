package com.exlab.animal;

public class Dog implements IPet{
	
	private String name = "Default";
	
	public Dog() {
		
	}
	
	public Dog(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	@Override
	public String printInfoPet() {
		return getName();
	}

}

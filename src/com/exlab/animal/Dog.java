package com.exlab.animal;

public class Dog extends Animal implements IPet{
	
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

	@Override
	public void eat() {
		System.out.println("meat");
	}

}

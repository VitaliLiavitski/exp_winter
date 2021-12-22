package com.exlab.animal;

public class Cow implements IPet{
	
	private String name = "Default";
	
	public Cow() {
		
	}
	
	public Cow(String name) {
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

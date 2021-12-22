package com.exlab.farm;

import com.exlab.animal.IPet;

public class Farm {
	
	private IPet pet;
	private String name;
	
	public Farm() {
		
	}
	
	public Farm(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPet(IPet pet) {
		this.pet = pet;
	}
	
	public IPet getPet() {
		return this.pet;
	}
	
}

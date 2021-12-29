package com.exlab.farm;

import com.exlab.animal.IPet;

import java.util.ArrayList;
import java.util.List;

import com.exlab.animal.Animal;
import com.exlab.animal.Cow;

public class Farm {
	
	private IPet pet;
	private String name;
	private List<Cow> listCow;
	private List<Animal> listAnimal;
	
	public Farm() {
		listCow = new ArrayList<Cow>();
		listAnimal = new ArrayList<Animal>();
	}
	
	public Farm(String name) {
		this.name = name;
		listCow = new ArrayList<Cow>();
	}
	
	public void setCow(Cow cow) {
		this.listCow.add(cow);
	}
	
	public List<Cow> getListCows() {
		return this.listCow;
	}
	
	public void setAnimal(Animal animal) {
		this.listAnimal.add(animal);
	}
	
	public List<Animal> getListAnimal() {
		return this.listAnimal;
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
	
	public void printListNameAnimal() {
		for(Animal animal : this.getListAnimal()) {
			System.out.println(animal.getName());
		}
	}
	
}

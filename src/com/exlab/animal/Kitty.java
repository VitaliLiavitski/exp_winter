package com.exlab.animal;

public class Kitty extends Cat {
	
	private int age = 1;
	private String name = "default";
	
	public Kitty() {
		
	}
	
	public Kitty(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public void printInfo() {
		System.out.println("=====");
		System.out.println("Voice: " + getVoice());
		System.out.println("Run: " + getRun());
		System.out.println("Name: " + getName());
		System.out.println("Type: " + getType());
		System.out.println("Age: " + getAge());
		System.out.println("=====");
	}
	
	@Override
	public void eat() {
		System.out.println("Milk!");
	}
	
	public void eat(String food) {
		System.out.println(food);
	}
	
	@Override
	public String printInfoPet() {
		return this.name;
	}

}

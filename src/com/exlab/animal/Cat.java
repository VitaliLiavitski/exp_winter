package com.exlab.animal;

public class Cat extends Animal implements IPet {
	
	private String voice = "May-may!";
	private int run = 20;
	private String name = "Default";
	
	public Cat() {
		
	}
	
	public Cat(String name) {
		this.name = name;
	}
	
	public void setVoice(String voiceValue) {
		this.voice = voiceValue;
	}
	
	public String getVoice() {
		return this.voice;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setRun(int run) {
		this.run = run;
	}
	
	public int getRun() {
		return this.run;
	}
	
	public void printInfo() {
		System.out.println("=====");
		System.out.println("Voice: " + this.voice);
		System.out.println("Run: " + this.run);
		System.out.println("Name: " + this.name);
		System.out.println("Type: " + getType());
		System.out.println("=====");
	}

	@Override
	public void eat() {
		System.out.println("Fish!");
	}

	@Override
	public String printInfoPet() {
		return this.name + this.voice;
	}
}

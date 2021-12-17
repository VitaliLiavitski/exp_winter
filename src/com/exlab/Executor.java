package com.exlab;

import com.exlab.animal.Cat;
import com.exlab.animal.Kitty;

public class Executor {
	
	public static void main(String [] args) {
		
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		
		System.out.println(cat1.getVoice());
		System.out.println(cat2.getVoice());
		System.out.println("=====");
		
		cat1.setVoice("Rrrrr");
		cat2.setVoice("Thhhhh");
		
		
		System.out.println(cat1.getVoice());
		System.out.println(cat1.getRun());
		System.out.println(cat2.getVoice());
		
		System.out.println("===Kitty===");
		
		
		Kitty kitty = new Kitty();
		System.out.println(kitty.getVoice());
		System.out.println(kitty.getRun());
		System.out.println(kitty.getAge());
		System.out.println(kitty.getType());
		
		Cat cat3 = new Cat("Barsik");
		String name = cat3.getName();
		System.out.println(name);
		
		
		Cat cat4 = new Cat("Tom");
		cat4.setType("Wild");
		cat4.setVoice("RRRRRRR!!");
		cat4.setRun(40);
		cat4.printInfo();
		
		
		Cat cat5 = new Cat("Pushok");
		cat5.setRun(5);
		cat5.printInfo();
	}

}

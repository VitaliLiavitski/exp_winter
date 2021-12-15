package com.exlab;

import com.exlab.animal.Cat;

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
		System.out.println(cat1.run);
		System.out.println(cat2.getVoice());
		
	}

}

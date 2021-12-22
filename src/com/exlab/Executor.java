package com.exlab;

import com.exlab.animal.Cat;
import com.exlab.animal.Cow;
import com.exlab.animal.Dog;
import com.exlab.animal.Kitty;
import com.exlab.farm.Farm;

public class Executor {
	
	public static void main(String [] args) {
		
		Cat cat4 = new Cat("Tom");
		cat4.setType("Wild");
		cat4.setVoice("RRRRRRR!!");
		cat4.setRun(40);
//		cat4.printInfo();
		
		Kitty kitty1 = new Kitty("Snezhok");
//		kitty1.printInfo();
//		kitty1.eat();
//		kitty1.eat("Meat");
		
		Dog dog1 = new Dog("Sharik");
		Cow cow = new Cow("Burenka");
		
		Farm farm1 = new Farm("Usadba");
//		farm1.setPet(cat4);
//		farm1.setPet(dog1);
//		farm1.setPet(kitty1);
		farm1.setPet(cow);
		System.out.println(farm1.getPet().printInfoPet());
	}

}

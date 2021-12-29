package com.exlab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.exlab.animal.Animal;
import com.exlab.animal.Cat;
import com.exlab.animal.Cow;
import com.exlab.animal.Dog;
import com.exlab.farm.Farm;

public class Executor {
	
	public static void main(String [] args) {
		
		Cow cow1 = new Cow("Burenka1");
		Cow cow2 = new Cow("Burenka2");
		Cow cow3 = new Cow("Burenka3");
		
		Farm farm1 = new Farm();
		
		farm1.setCow(cow1);
		farm1.setCow(cow2);
		farm1.setCow(cow3);
		
		for(Cow cow : farm1.getListCows()) {
			System.out.println(cow.getName());
		}
		
		System.out.println("=======");
		
		Animal cow5 = new Cow("Burenka5");
		Animal cow6 = new Cow("Burenka6");
		Animal cow7 = new Cow("Burenka7");
		Animal dog1 = new Dog("Sharik1");
		Animal dog2 = new Dog("Rex");
		Animal cat1 = new Cat("Barsik1");
		
		farm1.setAnimal(cow5);
		farm1.setAnimal(cow6);
		farm1.setAnimal(cow7);
		farm1.setAnimal(dog2);
		farm1.setAnimal(dog1);
		farm1.setAnimal(cat1);
		farm1.printListNameAnimal();
//		
//		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
//		map1.put(34, "Santa Klaus");
//		map1.put(99, "gifts");
//		map1.put(919, "car");
//		
//		String result = map1.get(34);
////		System.out.println(result);
//		
//		HashMap<String, String> map2 = new HashMap<String, String>();
//		map2.put("red", "Santa Klaus");
//		map2.put("good", "gifts");
//		map2.put("bad", "car");
//		map2.put("bd1", "car1");
//		map2.put("qwer", "car1");
//		map2.put("b13", "car17");
//		
//		String result2 = map2.get("bad2");
////		System.out.println(result2);
//		int counter = 0;
//		for(String key: map2.keySet()) {
//			if("car1".equals(map2.get(key))) {
//				System.out.println(key);
//			} else {
//				counter++;
//			}
//		}
//		System.out.println("==counter==");
//		System.out.println(counter);
		
	}

}

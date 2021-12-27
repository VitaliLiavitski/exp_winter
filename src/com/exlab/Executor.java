package com.exlab;

import java.util.ArrayList;
import java.util.List;

public class Executor {
	
	public static void main(String [] args) {
		
		List<String>  listStr = new ArrayList<String>();
		listStr.add("Abc");
		listStr.add("defG");
		listStr.add("111");
		listStr.add("2222");
		listStr.add("3333");
		
//		System.out.println(listStr);
//		System.out.println("=====");
//		System.out.println(listStr.get(0));
//		System.out.println(listStr.get(1));
		
		for(String str1 : listStr) {
			System.out.println(str1);
		}
		
		System.out.println("=====");
		
		listStr.remove(3);
		
		for(String str1 : listStr) {
			System.out.println(str1);
		}
		
	}

}

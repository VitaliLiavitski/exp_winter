package com.exlab;

public class FirstLesson {

	public static void main(String[] args) {
		int a = 0;
		int b = 15;
		int sum = 1;
		sum = sum + 5;
		int index = 0;
		double c = 9.3;
		boolean d = false;
		
//      simple number
		for(int i = 0; i<=100; i++) {
			boolean isPrime = true;
			
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				System.out.println(i);
			}
		}
		
		
//	    even number
//		for(int i = 0; i < 15; i++) {
//			
//			if((i % 2 == 0) & (i !=0)) {
//				System.out.println("Yhooo!: " + i);
//			}
//			
//		}
		
//		while(a < b) {
//			a++;
//			index++;
//			System.out.println(index + " OK! " + a);
//		}
		
//		if(a != b) {
//			sum += 5;
//			System.out.println("OK! " + sum);
//		} else {
//			sum = sum - 16;
//			System.out.println("NOT! " + sum);
//		}
		
//		System.out.println(sum);

	}

}

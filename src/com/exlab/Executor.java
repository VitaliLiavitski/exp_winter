package com.exlab;

import com.exlab.exceptions.CrazyException;

public class Executor {
	
	public static void main(String [] args) {
		
		try {
			System.out.println("=Start=");
			throw new CrazyException();
			
		} catch (CrazyException e) {
			System.out.println("==Catch==");
		} finally {
			System.out.println("==FINALLY==");
		}
		
	}

}

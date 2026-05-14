package com.mycompany.tess;

import com.mycompany.mavenproject2.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Count:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Count:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Count:" + counter.getCount());
		
	}

}

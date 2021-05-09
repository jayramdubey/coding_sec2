package com.java;

public class Sample extends Example {
	int x = 50;
	int y = 60;

	Sample() {
		System.out.println("Sample no arg ");
	}

	public static void main(String[] args) {
		
		Example sobj = new Sample();
		System.out.println(sobj.x);
		System.out.println(sobj.y);
	}
}

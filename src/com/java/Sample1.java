package com.java;

public class Sample1 extends A4 {

	Sample1() {
		System.out.println("B class constructor");
	}

	Sample1(int b) {
		super(5);
		System.out.println("B Parametrise_constructor");
	}

	public static void main(String[] args) {
		Sample1 s1= new Sample1();
		Sample1 s2= new Sample1(10);

	}
}
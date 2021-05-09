package com.java;

class Example1{
	Example1(int a){
		System.out.println("parametrized");
	}
	
}
public class Sample2 extends Example1{

	Sample2(int a) {
		//super("Sample2 parametrized");  CE
		super(10);
	}

	public static void main(String str[]){
		Sample2 ob = new Sample2(10);
	}
}

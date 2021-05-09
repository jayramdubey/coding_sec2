package com.java;

class A4 {
	static int a = 10;
	int x = 30;

	A4() {
		System.out.println("A class constructor");
		x = 25;
	}
	A4(int a)
	{
		System.out.println("A Parametrise_constructor");
		x = 35;
	}
	
}

public class B4 extends A4 {
	static int b = 20;
	int y = 40;

	B4() {
		System.out.println("B class constructor");
		y = 6;
	}

	B4(int b) {
		System.out.println("B Parametrise_constructor");
	}

	public static void main(String[] args) {
		B4 b = new B4();
		B4 c = new B4(15);
		System.out.println(a);
		System.out.println(b);
		System.out.println(b.x);
		System.out.println(b.y);

	}

}

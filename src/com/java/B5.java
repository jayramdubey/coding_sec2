package com.java;

class A5 {
	static int a = 10;
	int x = 20;

	static void m1() {
		System.out.println("A class m1");
	}

	void m2() {
		System.out.println("A class m2");
	}

	void m3() {
		System.out.println("A class m3");
	}
}

public class B5 extends A5 {
	static int a = 50;
	int x = 60;

	static void m1() {
		// super.m1();//becouse this method is static so  Will dot call any var or method from super class
		System.out.println("B class m1");

	}

	void m2() {
		super.m2();
		System.out.println("B class m2");

	}

	void m4() {
		System.out.println(super.a +" ... " + a);
		System.out.println(super.x +" ... " + x);
		super.m1();
	    m1();
	    super.m2();
	    m2();
	}

	public static void main(String[] args) {
		B5 b = new B5();
		b.m4();
		
/*		System.out.println("a: " + a);
		System.out.println("x: " + b.x);
		b.m1();
		b.m2();
		b.m3();*/
	}

}

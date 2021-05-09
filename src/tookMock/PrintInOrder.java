package tookMock;

class Foo {
	volatile boolean f1 = false;
	volatile boolean f2 = false;

	public synchronized void first() {
		System.out.println("first");
		f1 = true;
		notifyAll();
	}

	public synchronized void second() throws InterruptedException {
		while (!f1)
			wait();
		System.out.println("second");
		f2 = true;
		notifyAll();
	}

	public synchronized void third() throws InterruptedException {
		while (!f2)
			wait();
		System.out.println("third");
	}
}

class FooThread extends Thread {
	private Foo foo;
	private String name;

	public FooThread(Foo foo, String name) {
		this.name = name;
		this.foo = foo;
	}

	public void run() {
		if ("first".equals(name)) {
			foo.first();
		} else if ("second".equals(name)) {
			try {
				foo.second();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else if ("third".equals(name)) {
			try {
				foo.third();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class PrintInOrder {
	public static void main(String[] args) {
		Foo foo = new Foo();
		FooThread thread3 = new FooThread(foo, "third");
		FooThread thread1 = new FooThread(foo, "first");
		FooThread thread2 = new FooThread(foo, "second");
		
	
		thread2.start();
		thread3.start();
		thread1.start();
	}
}
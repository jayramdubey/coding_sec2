package codeConvertInJava8;

public class Java8_ex1 {

	public static void main(String[] args) {
        
		//Old way
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(" Thread is started");
			}
		}).start();
		
		new Thread(()->System.out.println("Thread is started lambda exp")).start();

	}

}

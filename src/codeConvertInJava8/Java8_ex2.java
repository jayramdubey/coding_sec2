package codeConvertInJava8;

import java.time.LocalDate;
import java.time.LocalTime;

public class Java8_ex2 {

	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		System.out.println("current date: " +currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("current time: "+currentTime);
	}

}

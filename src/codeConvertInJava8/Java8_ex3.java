package codeConvertInJava8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Java8_ex3 {

	public static void main(String[] args) {
		List<Employee> employeeList = createEmployeeList();
		
	/*	List<String> result = employeeList.stream().filter(e -> e.getAge() > 30).map(Employee::getName)
				.collect(Collectors.toList());*/
		employeeList.sort((e1,e2)-> e1.getAge()-e2.getAge());
		employeeList.forEach((s) -> System.out.println(s));
		// Given the list of employees, count number of employees with age 28?

		List<String> listEmpWhoseAgeLessThan28= employeeList.stream().filter(e->e.getAge()==28)
				.map(Employee::getName).collect(Collectors.toList());
		System.out.println(".....................................");
		listEmpWhoseAgeLessThan28.forEach(s->System.out.println(s));
		
		//Given the list of employees, find the employee with name “jay”.
		System.out.println(".....................................");
		Optional<Employee> e1 = employeeList.stream().filter(e->e.getName().equalsIgnoreCase("jay")).findAny();
		if(e1.isPresent())
			System.out.println(e1.get().getName());
		
		//Given a list of employee, find maximum age of employee?
		OptionalInt max = employeeList.stream().mapToInt(Employee::getAge).max();
		System.out.println(".....................................");
		if(max.isPresent())
			System.out.println("Maximum age of employee "+ max.getAsInt());

	}

	private static List<Employee> createEmployeeList() {
		List<Employee> listOfEmp = new ArrayList<>();

		listOfEmp.add(new Employee("jay", 28, 1001));
		listOfEmp.add(new Employee("Siya", 30, 1002));
		listOfEmp.add(new Employee("Shrikant", 34, 1006));
		listOfEmp.add(new Employee("kiran", 28, 1003));
		listOfEmp.add(new Employee("Raj", 25, 1000));

		return listOfEmp;
	}

}

package SCB_Mock;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.omg.Messaging.SyncScopeHelper;

class Employees {
	String name;

	public Employees(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employees [name=" + name + ", age=" + age + ", id=" + id + "]";
	}

	int age;
	int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

public class ShortEmployees {

	public static void main(String[] args) {

		List<Employees> employeeList = new ArrayList<Employees>();
		employeeList.add(new Employees("Jon", 22, 1001));
		employeeList.add(new Employees("Steve", 19, 1003));
		employeeList.add(new Employees("Kevin", 23, 1005));
		employeeList.add(new Employees("Ron", 20, 1010));
		employeeList.add(new Employees("Lucy", 18, 1111));

		List<Employees> l2 = employeeList.stream().sorted((o1, o2) -> o1.getAge() - o2.getAge())
				.collect(Collectors.toList());
		l2.forEach(n -> System.out.println(n));

	}

}

package Streams;

import java.util.Arrays;
import java.util.List;

class Employee5 {
	int id;
	String name;
	int salary;

	public Employee5(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}

public class MapDemo3 {

	public static void main(String[] args) {

		List<Employee5> employees = Arrays.asList(new Employee5(1, "Cristian", 15000),
				new Employee5(2, "Sebastian", 50000), new Employee5(3, "Ana", 30000), new Employee5(4, "Alex", 20000));

		employees.stream().filter(e -> e.salary > 30000)
						  .forEach(e -> System.out.println(e.salary));

	}

}

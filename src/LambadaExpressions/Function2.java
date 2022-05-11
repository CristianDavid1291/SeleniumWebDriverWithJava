package LambadaExpressions;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee2 {
	String name;
	int salary;

	Employee2(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
}

public class Function2 {

	public static void main(String[] args) {

		ArrayList<Employee2> employees = new ArrayList<Employee2>();
		employees.add(new Employee2("Cristian", 50000));
		employees.add(new Employee2("David", 12000));
		employees.add(new Employee2("Juan", 5000));

		Function<Employee2, Integer> f1 = e -> {
			int sal = e.salary;
			if (sal >= 10000 && sal <= 20000)
				return (sal * 10 / 100);
			else if (sal >= 20000 && sal <= 30000)
				return (sal * 20 / 100);
			else if (sal >= 30000 && sal <= 50000)
				return (sal * 30 / 100);
			else
				return (sal * 40 / 100);
		};

		Predicate<Integer> p = b -> b > 5000;

		for (Employee2 employee : employees) {
			if (p.test(f1.apply(employee))) {
				System.out.println(f1.apply(employee));
				System.out.println(employee.name);
				System.out.println(employee.salary);
			}
		}

	}

}

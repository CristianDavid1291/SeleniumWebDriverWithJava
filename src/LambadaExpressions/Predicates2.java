package LambadaExpressions;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee
{
	String name;
	int salary;
	int experience;
	
	Employee(String name,int salary,int exp)
	{
		this.name = name;
		this.salary = salary;
		this.experience = exp;
	}
}

public class Predicates2 {

	public static void main(String[] args) {
		
		Employee emp = new Employee("Cristian", 50000, 5);
		
		//lambda expression which check employee salary is greater than 30000 and experience greater than 3
		Predicate<Employee> p = e->(e.salary > 30000 && e.experience > 3);
		//System.out.println(p.test(emp));
		
		//Multiple employee
		
		ArrayList<Employee> emps = new ArrayList();
		emps.add(emp);
		emps.add(new Employee("Jhoana",5000,2));
		emps.add(new Employee("Lucas",50000,5));
		emps.add(new Employee("Sebastian",50000,1));
		
		for(Employee e : emps)
		{
			System.out.println(p.test(e));
		}

	}

}

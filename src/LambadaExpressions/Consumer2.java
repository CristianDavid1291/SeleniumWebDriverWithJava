package LambadaExpressions;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee3
{
	String name;
	int salary;
	String gender;
	
	Employee3(String name, int salary, String gender){
		this.name = name;
		this.salary = salary;
		this.gender = gender;
		
	}
}

public class Consumer2 {
//Create multiple employee objects, array list
	//name, salary
	//based on the salary calculate bonus 10%
	// once calculate the bonus validate if it is grater than 5000 an then write employee 
	public static void main(String[] args) {
		ArrayList<Employee3> employees = new ArrayList<Employee3>();
		employees.add(new Employee3("Smith", 50000, "Male"));
		employees.add(new Employee3("Cristine", 60000, "Female"));
		employees.add(new Employee3("Jhon", 47000, "Male"));
		employees.add(new Employee3("Jolie", 68000, "Female"));
		employees.add(new Employee3("Jerry", 30000, "Male"));
		
		Function<Employee3,Double> f1 = e->e.salary * 0.1;
		Predicate<Double> p1 = i->i > 5000;
		Consumer<Employee3> c1 = e->System.out.println("Employee: "+e.name+" Salary: "+e.salary);
		Consumer<Double> c2 = b-> System.out.println("Bonus: "+b);
		
		for(Employee3 employee: employees)
		{
			double bonus = f1.apply(employee);
			if(p1.test(bonus))
			{
				c1.accept(employee);
				c2.accept(bonus);
			}
		}

	}

}

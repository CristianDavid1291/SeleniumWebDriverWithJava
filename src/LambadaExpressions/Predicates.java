package LambadaExpressions;

import java.util.function.Predicate;

public class Predicates {

	public static void main(String[] args) {
		//Ex1
		Predicate<Integer> p = i -> (i>10);
		System.out.println(p.test(20));
		System.out.println(p.test(9));
		
		//Ex2: check the length of given string is greater than 4 or not 
		Predicate<String> p2 = s -> (s.length()>4);
		System.out.println(p2.test("Cristian"));
		System.out.println(p2.test("Uno"));
		
		//Ex3: print array elements whose size is > 4
		String[] names = {"David","Cristian","Smith","Jhon","Uno","Ana"};
		for(String name : names) 
		{
			if(p2.test(name))
				System.out.println(name);
		}

	}

}

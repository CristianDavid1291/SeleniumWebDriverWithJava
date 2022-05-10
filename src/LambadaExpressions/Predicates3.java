package LambadaExpressions;

import java.util.function.Predicate;

//Joining Predicates - and or negate
// p1 -- checks number is even
// p2 -- checks greater than 50

public class Predicates3 {

	public static void main(String[] args) {
		int[] a= {5,15,20,25,30,35,40,45,50,55,60,65};
		
		Predicate<Integer> p1 = s->(s%2 == 0); 
		Predicate<Integer> p2 = s->(s > 50);
		
		//and 
		for(int n : a)
		{
			if(p1.and(p2).test(n))
				System.out.println(n);
		}
		
		//or
		for(int n : a)
		{
			if(p1.or(p2).test(n))
				System.out.println(n);
		}
		
		//and 
		for(int n : a)
		{
			if(p1.negate().test(n))
				System.out.println(n);
		}

	}

}

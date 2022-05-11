package LambadaExpressions;

import java.util.function.Function;

public class Functions {

	public static void main(String[] args) {
		/*
		Function<Integer,Integer> f = n->n*n;
		System.out.println(f.apply(5));
		System.out.println(f.apply(10));
		System.out.println(f.apply(2));
		*/
		
		//String length
		Function <String,Integer> f2 = s->s.length();
		System.out.println(f2.apply("Cristian"));
		System.out.println(f2.apply("Ana"));
		System.out.println(f2.apply("David"));

	}

}

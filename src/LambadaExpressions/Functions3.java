package LambadaExpressions;

import java.util.function.Function;

public class Functions3 {

	/*
	 * Function Chaining
	 * andThen()
	 * compose()
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		Function<Integer,Integer> f1 = i->i*2;
		Function<Integer,Integer> f2 = i->i*i*i;
		System.out.println(f1.andThen(f2).apply(2));
		System.out.println(f1.compose(f2).apply(2));

	}

}

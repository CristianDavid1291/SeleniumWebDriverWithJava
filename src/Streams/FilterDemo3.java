package Streams;

import java.util.Arrays;
import java.util.List;

public class FilterDemo3 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Cristian",null,"Sebastian",null,"Angela",null,"Ana");
		names.stream().filter(n->n!=null).forEach(n->System.out.println(n));
		
	}

}

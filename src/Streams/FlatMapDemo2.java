package Streams;

import java.util.Arrays;
import java.util.List;

public class FlatMapDemo2 {

	public static void main(String[] args) {
		List<String> names1 = Arrays.asList("Cristian","David","Juan");
		List<String> names2 = Arrays.asList("Sebastian","Angela","Jhoana");
		List<String> names3 = Arrays.asList("Jairo","Antonio","Sonia");
		
		List<List<String>> finalNames = Arrays.asList(names1,names2,names3);
		
		finalNames.stream().flatMap(x->x.stream()).forEach(s->System.out.println(s));
		

	}

}

package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DistinctCountLimitDemo1 {

	// distinct() //limit
	// count
	public static void main(String[] args) {

		List<String> vehicles = Arrays.asList("bus", "car", "bus", "car", "bicycle");

		// distinct
		vehicles.stream().distinct().forEach(s -> System.out.println(s));

		// count
		System.out.println(vehicles.stream().distinct().count());

		// limit()
		vehicles.stream().limit(3).forEach(s -> System.out.println(s));

		////////////////////////////
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// How many even number are there ?
		System.out.println(numbers.stream().filter(n -> n % 2 == 0).count());

		// min()
		Optional<Integer> min = numbers.stream().min((val1, val2) -> {
			return val1.compareTo(val2);
		});
		System.out.println(min.get());
		
		// max()
		Optional<Integer> max = numbers.stream().max((val1, val2) -> {
			return val1.compareTo(val2);
		});
		System.out.println(max.get());
		
		//Reduce()
		List<String> letters = Arrays.asList("A","B","C","D","1","2","3");
		Optional<String> reduce = letters.stream().reduce((value,combinedvalue)->
									{
										return value + combinedvalue  ;
									});
		System.out.println(reduce.get());
		
		//toArray
		Object[] arr = letters.stream().toArray();
		System.out.println(arr.length);

	}

}

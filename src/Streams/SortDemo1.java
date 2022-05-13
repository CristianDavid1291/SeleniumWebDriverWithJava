package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortDemo1 {

	public static void main(String[] args) {
		
		//sorted
		List<Integer> list1 = Arrays.asList(2,4,1,3,7,5,9);
		list1.stream().sorted().forEach(s->System.out.println(s));
		list1.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));
		
		//anyMatch
		//allMatch
		//noneMatch
		
		Set<String> fruites = new HashSet<String>();
		fruites.add("One apple");
		fruites.add("One mango");
		fruites.add("Two apples");
		fruites.add("More grapes");
		fruites.add("Two guavas");
		
		boolean result = fruites.stream().anyMatch(value-> {return value.startsWith("One");});
		System.out.println(result);

		boolean result2 = fruites.stream().allMatch(value-> {return value.startsWith("One");});
		System.out.println(result2);
		
		boolean result3 = fruites.stream().noneMatch(value-> {return value.startsWith("One");});
		System.out.println(result3);
		
		//findANy,findFirst
		Optional<String> any = fruites.stream().findAny();
		System.out.println(any.get());
		
		Optional<String> first = fruites.stream().findFirst();
		System.out.println(first.get());
		
		//concatenate
		List<String> animals = Arrays.asList("Dog","Cat","Elephant");
		List<String> birds = Arrays.asList("Peackock","Parrot","Crow");
		
		Stream<String> stream1 = animals.stream();
		Stream<String> stream2 = birds.stream();
		List<String> listConcate = Stream.concat(stream1, stream2).collect(Collectors.toList());
		System.out.println(listConcate);
		
		
	}

}

package JavaStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import io.netty.util.internal.SystemPropertyUtil;

public class JavaStreamTest1 {

	public static void main(String[] args) {
		//streamFilter();
		//streamMap();
		//merge();
		//collector();
		practiceInteger();
		
	}

	public static void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Cristian");
		names.add("Ana");
		names.add("Sebastian");
		names.add("Andrea");
		names.add("Amparo");
		
		//Count names which start with A
		long c = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(c);
		Stream.of("Cristian", "Cristian", "Sebastian", "Andrea", "Amparo").filter(s -> {
			s.startsWith("A");
			return true;
		}).count();

		//names.stream().filter(s->s.length() > 4).forEach(s -> System.out.println(s));
		names.stream().filter(s->s.length() > 4).limit(1).forEach(s-> System.out.println(s));
	}

	public static void streamMap() {

		//print names of length >4 with Uppercase
		ArrayList<String> names = new ArrayList<String>();
		names.add("Cristian");
		names.add("Azka");
		names.add("Sebastian");
		names.add("Aadrea");
		names.add("Amparo");
		
	   //names.stream().filter(f->f.endsWith("a")).map(s->s.toUpperCase())
	   //.forEach(s->System.out.println(s));
		
	   names.stream().filter(f->f.startsWith("A")).sorted().map(s->s.toUpperCase())
	   .forEach(s->System.out.println(s));
	   
	   
	}

	public static void merge() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Cristian");
		names.add("Azka");
		names.add("Sebastian");
		names.add("Aadrea");
		names.add("Amparo");
		
		ArrayList<String> names2 = new ArrayList<String>();
		names.add("David");
		names.add("Jhoana");
		
		Stream<String> newStream = Stream.concat(names.stream(), names2.stream());
		//newStream.sorted().forEach(s->System.out.println(s));
		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Perro"));
		System.out.println(flag);

	}

	public static void collector() {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Cristian");
		names.add("Angela");
		names.add("Sebastian");
		names.add("Andrea");
		names.add("Amparo");
		
		List<String> list = names.stream().filter(f->f.startsWith("A")).sorted().collect(Collectors.toList());
		System.out.println(list.get(0));
	}
	
	public static void practiceInteger() {
		
		ArrayList<Integer> names = new ArrayList<Integer>();
		names.add(5);
		names.add(7);
		names.add(2);
		names.add(4);
		names.add(7);
  //print unique number of this array
  //sort array
  //3rd index		
		
		List<Integer> numbers = names.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(numbers.get(2));
	}
	
	public static void traditional() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Cristian");
		names.add("Angela");
		names.add("Sebastian");
		names.add("Andrea");
		names.add("Amparo");

		int cont = 0;
		for (int i = 0; i < names.size(); i++) {

			if (names.get(i).charAt(0) == 'A') {
				cont++;
			}

		}
		System.out.println(cont);
	}

}

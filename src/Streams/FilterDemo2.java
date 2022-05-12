package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.function.Consumer;

public class FilterDemo2 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Cristian","Juan","Ana","Sergio","Angela","Sebastian","Angelas");
		List<String> longNames = new ArrayList<String>();
		Predicate<String> p1 = s->(s.length() > 6 && s.length()<8);
		Consumer<String> c1 = s->System.out.println(s);
		/*
		longNames = names.stream().filter(s->s.length() > 6 && s.length()<8).collect(Collectors.toList());
		System.out.println(longNames);
        */
		names.stream().filter(s->p1.test(s)).forEach(s->c1.accept(s));
	}

}

package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {

	public static void main(String[] args) {
		
		/*ArrayList<Integer> numbersList = new ArrayList<Integer>();
		numbersList.add(10);
		numbersList.add(15);
		numbersList.add(20);
		numbersList.add(25);
		numbersList.add(30);
		*/
		List<Integer> numbersList = Arrays.asList(10,15,20,25,30);
		
		List<Integer> evenNumbersList = new ArrayList<Integer>();
		
		/*
		evenNumbersList = numbersList.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenNumbersList);
		*/
		
		numbersList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
	}

}

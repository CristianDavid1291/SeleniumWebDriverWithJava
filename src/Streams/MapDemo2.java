package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo2 {

	public static void main(String[] args) {
		
		List<String> cars = Arrays.asList("bus", "car", "bicycle", "flight", "train");
		List carsLength = cars.stream().map(c->c.length()).collect(Collectors.toList());
		System.out.println(carsLength);
		cars.stream().map(c->c.length()).forEach(c->System.out.println(c));

	}

}

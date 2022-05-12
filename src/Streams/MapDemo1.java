package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {

	public static void main(String[] args) {

		List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");

		List<String> vehiclesUpperCase = vehicles.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(vehiclesUpperCase);

		vehicles.stream().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

	}

}

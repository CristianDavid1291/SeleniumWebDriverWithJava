package Streams;

import java.util.Arrays;
import java.util.List;

class Student {
	String name;
	int id;
	char grade;

	public Student(String name, int id, char grade) {

		this.name = name;
		this.id = id;
		this.grade = grade;
	}
}

public class FlatMapDemo3 {

	public static void main(String[] args) {

		List<Student> list1 = Arrays.asList(new Student("Roberto", 1, 'A'), 
				new Student("Angela", 2, 'E'),
				new Student("Sebastian", 3, 'I'));

		List<Student> list2 = Arrays.asList(new Student("Juan", 1, 'A'), 
				new Student("Pedro", 2, 'E'),
				new Student("Steffa", 3, 'I'));

		List<Student> list3 = Arrays.asList(new Student("Jonny", 1, 'A'), 
				new Student("Felipe", 2, 'E'),
				new Student("Andres", 3, 'I'));

		List<List<Student>> completeList = Arrays.asList(list1, list2, list3);
		
		//names of students
		completeList.stream().flatMap(x->x.stream())
							 .map(s->s.name)
							 .forEach(s->System.out.println(s));
		
	}

}

package Streams;

import java.util.Arrays;
import java.util.List;

class Student1 {

	String name;
	int score;

	public Student1(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() 
	{
		return this.name;
	}

	public int getScore()
	{
		return this.score;
	}
}

public class ParallelStreamDemo1 {

	public static void main(String[] args) {
		
		List<Student1> students = Arrays.asList(
								new Student1("Cristian", 90),
								new Student1("Angel", 91),
								new Student1("Guillermo", 79),
								new Student1("Santiago",81),
								new Student1("Andres", 76),
								new Student1("Sammy",81)
									);
		//using stream
		students.stream().filter(s->s.score>80)
						 .limit(3)
						 .forEach(s->System.out.println(s.getName() +" "+s.getScore()));
		
		//parallel stream
		students.parallelStream().filter(s->s.score>80)
		 				 .limit(3)
		                 .forEach(s->System.out.println(s.getName() +" "+s.getScore()));
		
		

	}

}

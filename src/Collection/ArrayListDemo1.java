package Collection;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(100);
		al.add("Welcome");
		al.add(15.5);
		al.add('a');
		al.add(true);
		
		System.out.println(al); //[100, Welcome, 15.5, a, true]
		System.out.println(al.size()); 

		
	}

}

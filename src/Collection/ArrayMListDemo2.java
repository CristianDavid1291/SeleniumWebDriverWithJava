package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayMListDemo2 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		
		// Sort --- Collections.sort()
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		
		Collections.shuffle(al);
		System.out.println(al);
		
	}

}

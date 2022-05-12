package Collection;

import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		
		//Declare Linked List
		LinkedList l = new LinkedList();
		//LinkedList<Integer> l = new LinkedList<Integer>();
		
		//Add elements into linked list
		l.add(100);
		l.add("welcome");
		l.add(15.5);
		l.add('A');
		l.add(true);
		System.out.println(l);
		System.out.println(l.size());

		//remove
		l.remove(3);
		System.out.println("After removing new list: "+l);
		
		//Insert/adding element in the middle of linked list
		l.add(3,"Java");
		System.out.println("After inserting element: "+l);
		
		//retriving value/object
		System.out.println(l.get(3));
		
		//change the value
		l.set(4, "X");
		System.out.println("After changing the vlaue "+ l);
		
		//contains
		System.out.println(l.contains("Java"));
		System.out.println(l.contains("Python"));
	}

}

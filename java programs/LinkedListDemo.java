//DEmonstrate ArrayList
	import java.util.*;
	
	class LinkedListDemo
	{        public static void main(String args[])
	           {   LinkedList ll=new LinkedList();
		ll.add("F");
		ll.add("B");
		ll.add("D");
		ll.add("C");
	 	ll.addLast("Z");
		ll.addLast("A");
		ll.add(1,"A2");
		System.out.println("Original contents of Linkedlist : "+ll);
		ll.remove("F");
		ll.remove(2);
		System.out.println("Content of al after deletion :"+ll);
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Content of al after deletion of 1st and last :"+ll);
	}
}
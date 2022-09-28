//DEmonstrate ArrayList
	import java.util.*;
	
	class ArrayListDemo
	{        public static void main(String args[])
	           {   ArrayList al=new ArrayList();
		System.out.println("Initial size of arraylist is -"+al.size());
		al.add("c");
		al.add("A");
		al.add("E");
		al.add("B");
	 	al.add("D");
		al.add("F");
		al.add(1,"A2");
		System.out.println("Size of arraylist after additions : "+al.size());
		System.out.println("Content of al :"+al);
		al.remove("F");
		al.remove(2);
		System.out.println("Size of arraylist after deletion : "+al.size());
		System.out.println("Content of al :"+al);
	}
}
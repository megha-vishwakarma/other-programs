/*4.Write a java program to read n Students names from user, store them
into the ArrayList collection. The program should not allow duplicate
names. Display the names in Ascending order.*/

import java.util.ArrayList;
import java.util.Collections;
import java.io.*;
public class Student
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("\nEnter number of  Student: ");
        int n = Integer.parseInt(br.readLine()); 

        ArrayList<String> a = new ArrayList<String>();       
        System.out.println("\nEnter name : ");
        for(int i = 1; i <= n; i++)
        {
                 a.add(br.readLine());
        }
   System.out.println("Before Sorting:");
    System.out.println("Student list: " + a);
		
//sorting
      Collections.sort(a); 
	System.out.println("Sorted student list: "+a); 


System.out.println("\n List after removing duplicate names:");
 Object[] st = a.toArray();
      for (Object s : st) {			//remove duplicate elements
        if (a.indexOf(s) != a.lastIndexOf(s)) {
            a.remove(a.lastIndexOf(s));
         }
      }
System.out.println("Student list: " + a);
          }
}
	
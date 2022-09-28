import java.util.*;
import java.io.*;
public class Employee_Hashtable{
public static void main(String args[])throws Exception{
int n,sal=0;
String name;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
Hashtable  h = new Hashtable();
System.out.println("\nEnter number of  Employee : ");
n = Integer.parseInt(br.readLine());
for(int i = 1; i <= n; i++){
System.out.println("\nEnter Name of "+i+" :- ");
name = br.readLine();
System.out.println("\nEnter Salary "+i+" :-");
sal=Integer.parseInt(br.readLine());
h.put(name,sal);
}
Enumeration v = h.elements();   
Enumeration k = h.keys();          
while(k.hasMoreElements()){
System.out.println(k.nextElement()+"   "+v.nextElement());
}
int max = 0;
String str="";
k = h.keys();
v = h.elements();
while(v.hasMoreElements()){
sal=(Integer)v.nextElement();
name = (String)k.nextElement();
if(sal>max){
max = sal;
str = name;
}
System.out.println(str +" has maximum salary is "+max);
}
}
}

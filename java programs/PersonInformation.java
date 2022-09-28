import java.io.*;
class Person{
String P_Name;
String P_City;
String P_Contact_Number;
void accept()throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter Person Name :- ");
P_Name = br.readLine();
System.out.println("Enter Person City :- ");
P_City = br.readLine();
System.out.println("Enter Person Contact Number :- ");
P_Contact_Number = br.readLine();
}
void display(){
System.out.println("Person Name = "+P_Name);
System.out.println("Person City = "+P_City);
System.out.println("Person Contact Number = "+P_Contact_Number);
}
}
class PersonInformation{
public static void main(String args[])throws IOException{
Person p1 = new Person();
Person p2 = new Person();
p1.accept();
p1.display();
p2.accept();
p2.display();
}
}






 
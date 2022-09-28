import java.io.*;
class Book{
String name;
String auther_name;
int totalPages;
int coverPrice;
Book(String n, String an, int tp, int cp){
name = n;
auther_name = an;
totalPages = tp;
coverPrice = cp;
}
void Display(){
System.out.println("Book Name = "+name);
System.out.println("Auther Name = "+auther_name);
System.out.println("Total Pages = "+totalPages);
System.out.println("Cover Price = "+coverPrice);
}
}
class BookDetails{
public static void main(String args[]){
Book b1 =new Book("The Alchemist", "Paulo Coelho's", 781, 233);
Book b2 = new Book("The Theory Of Everything", "Stephen W Hawking", 754, 219);
Book b3 = new Book("Sherlock Holmes", "Conan Doyle", 985, 258);
Book b4 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 887, 497);
int avtp;
int avcp;
b1.Display();
b2.Display();
b3.Display();
b4.Display();
avtp = (b1.totalPages+b2.totalPages+b3.totalPages+b4.totalPages)/4;
System.out.println("Average Pages = "+avtp);
avcp = (b1.coverPrice+b2.coverPrice+b3.coverPrice+b4.coverPrice)/4;
System.out.println("Average Price = "+avcp);
}
}


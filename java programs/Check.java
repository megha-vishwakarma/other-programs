import java.io.*;
class InvalidException extends Exception{   }
	
class Check
{

public static void main(String args[]) throws IOException
{
char ch;
BufferedReader inputstream =new BufferedReader(new InputStreamReader(System.in));

/*System.out.println("Enter data:-");
ch=(char) inputstream.read();     */

Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
System.out.print("Enter a string: ");  
String str= sc.nextLine();           
      int len = sc.length();
      for (int i = 0; i < len; i++) 
{
try{
if(Character.isDigit(ch))
{	throw new InvalidException(); }

else if(Character.isUpperCase(ch))
{
System.out.println("Entered Character is Upper case");
}
else if(Character.isLowerCase(ch))
{
System.out.println("Entered Character is Lower Case");
}
else
System.out.println("Entered Character is special char");
}catch(InvalidException e)
{        System.out.println("Digits are not allowed ");}
}
}
}


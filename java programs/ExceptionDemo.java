import java.io.*;

class NumberZero extends Exception
	{	NumberZero(){}    }
class Number{
	static int no;
	Number()throws IOException
	{	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n Enter number:- ");
		no=Integer.parseInt(br.readLine());
	     try
	  {	if(no==0)
	           {         throw new NumberZero();     }
		cal();
           	            }
	       catch(NumberZero e)
	         {        System.out.println(e); 	}
	}
      void cal()
{	int l=0;     int r=0;
	l=no%10;
	     if(no>9)
	{	while(no>0)
		{     r=no%10;
 		       no=no/10;     }
	         System.out.println("Addition of first and last digit :- "+(l+r));
		}
	      else
  	            System.out.println("Addition of first and last digit :- "+l);
}}
class ExceptionDemo
{	public static void main(String a[])throws IOException
	{	Number n=new Number();	}
}
	           
//Creating own exception

class NegativeOutputException extends Exception
{	private int d;
	NegativeOutputException(int a)
	 {         d=a;     }
         public String toString()
	{ return "NegativeOutputException["+d+"]";    }
}
class OwnException
{       public static void main(String args[])
       {       int x=Integer.parseInt(args[0]);
	int y=Integer.parseInt(args[1]);
	int z;
         try{
	z=x*y;
	if(z<0)
	         throw new NegativeOutputException(z);
	System.out.println("\n Ouput "+z);            }
catch(NegativeOutputException e)
     {     System.out.println("Caught "+e);     }
}}


class  ExMethods{
	public static void main(String args[])
	{	int x=56;		int y=0;

		try{
		         int z=x/y;
			System.out.println("Value :"+z);
			}
		catch(ArithmeticException e)
	{   	     System.out.println("getMessage:- ");
		     System.out.println(e.getMessage());
		     System.out.println("\nPrintStack trace:-");
			e.printStackTrace();
		      System.out.println("\n toString- ");
		       System.out.println(e.toString());
		     System.out.println("\nReferring object-");
		     System.out.println(e);
		}
			System.out.println("\nEnd of program   .");
}
}
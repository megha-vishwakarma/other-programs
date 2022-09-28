/*import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.FileReader;

public class WordCount{
	Public static void main(String[] agrs)
{	BuffereReader reader=null;
	int charCount=0;
	int wordCount=0;
	int lineCount=0;
	
	    try{
	            reader=new BufferredReader object reader=new BufferedReader(new FileReader("Dest.txt"));
		String Currentline=reader readLine();

	      While(Currentline!=null)	
	{          lineCount++;
		String[] words=Currentline split(" ");
	           wordCount=wordCount+words.length;
	           for(String word:words)
	   {                  charCount=charCount+word.lenght();
	    }
		Currentline=reader.readline();
	}

System.out.println("\nNumber of char in a file is "+charCount);
System.out.println("\nNumber of char in a file is "+wordCount);
System.out.println("\nNumber of char in a file is "+lineCount);
}
	catch(IOException e)
        {	e.printStackTrance();     }
Finally
{      try {	reader.close();}
       catch{       e.printStackTrace();}
}}    */	




//program to count lines,char n words of file
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class WordCount
{   
    public static void main(String[] args) 
    {
        BufferedReader reader = null;
         
        //Initializing charCount, wordCount and lineCount to 0
         
        int charCount = 0;
         
        int wordCount = 0;
         
        int lineCount = 0;
         
        try
        {
            //Creating BufferedReader object
             
            reader = new BufferedReader(new FileReader("Dest.txt"));
             
            //Reading the first line into currentLine
             
            String currentLine = reader.readLine();
             
            while (currentLine != null)
            {
                //Updating the lineCount
                 
                lineCount++;
                 
                //Getting number of words in currentLine
                 
                String[] words = currentLine.split(" ");
                 
                //Updating the wordCount
                 
                wordCount = wordCount + words.length;
                 
                //Iterating each word
                 
                for (String word : words)
                {
                    //Updating the charCount
                     
                    charCount = charCount + word.length();
                }
                 
                //Reading next line into currentLine
                 
                currentLine = reader.readLine();
            }
             
            //Printing charCount, wordCount and lineCount
             
            System.out.println("Number Of Chars In A File : "+charCount);
             
            System.out.println("Number Of Words In A File : "+wordCount);
             
            System.out.println("Number Of Lines In A File : "+lineCount);
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                reader.close();           //Closing the reader
            }
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }   
}
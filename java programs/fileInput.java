import java.util.Scanner;
import java.io.*;

public class fileInput
{
    public static void main(String[] input)
    {
        String fname;
        Scanner scan = new Scanner(System.in);
        
        // enter the name of file to create a file and write some content inside
        
        System.out.print("Enter File Name with Extension (like file1.txt) : ");
        fname = scan.nextLine();
        
        try
        {
            // assume the default encoding
            FileWriter fileWriter = new FileWriter(fname);
            
            // always wrap FileWriter in BufferedWriter
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            // Note that write() method does not automatically
            // append a newline character
            
            int len;
            System.out.print("How many Sentence/Line you Want to Enter ? ");
            len = scan.nextInt();
            int i;
            String sentence;
			
            System.out.print("Enter " +len+ " Lines of Sentences followed by Enter : ");
            for(i=0; i<len+1; i++)
            {
                sentence = scan.nextLine();
                bufferedWriter.write(sentence);
                bufferedWriter.newLine();
            }
            
            // always close the file
            bufferedWriter.close();
        }
        catch(IOException ex)
        {
            System.out.println("Error writing to file named '" +fname+ "' ..!!");
        }
    }
}
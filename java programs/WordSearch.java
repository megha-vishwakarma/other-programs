import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.*;

public class WordSearch 
{
   public static void main(String[] args) throws IOException 
   {
      File f1=new File("demo.txt");
      String[] words=null;
      FileReader fr = new FileReader(f1); 
      BufferedReader br = new BufferedReader(fr);
      String s;     
      String input="That";   
      int count=0;   
      while((s=br.readLine())!=null)   
      {
         words=s.split(" ");  
          for (String word : words) 
          {
                 if (word.equals(input))   
                 {
                   count++;    
                 }
          }
      }
      if(count!=0)  {

          File file = new File("demo.txt");
          BufferedReader bh = new BufferedReader(new FileReader(file));
          String st;
          while ((st = bh.readLine()) != null)
          System.out.println(st);
          System.out.println("\n");
          
          System.out.println("The given word is present "+count+ " Times in the file"+"\n");

        String text  = "That";
        Path fileName = Path.of("demo.txt");
        Files.writeString(fileName, text);
        String file_content = Files.readString(fileName);

         System.out.println("Word Copied to demo.txt");
      }
      else
      {
         System.out.println("The given word is not present in the file");
      }
      
         fr.close();
   }


}
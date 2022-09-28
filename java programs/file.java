import java.io.FileInputStream;
import java.io.FileOutputStream;

class file {
  public static void main(String[] args) {

    byte[] array = new byte[50];
    try {
      FileInputStream sourceFile = new FileInputStream("a.txt");
      FileOutputStream destFile = new FileOutputStream("newFile");

      // reads all data from input.txt
      sourceFile.read(array);

      // writes all data to newFile
      destFile.write(array);
      System.out.println("The input.txt file is copied to newFile.");

      // closes the stream
      sourceFile.close();
      destFile.close();
    }
    catch (Exception e) {
      e.getStackTrace();
    }
  }
}



/*import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths; 
public class file {
	
	public static void main(String[] args) throws IOException{  
		Path path = Paths.get("a.txt");
		OutputStream os = new FileOutputStream("new.txt");
		Files.copy(path,os);
	System.out.println("The file is copied to new File.");	
}*/

/*
import java.io.IOException;
import java.nio.file.*;
  
public class Test
{
    public static void main(String[] args)
    {
        try
        {
            Files.deleteIfExists(Paths.get("a.txt"));
        }
        catch(NoSuchFileException e)
        {
            System.out.println("No such file/directory exists");
        }
        catch(DirectoryNotEmptyException e)
        {
            System.out.println("Directory is not empty.");
        }
        catch(IOException e)
        {
            System.out.println("Invalid permissions.");
        }
          
        System.out.println("Deletion successful.");
    }
}*/
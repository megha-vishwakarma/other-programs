import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths; 
public class Files
{	public static void main(String[] args) throws IOException
	{  
		Path path = Paths.get("demo.txt");
		OutputStream os = new FileOutputStream("f1.txt");
		Files.copy(path,os);
		System.out.println("File copied successfully");
		System.out.println("File deleted successfully");
		
	}
}

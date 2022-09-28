import java.io.File;  // Import the File class

public class DeleteFile {
  public static void main(String[] args) { 
	  System.out.println("File data is copy to new file");
    File myObj = new File("demo.txt"); 
    if (myObj.delete()) { 
      System.out.println("Deleted the file");
    } else {
      System.out.println("Failed to delete the file.");
    } 
  } 
}
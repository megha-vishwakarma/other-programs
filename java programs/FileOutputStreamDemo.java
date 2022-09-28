//Demonstrate file output
	import java.io.*;
	import java.io.FileInputStream;
import java.io.FileOutputStream;
	class  FileOutputStreamDemo{
		public static void main(String args[])throws Exception
    {
		           String source="Modern College Arts,Science and commerce ,Pune";
			byte buf[]=source.getBytes();
		
FileOutputStream f0= new FileOutputStream("File1.txt");
	for(int i=0;i<buf.length;i+=2)
	{      f0.write(buf[i]);  }
	
       f0.close();
 FileOutputStream f1= new FileOutputStream("File2.txt");
   f1.write(buf);
   f1.close();
}
}
	
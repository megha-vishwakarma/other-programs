//Demonstration of file input stream

import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;

	class FileInputStreamDemo{
	    public static void main(String agrs[])throws  Exception{
		int size;
	FileInputStream f= new FileInputStream("FileInputStreamDemo.java");
	System.out.println("Total Available bytes : "+(size=f.available()));
	for(int i=0;i<size;i++)
	{      System.out.print((char) f.read());	}
       }}
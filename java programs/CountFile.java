import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.util.*;

class CountFile
{	public static void main(String agrs[])throws  IOException{
	       int nl=1,nw=0;
                         char ch;
	Scanner scr=new Scanner(System.in);
	System.out.println("Enter file name - ");
	String str=scr.nextLine();
                 FileInputStream f=new FileInputStream(str);
	int n=f.available();
	for(int i=0;i<n;i++)
         {       ch=(char)f.read();
	if(ch=='\n')
	nl++;
	else if(ch==' ')
	nw++;
          }
 System.out.println("Number Of Chars In A File : "+n);
             
            System.out.println("Number Of Words In A File : "+(nl+nw));
             
            System.out.println("Number Of Lines In A File : "+nl);
        
}
}



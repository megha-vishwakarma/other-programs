import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Alternate {
	public static void main(String[] args) throws IOException {
		File dir = new File(".");
 
		String source = dir.getCanonicalPath() + File.separator + "demo.txt";
		String dest = dir.getCanonicalPath() + File.separator + "Dest.txt";
 
		File fin = new File(source);
		FileInputStream fis = new FileInputStream(fin);
		BufferedReader in = new BufferedReader(new InputStreamReader(fis));
 
		FileWriter fstream = new FileWriter(dest, true);
		BufferedWriter out = new BufferedWriter(fstream);
 			
		String aLine = null;
		int i=0;
		while ((aLine = in.readLine()) != null) {
			//Process each line and add output to Dest.txt file
		if (i % 2 != 0){
			out.write(aLine);
			out.newLine();}
			i=+1;
		}
 
		// do not forget to close the buffer reader
		in.close();
 
		// close buffer writer
		out.close();
	}
}
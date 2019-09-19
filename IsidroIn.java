import java.io.*;
import java.util.*;

public class IsidroIn {
    public static void main(String [] args)throws IOException {
 
    Scanner in = new Scanner (System.in);
 	System.out.println("Enter the name you want: ");
 	String filename = in.nextLine();
 	filename = filename + ".txt";
 	
 	File input = new File(filename);
 	
 	 input.createNewFile();
 	FileWriter w = new FileWriter(filename);
 	
 	System.out.println(" ");
 	System.out.print ("Enter Text You want in the file: ");
 	String text = in.next();
 	w.write (text);
 	w.flush();
 }
}  
    
import java.io.*;
import java.util.*;


public class MarkIn {
    
    public static void main(String[] args) throws Exception {
    	
    	Scanner toy = new Scanner(System.in);
    	System.out.print("Enter the Name you want: ");
    	String filename = toy.nextLine();
    	filename = filename + ".txt";
    	
    	File input = new File(filename);
    	
    	 input.createNewFile();
    	FileWriter w = new FileWriter(filename);
    	
    	System.out.println(" ");
    	System.out.print("Enter Text You want in the file: ");
    	String text = toy.next();
    	w.write(text);
    	w.flush();
    	
    }
    
}
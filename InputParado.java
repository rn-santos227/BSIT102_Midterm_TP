import java.io.*;
import java.util.*;

public class InputParado {
    
    public static void main(String[] args) throws Exception {
    	
    	Scanner s = new Scanner(System.in);
    	System.out.print("Enter Filename: ");
    	String filename = s.nextLine();
    	filename = filename + ".txt";
    	File input = new File(filename);
    	input.createNewFile();
    	FileWriter write = new FileWriter(filename);
    	System.out.print("Enter Text You want in the file: ");
    	String text = s.next();
    	write.write(text);
    	write.flush();
    	
    }
    
}
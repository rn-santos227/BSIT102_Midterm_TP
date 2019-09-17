import java.io.*;
import java.util.*;

public class reader {

    public static void main (String[] args)throws IOException {
    	
    	
    	System.out.println("Enter your file: ");
    	Scanner read = new Scanner(System.in);
    	
    	File file = new File(read.nextLine() +".jc");
    	read = new Scanner(file);
    	
    	String printer = read.nextLine();
    	System.out.println(printer);
    	
    	read.close();
    	
    	
    }
    
    
}
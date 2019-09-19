
import java.io.*;
import java.util.*;

public class MarkOut {

    public static void main (String[] args)throws IOException {

    	System.out.print("Enter your file: ");
    	Scanner read = new Scanner(System.in);
    	File file = new File(read.nextLine() +".txt");
    	read = new Scanner(file);
    	String printer = read.nextLine();
    	System.out.println(" ");
    	System.out.print("Contents of the file: ");
    	System.out.println(printer);
    	read.close();
    	
    }
    
}
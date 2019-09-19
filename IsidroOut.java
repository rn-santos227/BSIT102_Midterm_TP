
import java.io.*;
import java.util.*;

public class IsidroOut {

    public static void main (String[] args)throws IOException {

    	System.out.print("Enter your file: ");
    	Scanner r = new Scanner(System.in);
    	File file = new File(r.nextLine() +".txt");
    	r = new Scanner(file);
    	String printer = r.nextLine();
    	System.out.println(" ");
    	System.out.print("Contents of the file: ");
    	System.out.println(printer);
    	r.close();
    	
    }
    
}
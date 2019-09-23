import java.io.*;
import java.util.*;
public class OutputParado {
    public static void main (String[] args)throws IOException {

    	System.out.print("Enter Filename you created: ");
    	Scanner r = new Scanner(System.in);
    	File file = new File(r.nextLine() +".txt");
    	r = new Scanner(file);
    	String printer = r.nextLine();
    	System.out.print("File Contents: ");
    	System.out.println(printer);
    	r.close();
    	
    }
    
}
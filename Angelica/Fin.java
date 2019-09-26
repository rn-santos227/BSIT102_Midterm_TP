

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.io.FileWriter;
import java.util.Scanner;

public class Fin {

	public static void main(String []args) throws IOException {
    	
    Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Type your file name: ");
    	
    	String fn = sc.next();
    	
    	FileWriter nia = new FileWriter(fn + ".pmab");
    	
    	System.out.print("Input your text: ");
    	
    	String text = sc.next();
    	
    	angel.write(text);
    	angel.close();
    	
    }
}
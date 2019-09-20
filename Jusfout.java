import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Jusfout {

    public static void main(String[] args) throws IOException
    	 {
    	 	
    	 	System.out.print("Type the file name with extension :");
    	 	Scanner jusInput = new Scanner(System.in);
    	 	
    	 	File jusfile = new File(jusInput.nextLine()+".jmb");
    	 	jusInput = new Scanner(jusfile);
    	 	
    	 	String jusLine = jusInput.nextLine();
    	 	System.out.println(jusLine);
    	 	
    	 	jusInput.close();
    	 	  	 	
    }
    
    
}
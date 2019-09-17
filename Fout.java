
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Fout {

    public static void main (String[]args)throws IOException{
    
    	System.out.print("Enter the file name with extension:");
    	Scanner sc = new Scanner(System.in);
    	
    	File GuionFile = new File(sc.nextLine()+".txt");
    	sc = new Scanner(GuionFile);
    	
    	String GuionLine = sc.nextLine();
    	System.out.println(GuionLine);
    	
    	sc.close();
    }
    
    
}
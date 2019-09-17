import java .io.*;
import java.util.Scanner;


public class Jc {
    
    public static void main(String []args)throws IOException {
    	
    	Scanner input = new Scanner(System.in);
    	String file1;
    	String filename;  	
    		
    		System.out.println("Name your file: ");
    		filename = input.nextLine();
    		FileWriter fw = new FileWriter(filename+".jc"); 
    	 	
    	 	System.out.println("Enter Words: ");
    	 	file1 = input.nextLine();
    	 		 
           fw.write(file1);   
           fw.close();  
    	
    }
}

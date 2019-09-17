import java.io.*;
import java.util.*;
public class Out {
    
    public static void main(String[] args)throws Exception {
    	
    	Scanner in = new Scanner(System.in);
    	
    	
    	
    	System.out.print("Please Enter File Name: "); 
    	String filename = in.next();
    	
    	
    	String FileName = "C:\\Users\\Complab502-PC43\\Documents\\" + filename + ".txt"; // input directory of the file

   		RandomAccessFile file = new RandomAccessFile(FileName, "r");
		String input = file.readLine();
		
		System.out.println("");
		System.out.println("Text inside the file: ");
		System.out.println(input);
    }
}
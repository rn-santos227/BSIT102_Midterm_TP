import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.io.FileWriter;
import java.util.Scanner;


public class Input_file {
    
    public static void main(String[] args) throws IOException{
    	
    	Scanner scan = new Scanner(System.in);
    		System.out.println("Enter File Name ");
    		
  			FileWriter fw = new FileWriter(scan.nextLine() + ".jgh");
    		
    		System.out.println("Write Anything");
    		fw.write(scan.nextLine());
    		
    		
    		

    		
    }
}
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;


public class Write {
    
      public static void main(String[]args) throws IOException {
      	
      	Scanner scan = new Scanner(System.in);
      	String Ffile;
      	String Input_name;
      	
      	System.out.print("Enter FileName:");
      	Input_name = scan.nextLine();
      	Writer writer = new FileWriter("D:\\Hey\\" + Input_name + ".Gabby");
      	
      	System.out.println ("Enter Content:");
      	Ffile = scan.nextLine();
      	
      	writer.write(Ffile);
      	writer.close();
      	
    }
    
    
}
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;
 
public class Write {
    
    public static void main(String[] args) throws IOException {
    	
    	
    	Scanner sc = new Scanner(System.in);
    	String Ffile;
    	String Input_name;
    	
    	System.out.print("Enter Filename:");
    	Input_name = sc.nextLine();
    		Writer writer = new FileWriter(Input_name +".ken");
    		
    	System.out.println("Enter Content:");
    	Ffile = sc.nextLine();
    	
    	writer.write(Ffile);
    	writer.close();
    	
    }
}

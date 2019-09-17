import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;
 
public class File_Queen {
    
    public static void main(String[] args) throws IOException {
    	Scanner scn = new Scanner(System.in);
    	
    	System.out.println("Enter your file name");
    	FileWriter flw = new FileWriter(scn.nextLine() + ".queen");
    	
    	System.out.println("Write anything");
    	flw.write(scn.nextLine());
    	flw.close();
    	
    
    
    }
}

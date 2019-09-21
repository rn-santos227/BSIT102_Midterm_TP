import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.io.FileWriter;
import java.util.Scanner;
 
public class Jusfin {
    
    public static void main(String[] args) throws IOException 
    	{ 
    		Scanner sc = new Scanner(System.in);
    		String FileText;
    		String jusText;
    		
    		System.out.print("Type the file text: ");
    		FileText = sc.nextLine();
    		System.out.print("Type the file name: ");
    		jusText = sc.nextLine();
    	
    		FileWriter jus = new FileWriter(jusText + ".jmb");
    		jus.write(FileText);
    		jus.close();
    	
    
    }
}

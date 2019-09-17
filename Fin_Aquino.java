import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.io.FileWriter;
import java.util.Scanner;

public class Fin_Aquino 
{

    public static void main (String args[]) throws IOException
    
    {
    	Scanner sc = new Scanner(System.in);
    	String FileText;
    	String aquinoText;
    	
    	System.out.println("Input File Text");
    	FileText = sc.nextLine();
    	System.out.println("Input File Name");
    	aquinoText = sc.nextLine();
    	
    	FileWriter aquinoFile = new FileWriter(aquinoText+".DA");
    	aquinoFile.write(FileText);
    	aquinoFile.close();
    		
    }
    
    
}
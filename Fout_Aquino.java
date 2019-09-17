import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Fout_Aquino 
{

    public static void main(String[] args) throws IOException
    
    {
    	System.out.print("Enter the file name with extension: ");
    	Scanner aquinoInput = new Scanner(System.in);
    	
    	File aquinoFile = new File(aquinoInput.nextLine()+".DA");
    	aquinoInput = new Scanner(aquinoFile);
    	
    	String aquinoLine = aquinoInput.nextLine();
    	System.out.println(aquinoLine);
    	
    	aquinoInput.close();
    	
    }
    
    
}
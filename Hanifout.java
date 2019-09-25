
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Hanifout {

    public static void main(String[] args) throws IOException
    	 {

    	 	System.out.print("Type the file name with extension :");
    	 	Scanner haniInput = new Scanner(System.in);

    	 	File haniFile = new File(haniInput.nextLine()+".dmt");
    	 	haniInput = new Scanner(haniFile);

    	 	String haniLine = haniInput.nextLine();
    	 	System.out.println(haniLine);

    	 	haniInput.close();

   
 }
 
}

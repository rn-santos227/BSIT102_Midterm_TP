
import java.io.*;
import java.util.*;
 
public class In {
    
    public static void main(String[] args) throws Exception  {
    	
    	Scanner in = new Scanner(System.in);
    	System.out.print("Enter the desired name of your file: ");
   		String filename = in.nextLine();
   		filename = filename + ".txt";

   		
   		File input = new File(filename);
   		input.createNewFile();
   		FileWriter write = new FileWriter(filename);
		
		System.out.println(" ");
		System.out.print("Enter Text You Want In The File: ");
		String text = in.next();
		write.write(text);
		write.flush();
		
		//file will be created where the java file is

    }
}

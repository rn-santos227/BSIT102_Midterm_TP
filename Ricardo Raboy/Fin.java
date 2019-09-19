import java.io.*;
import java.util.Scanner;
public class Fin {

	public static void main(String[] args)throws Exception {
		
    Scanner in = new Scanner (System.in);
    System.out.println("Enter the Name you want");
    String filename = in.nextLine()+".txt";
   
    
    File input = new File(filename);
    
      input.createNewFile();
      FileWriter w = new FileWriter(filename);
      
      System.out.println(" ");
      System.out.print("Enter Text You want in the file: ");
      String text = in.next();
      w.write(text);
      w.flush();
      }

}

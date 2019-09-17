import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.io.FileWriter;
import java.util.Scanner;

public class FinMerced {

   public static void main(String[] args)throws IOException{
   	Scanner input = new Scanner(System.in);
   	String FileText;
   	String mercedText;
   	
   	System.out.println("Input File Text");
   	FileText = input.nextLine();
   	System.out.print("Input File Name");
   	mercedText = input.nextLine();
   	
   	FileWriter mercedFile = new FileWriter(mercedText+".KM");
   	mercedFile.write(FileText);
   	mercedFile.close();

   }
}
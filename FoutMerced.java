import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.io.FileWriter;
import java.util.Scanner;


public class FoutMerced {

    public static void main(String[] args) throws IOException {
   
    System.out.print("Enter a file name exception: ");
    Scanner mercedInput = new Scanner(System.in);
    
    File mercedFile = new File(mercedInput.nextLine()+".KM");
    mercedInput = new Scanner(mercedFile);
    
    String mercedLine = mercedInput.nextLine();
    System.out.println(mercedLine);
    
    mercedInput.close();
    
    
}

}
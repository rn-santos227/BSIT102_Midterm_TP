import java.io.IOException;
import java.io.Writer;
import java.io.FileWriter;
import java.util.Scanner;

public class Hanifin {

    public static void main (String[]args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	String FileText;
    	String haniText;

    	System.out.println("Input file text: ");
    	FileText = sc.nextLine();
    	System.out.println("Input file name: ");
    	haniText = sc.nextLine();

    	FileWriter hani = new FileWriter(haniText+ ".dmt");
    		hani.write(FileText);
    		hani.close ();
    }


}

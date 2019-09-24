import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Read {

    public static void main (String[]args)throws IOException {
    	
    	System.out.print("Enter Your Name and Extension:")'
    		Scanner sinput = new Scanner(System.in);
    		
    		File Sfile = new File(("D:\\Hey\\" + sinput.nextLine()+".Gabby"));
    		sinput = new Scanner(Sfile);
    		System.out.println(Gabby);
    		
    		sinput.close();
    		
    } 
    
    
}
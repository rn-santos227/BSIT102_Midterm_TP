/**
 * @(#)FOUT.java
 *
 * FOUT application
 *
 * @author 
 * @version 1.00 2019/9/24
 */
 import java.util.Scanner;
 import java.io.File;
 import java.io.IOException;
public class FOUT {
    
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.print("Enter file name with extension: ");
    	File KFile = new File(scan.nextLine() + ".txt");
    	
    	scan = new Scanner (KFile);
    	
    	String KFile = scan.nextLine();
    	System.out.print(KFile);
    	
    	scan.close();
    	
    }
}

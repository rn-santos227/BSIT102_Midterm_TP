import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Tuyortpfout {
    
    public static void main(String[] args) throws IOException {
    	 System.out.println("Enter file name: ");
    	 Scanner sc=new Scanner(System.in);
    	 File tuyorf=new File (sc.nextLine()+ ".tuyor");
    	 sc=new Scanner (tuyorf);
    	 
    	 String tuyorlin = sc.nextLine();
    	 System.out.println(tuyorlin);
    	 sc.close();
    
    	
    }
}
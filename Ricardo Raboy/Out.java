import java.io.*;
import java.util.Scanner;
public class Out {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner (System.in);
        String read;
        System.out.print("Enter FileName");
    	File file=new File (in.nextLine()+ ".txt");
        in = new Scanner (file);
    	read = in.nextLine();
    	System.out.println(read);
	}

}

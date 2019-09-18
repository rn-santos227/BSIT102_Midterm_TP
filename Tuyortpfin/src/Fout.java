import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Fout {
public static void main (String []args) {
	String tuyorlin;
	Scanner input =new Scanner(System.in);
	System.out.print("Enter The Name of the File ");
	try {
	File FileOut=new File (input.nextLine()+ ".tuyor");
	input = new Scanner (FileOut);
	tuyorlin = input.nextLine();
	System.out.println(tuyorlin);
	}
	catch (IOException e){
	System.err.println ("Unable to read the File");
	System.exit(-1);	
	}
}
}

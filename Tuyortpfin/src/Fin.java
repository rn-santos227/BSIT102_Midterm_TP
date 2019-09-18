import java.io.File; 
import java.io.IOException;
import java.io.Writer;
import java.io.FileWriter;
import java.util.Scanner;
public class Fin {
public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		String txt;
		String txt1;
		
		
		try {
		System.out.println("Enter Something inside The File ");
		txt = input.nextLine();
	    System.out.println("Write The Name of the File");
		txt1 = input.nextLine();
		File file = new File (txt1);
		Writer files = new FileWriter(file +".tuyor");
		files.write(txt);
		files.close();
		input.close();
		}
		
		catch (IOException e){
		System.err.println ("Unable to Write the File");
		System.exit(-1);	
		}
		


}
}

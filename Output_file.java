import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Output_file
{
		public static void main(String[]args) throws Exception
		{
			
			System.out.println("Enter the file name :");
			Scanner scn = new Scanner(System.in);
			
			File filer = new File(scn.nextLine() + ".jgh");
			scn = new Scanner(filer);
			
			String linesss = scn.nextLine();
			System.out.println(linesss);
			
		
			
			
			
		}
}
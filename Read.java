import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Read {
	
	public static void main (String[] args) throws IOException
		{
			
			System.out.print("Enter your name and extension : ");
			Scanner sinput = new Scanner(System.in);
			
			File Sfile = new File((sinput.nextLine()+".ken"));
			sinput = new Scanner(Sfile);
			
			String Ken = sinput.nextLine();
			System.out.println(Ken);
			
			sinput.close();
		
		
	}
}
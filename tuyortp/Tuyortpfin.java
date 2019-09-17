import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.io.FileWriter;
import java.util.Scanner;
public class Tuyortpfin {
    
    public static void main(String[] args) throws IOException{
    String FileText;
    String tuyortxt;
   Scanner input =new Scanner(System.in); 
     System.out.print("Write Something on your File: ");
     FileText=input.nextLine();
      System.out.print("Input File Name: ");
      tuyortxt=input.nextLine();
      
      FileWriter tyfiles=new FileWriter(FileText+".TY");
	  tyfiles.write(FileText);
	  tyfiles.close();     
	  
	  }
	
   
  
   	
   
    
       }
           
}


import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.io.FileWriter;
import java.util.Scanner;

public class Fin {

   public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("MyFile.txt");
            int character;
 
            while ((character = writer.read()) != -1) {
                System.out.print((char) character);
            }
            writer.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
}
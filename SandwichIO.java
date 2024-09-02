import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class SandwichIO  {
	public static void writeToFile(String m) throws IOException {
		try {
			File file = new File("orderline.txt");
			FileWriter fw = new FileWriter(file,true);
			PrintWriter outputFile = new PrintWriter(fw);
			outputFile.println(m);
			outputFile.println("Test");
			outputFile.close();
		}
		catch(IOException e){
			System.out.println("File not found!");
		}
		
	}
}

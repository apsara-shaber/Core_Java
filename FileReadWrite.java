import java.io.FileWriter;
import java.io.IOException;
public class FileReadWrite {
	public static void main(String[] args) {
		try {
		// create file writer
		
			FileWriter writer = new FileWriter("output.txt");
			
			//write content
			writer.write("Hello, this is a file writing example in java");
			writer.write("using File Writer");
			writer.close();
			System.out.println("File wirting completed");
		}	catch(IOException e) {
			System.out.println("an error occurred");
			e.printStackTrace();
			
		}
		
	}

}

import java.io.FileReader;
import java.io.IOException;
public class FileReaderExample {
	public static void main(String[] args) {
		try {
			// specify the file name
			FileReader reader = new FileReader("output.txt");
			
			int ch;
			
			// reader charcter by character
			while((ch= reader.read())!=-1) {
				System.out.println((char)ch);
			}
			reader.close();
			
		}catch(IOException e) {
			System.out.println("error while reading the file");
			e.printStackTrace();
		}
		
	}

}

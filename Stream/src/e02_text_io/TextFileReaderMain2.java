package e02_text_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReaderMain2 {

	public static void main(String[] args) {
		//try-with-resource
		//해당 try-catch-finally가 끝나면 자동으로 close
		try(FileReader fr = new FileReader("hello.txt");
			BufferedReader br = new BufferedReader(fr);){
			
			String str = null;
			while((str = br.readLine()) != null) 
				System.out.println(str);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

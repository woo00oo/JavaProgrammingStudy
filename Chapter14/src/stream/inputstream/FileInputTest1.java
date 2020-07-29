package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest1 {

	public static void main(String[] args) {

		
		try(FileInputStream fis = new FileInputStream("input.txt")) {
			int i ;
			while( (i = fis.read()) != -1) { //파일의 마지막까지 읽음
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("end");
	}
}

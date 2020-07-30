package stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;

public class FileCopy {

	public static void main(String[] args) {

		long milliseconds = 0;
		
		try( FileInputStream fis = new FileInputStream("a.zip");
				FileOutputStream fos = new FileOutputStream("copy.zip");
				BufferedInputStream bis = new BufferedInputStream(fis); //보조스트림
				BufferedOutputStream bos = new BufferedOutputStream(fos)){
			milliseconds = System.currentTimeMillis();
			
			int i;
			while( (i = bis.read()) != -1) {
				bos.write(i);
			}
			
			milliseconds = System.currentTimeMillis() - milliseconds;
			
			//Socket socket = new Socket();
			
			//InputStreamReader isr = new InputStreamReader(socket.getInputStream().re
			
			
		} catch (IOException e) {
			System.out.println(e);
		} 
		System.out.println("시간: " + milliseconds);
			
	}

}

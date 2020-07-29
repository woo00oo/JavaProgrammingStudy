package stream.inputstream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest2 {

	public static void main(String[] args) {

		System.out.println("입력 후 '끝'이라고  쓰세요: ");
		
		try {
			int i;
			//보조 스트림 (바이트 ->문자로 변환)
			InputStreamReader isr = new InputStreamReader(System.in); 
			while( (i = isr.read()) != '\n') {
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

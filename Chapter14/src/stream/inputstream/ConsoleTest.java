package stream.inputstream;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {

		
		Console console = System.console();
		//이클립스와는 연동되지 않음
		//System.in을 사용하지 않고 콘솔에서 표준 입출력 가능
		
		
		System.out.println("이름 : ");
		
		String name = console.readLine(); //문자열을 읽음
		System.out.println("비밀번호 : ");
		char[] password = console.readPassword(); //사용자에게 문자열을 보여 주지않고 읽음.
		
		System.out.println(name);
		System.out.println(password);
	}

}

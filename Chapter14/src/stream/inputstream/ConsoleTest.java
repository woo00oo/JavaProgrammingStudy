package stream.inputstream;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {

		
		Console console = System.console();
		//��Ŭ�����ʹ� �������� ����
		//System.in�� ������� �ʰ� �ֿܼ��� ǥ�� ����� ����
		
		
		System.out.println("�̸� : ");
		
		String name = console.readLine(); //���ڿ��� ����
		System.out.println("��й�ȣ : ");
		char[] password = console.readPassword(); //����ڿ��� ���ڿ��� ���� �����ʰ� ����.
		
		System.out.println(name);
		System.out.println(password);
	}

}

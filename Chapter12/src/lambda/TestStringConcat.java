package lambda;

public class TestStringConcat {

	public static void main(String[] args) {

		StringConcat concat = (s,v)->System.out.println(s + ", " + v);
		concat.makeString("Hello", "world");
		
		
		StringConcat concat2 = (s,v)->System.out.println(s + ". " + v);
		concat2.makeString("hello", "world");
		
		//�Լ��� ����ó�� ����ϴ� ���ٽ� ( ���α׷������� ����ó�� ����� �� ���� )
		
	}

}

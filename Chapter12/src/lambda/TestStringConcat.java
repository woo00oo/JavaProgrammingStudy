package lambda;

public class TestStringConcat {

	public static void main(String[] args) {

		StringConcat concat = (s,v)->System.out.println(s + ", " + v);
		concat.makeString("Hello", "world");
		
		
		StringConcat concat2 = (s,v)->System.out.println(s + ". " + v);
		concat2.makeString("hello", "world");
		
		//함수를 변수처럼 사용하는 람다식 ( 프로그램내에서 변수처럼 사용할 수 있음 )
		
	}

}

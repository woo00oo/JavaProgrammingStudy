package lambda;

//기존에 존재하는 Interface의 형태를 빌려 람다식을 표현
interface PrintString{
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {
		
		//람다식이란 ? 함수를 변수처럼 사용 할 수 있는 개념

		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("Test");
		
		showMyString(lambdaStr);
		
		PrintString test = returnString();
		test.showString("Test3");
		
	}
	
	public static void showMyString(PrintString p) {
		p.showString("Test2");
	}
	
	public static PrintString returnString() {
		return s -> System.out.println(s + "!!!");
	}

}

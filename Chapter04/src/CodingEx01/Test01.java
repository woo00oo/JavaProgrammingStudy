package CodingEx01;

public class Test01 {

	public static void main(String[] args) {
		
		char operation = '+';
		int num1 = 10, num2 = 20;
		
		if(operation == '+') {
			System.out.println(num1+num2);
		}else if (operation == '-') {
			System.out.println(num1-num2);
		}else if(operation == '*') {
			System.out.println(num1 *num2);
		}else if(operation == '/' && num2 != 0) {
			System.out.println(num1 / num2);
		}else {
			System.out.println("연산자 오류 입니다.");
		}
		
		
		///////////////////////////////////
		
		switch(operation) {
		
			case '+':
			System.out.println(num1+num2);
			break;
			
			case '-':
				System.out.println(num1-num2);
				break;
			case '*':
				System.out.println(num1 *num2);
				break;
			case '/':
				if(num2 != 0) {
					System.out.println(num1 / num2);
				}
				break;
			default :
				System.out.println("연산자 오류 입니다.");
		}
		
		

	}

}

package innerclass;

class OutClass{
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass(){
		inClass = new InClass();
	}
	
	class InClass{ //OutClass가 생성되어야 사용할 수 있음
		int inum = 100;
		// static int sInNum = 200; 생성 이후에 static변수 사용 가능
		
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
			
		}
	}
	
	public void usingInner() {
		inClass.inTest();
	}
	
	static class InStaticClass{ //static 클래스일 경우 static 메소드, 변수 생성 가능
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println(inNum);
			System.out.println(sInNum);
			System.out.println(sNum);
		}
		
		static void sTest() {
			System.out.println(sInNum);
			System.out.println(sNum);
		}
	}
}




public class InnerTest {

	public static void main(String[] args) {

		OutClass outClass = new OutClass();
		outClass.usingInner();
		
		OutClass.InClass myInClass = outClass.new InClass();
		myInClass.inTest();
		
		System.out.println();
		
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		
		OutClass.InStaticClass.sTest();
	}

}

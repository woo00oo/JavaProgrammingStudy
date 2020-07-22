package lambda;


@FunctionalInterface //함수형 인터페이스
public interface MyMaxNumber {
	
	int getMaxNumber(int x, int y);
	//함수형 인터페이스는 메소드를 2개이상 생성 할 수 없음
}

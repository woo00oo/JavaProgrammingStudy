package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
  스트림 : 자료의 대상과 관계없이 동일한 연산을 수행할 수  있는 기능.
    배열, 컬렉션에 동일한 연산이 수행되어 일관성 있는 처리 가능
  한번 생성하고 사용한 스트림은 재사용할 수 없음.
  스트림 연산은 기존 자료를 변경하지 않음
  중간 연산과 최종 연산으로 구분됨
  중간 연산 = > 조건으로 자료를 필터함(꺼내옴) filter(), map()
 최종 연산 = >중간 연산의 결과를 가지고 출력을함 ex)합, 평균을 구함
 최종 연산이 수행되어야 모든 연산이 적용되는 지연 연산 
 
  스트림의 자료를 소모 하면서 연산을 수행
  최종 연산 후에 스트림은 더 이상 다른 연산을 적용할 수 없음!!!!!!
 forEach() : 요소를 하나씩 꺼내옴
 count() : 요소의 개수
 sum() : 요소의 합
 
 */




public class ArrayListStreamTest {

	public static void main(String[] args) {

		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s->System.out.print(s + " "));
		System.out.println();
		
		sList.stream().sorted().forEach(s->System.out.print(s + " ")); //정렬
		// 스트림 생성           중간 연산     최종연산( 하나씩 가져오는 forEach)
		
		System.out.println();
		
		sList.stream().map(s ->s.length()).forEach(n -> System.out.println(n));
		
		
	}

}

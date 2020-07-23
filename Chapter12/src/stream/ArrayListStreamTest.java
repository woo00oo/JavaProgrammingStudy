package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
  ��Ʈ�� : �ڷ��� ���� ������� ������ ������ ������ ��  �ִ� ���.
    �迭, �÷��ǿ� ������ ������ ����Ǿ� �ϰ��� �ִ� ó�� ����
  �ѹ� �����ϰ� ����� ��Ʈ���� ������ �� ����.
  ��Ʈ�� ������ ���� �ڷḦ �������� ����
  �߰� ����� ���� �������� ���е�
  �߰� ���� = > �������� �ڷḦ ������(������) filter(), map()
 ���� ���� = >�߰� ������ ����� ������ ������� ex)��, ����� ����
 ���� ������ ����Ǿ�� ��� ������ ����Ǵ� ���� ���� 
 
  ��Ʈ���� �ڷḦ �Ҹ� �ϸ鼭 ������ ����
  ���� ���� �Ŀ� ��Ʈ���� �� �̻� �ٸ� ������ ������ �� ����!!!!!!
 forEach() : ��Ҹ� �ϳ��� ������
 count() : ����� ����
 sum() : ����� ��
 
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
		
		sList.stream().sorted().forEach(s->System.out.print(s + " ")); //����
		// ��Ʈ�� ����           �߰� ����     ��������( �ϳ��� �������� forEach)
		
		System.out.println();
		
		sList.stream().map(s ->s.length()).forEach(n -> System.out.println(n));
		
		
	}

}

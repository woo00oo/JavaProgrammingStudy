package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {

		
		//�ߺ� ���x , ������� x
		HashSet<String> set = new HashSet<String>();
		set.add("�̼���");
		set.add("������");
		set.add("������");
		set.add("�̼���");
		
		//HashSet ��ȯ 
		Iterator<String> ir = set.iterator();
		while(ir.hasNext()) {
			String str = ir.next();
			System.out.println(str);
		}
		
	}
	

}

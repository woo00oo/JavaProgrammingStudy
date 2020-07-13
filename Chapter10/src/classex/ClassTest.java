package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {

		Person person = new Person("James");
		System.out.println(person);
		
		
		Class c1 = Class.forName("classex.Person");
		Person person1 = (Person)c1.newInstance(); //����Ʈ ������ ȣ��
		System.out.println(person1);
		
		Class[] parameterTypes = {String.class};
		Constructor cons = c1.getConstructor(parameterTypes);
		
		Object[] initargs = {"������"};
		Person personLee = (Person)cons.newInstance(initargs);
		System.out.println(personLee);
		
		/*
		 forName() �޼���� ���� �ε�
		 
		 Class Ŭ���� static �޼���
		 
		 ���� �ε��̶�? ������ �ÿ� ������ Ÿ���� ��� ���ε� �Ǿ� �ڷ����� �ε� �Ǵ� ���� �ƴ϶� 
		 ���� �߿� ������ Ÿ���� �˰� ���ε� �Ǵ� ��
		 
		 ���� �ÿ� �ε��ǹǷ� ��쿡 ���� �ٸ� Ŭ������ ��� �� �� �־� ������
		 
		 ������ Ÿ�ӿ� üũ �� �� �����Ƿ� �ش� ���ڿ��� ���� Ŭ������ ���� ��� ���ܰ� �߻� �� �� ����.
		 
		 */
		
		
	}

}

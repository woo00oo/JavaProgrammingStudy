package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {

		Person person = new Person("James");
		System.out.println(person);
		
		
		Class c1 = Class.forName("classex.Person");
		Person person1 = (Person)c1.newInstance(); //디폴트 생성자 호출
		System.out.println(person1);
		
		Class[] parameterTypes = {String.class};
		Constructor cons = c1.getConstructor(parameterTypes);
		
		Object[] initargs = {"김유신"};
		Person personLee = (Person)cons.newInstance(initargs);
		System.out.println(personLee);
		
		/*
		 forName() 메서드와 동적 로딩
		 
		 Class 클래스 static 메서드
		 
		 동적 로딩이란? 컴파일 시에 데이터 타입이 모두 바인딩 되어 자료형이 로딩 되는 것이 아니라 
		 실행 중에 데이터 타입을 알고 바인딩 되는 것
		 
		 실행 시에 로딩되므로 경우에 따라 다른 클래스가 사용 될 수 있어 유용함
		 
		 컴파일 타임에 체크 할 수 없으므로 해당 문자열에 대한 클래스가 없는 경우 예외가 발생 할 수 있음.
		 
		 */
		
		
	}

}

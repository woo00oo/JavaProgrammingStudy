package stream;

import java.util.Arrays;

public class IntArrayTest {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		int sum = Arrays.stream(arr).sum(); //스트림은 한 번만 사용 가능
		int count = (int)Arrays.stream(arr).count();
		
		
		System.out.println(sum);
		System.out.println(count);
	}

}

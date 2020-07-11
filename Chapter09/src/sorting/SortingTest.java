package sorting;

import java.io.IOException;

public class SortingTest {

	public static void main(String[] args) throws IOException {

		System.out.println("정렬 방식을 선택하세요 : ");
		System.out.println("Q: QuickSort");
		System.out.println("H: HeaSort");
		System.out.println("B: BubbleSort");
		
		int Type = System.in.read();
		Sort sort = null;
		int arr[] = {1,2,3};
		
		if(Type == 'Q' || Type =='q') {
			sort = new QuickSort();
			sort.ascedning(arr);
			sort.descending(arr);
			sort.desription();
		}else if(Type == 'H' || Type =='h') {
			sort = new HeaSort();
			sort.ascedning(arr);
			sort.descending(arr);
			sort.desription();
		}else if(Type == 'B' || Type =='b') {
			sort = new BubbleSort();
			sort.ascedning(arr);
			sort.descending(arr);
			sort.desription();
		}else {
			System.out.println("유효하지 않은 정렬 방식입니다.");
		}
		
	}

}

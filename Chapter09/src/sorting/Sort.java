package sorting;

public interface Sort {

	void ascedning(int[] arr);
	void descending(int[] arr);
	
	default void desription() {
		System.out.println("���ڸ� �����ϴ� �˰��� �Դϴ�.");
	}
}

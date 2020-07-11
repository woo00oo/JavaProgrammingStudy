package sorting;

public class QuickSort implements Sort{

	@Override
	public void ascedning(int[] arr) {
		System.out.println("QuickSort ascedning");
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("QuickSort descending");		
	}
	
	@Override
	public void desription() {
		Sort.super.desription();
		System.out.println("QuickSort ¿‘¥œ¥Ÿ.");
	}

}

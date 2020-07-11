package sorting;

public class HeaSort implements Sort{

	@Override
	public void ascedning(int[] arr) {
		System.out.println("HeaSort ascedning");
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("HeaSort descending");		
	}
	
	@Override
	public void desription() {
		Sort.super.desription();
		System.out.println("HeaSort ¿‘¥œ¥Ÿ.");
	}

}

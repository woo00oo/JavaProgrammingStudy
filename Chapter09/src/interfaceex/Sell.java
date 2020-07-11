package interfaceex;

public interface Sell {

	void sell();
	
	default void order() {
		System.out.print("판매 주문");
	}
}

package thread;

class Bank{
	private int money = 10000;
	
	public synchronized void saveMoney(int save) {
		int m = this.getMoney();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setMoney(m + save);
	}
	
	public synchronized void minusMoney(int save) {
		int m = this.getMoney();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setMoney(m - save);
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}

class Park extends Thread{
	
	public void run() {
		System.out.println("start save");
		SyncTest.myBank.saveMoney(3000);
		System.out.println("save money :" + SyncTest.myBank.getMoney());
	}
}

class ParkWife extends Thread{
	
	public void run() {
		System.out.println("start minus");
		SyncTest.myBank.minusMoney(1000);
		System.out.println("minus money :" + SyncTest.myBank.getMoney());
	}
	
}

public class SyncTest {
	
	public static Bank myBank = new Bank();

	public static void main(String[] args) throws InterruptedException {

		Park p = new Park();
		p.start();
		
		Thread.sleep(200);
		
		ParkWife pw = new ParkWife();
		pw.start();
	}
	
	/* 자바에서 동기화 구현
	 * synchronized 수행문과 synchronized 메서드를 이용
	   synchronized수행문
	    synchronized(참조형 수식){
	    
	    }
	    참조형 수식에 해당되는 객체에 lock을  건다.
	    
	    synchronized메서드
	    현재 이 메서드가 속해 있는 객체에 lock을 건다
	    synchronized메서드 내에서 다른 synchronized메서드를 호출하지 않는다 (데드락 방지)
	 */

}

package coffee;

public class Person {

	
	String name;
	int money;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	


	public void buyStarCoffee(StarCoffee starCoffee, int money) {
		
		System.out.println(name + "���� "+ money +"���� " + starCoffee.brewing(money));
	
	}
	
	public void buyBeanCoffee(BeanCoffee beanCoffee, int money) {
			
			System.out.println(name + "���� "+ money +"���� " + beanCoffee.brewing(money));
		
	}
	
}

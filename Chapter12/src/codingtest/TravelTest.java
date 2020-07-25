package codingtest;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {

		
		TravleCustomer customerLee = new TravleCustomer("ÀÌ¼ø½Å", 40, 100);
		TravleCustomer customerKim = new TravleCustomer("±èÀ¯½Å", 20,100); 
		TravleCustomer customerHong = new TravleCustomer("È«±æµ¿", 13,50);
		
		List<TravleCustomer> customerList = new ArrayList<TravleCustomer>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		System.out.println(customerList);
		
		customerList.stream().map(c -> c.getName()).forEach(s->System.out.println(s));
		int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println(total);
		
		customerList.stream().filter(c ->c.getAge() >= 20).map(c -> c.getName()).sorted().forEach(s->System.out.println(s));
	}

}

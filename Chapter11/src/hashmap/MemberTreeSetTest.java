package hashmap;


public class MemberTreeSetTest {

	public static void main(String[] args) {

		
		MemberHashMap manager = new MemberHashMap();
		
		Member memberLee = new Member(300,"lee");
		Member memberKim = new Member(100,"Kim");
		Member memberPark = new Member(200,"Park");
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		
		manager.showAllMember();
		
	}
	

}

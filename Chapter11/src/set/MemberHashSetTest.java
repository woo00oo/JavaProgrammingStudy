package set;

public class MemberHashSetTest {

	public static void main(String[] args) {

		
		MemberHashSet manager = new MemberHashSet();
		
		Member memberLee = new Member(100,"lee");
		Member memberKim = new Member(200,"Kim");
		Member memberPark = new Member(300,"Park");
		Member memberPark2 = new Member(300,"Park2");
		//MemberŬ������ equals�޼ҵ�� hashCode �޼ҵ尡 �������̵� �Ǿ� �־����!
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		manager.addMember(memberPark2);
		
		manager.showAllMember();
	}

}

package treemap;

import hashmap.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {

		MemberTreeMap manager = new MemberTreeMap();
		
		Member memberLee = new Member(300,"lee");
		Member memberKim = new Member(100,"Kim");
		Member memberPark = new Member(200,"Park");
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		
		manager.showAllMember();
		
		manager.removeMember(200);
		manager.showAllMember();
		
	}

	/* Collection 인터페이스 
	 List = ArrayList, LinkedList
	 Set = HashSet, TreeSet => 이터레이터를 통한 순회

	 Map 인터페이스
	 HashMap , TreeMap
	 */
}

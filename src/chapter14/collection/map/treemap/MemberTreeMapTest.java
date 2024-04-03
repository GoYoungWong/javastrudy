package chapter14.collection.map.treemap;

/*import chapter14.collection.Member;*/
import chapter14.collection.Member2;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		
		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		// 객체생성
		Member2 memberSon = new Member2(1001, "손흥민");
		Member2 memberKim = new Member2(1002, "김민재");
		Member2 memberLee = new Member2(1003, "이강인");
		Member2 memberHwa = new Member2(1004, "활희찬");
		
		memberTreeMap.addMember(memberSon);
		memberTreeMap.addMember(memberKim);
		memberTreeMap.addMember(memberLee);
		memberTreeMap.addMember(memberHwa);
		
		memberTreeMap.showAllMember(); // 4개 member객체가 출력
		
		Member2 memberLee2 = new Member2(1003, "이강두");
		memberTreeMap.addMember(memberLee2);    // 이강인 추가
		
		// 이강인이 추가되었지만 equals()와 hashCode()를 추가하여 값을 비교해 4개만 나옴
		memberTreeMap.showAllMember(); // 4개 member객체가 출력
	}

}

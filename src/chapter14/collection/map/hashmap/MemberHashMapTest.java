package chapter14.collection.map.hashmap;

import chapter14.collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap memberHashMap = new MemberHashMap();
		
		// 객체생성
		Member memberSon = new Member(1001, "손흥민");
		Member memberKim = new Member(1002, "김민재");
		Member memberLee = new Member(1003, "이강인");
		Member memberHwa = new Member(1004, "활희찬");
		
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberHwa);
		
		memberHashMap.showAllMember(); // 4개 member객체가 출력
		
		Member memberLee2 = new Member(1003, "이강두");
		memberHashMap.addMember(memberLee2);    // 이강인 추가
		
		// 이강인이 추가되었지만 equals()와 hashCode()를 추가하여 값을 비교해 4개만 나옴
		memberHashMap.showAllMember(); // 4개 member객체가 출력
	}

}

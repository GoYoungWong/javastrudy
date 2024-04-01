package chapter14.collection.arraylist;

import chapter14.collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberSon = new Member(1001, "손흥민");
		Member memberKim = new Member(1002, "김민재");
		Member memberLee = new Member(1003, "이강인");
		Member memberHwa = new Member(1004, "활희찬");
		
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberHwa);
		
		memberArrayList.showAllMember(); // 4개 member객체가 출력
		
		memberArrayList.removeMember(memberHwa.getMemberid()); // 황희찬객체 제거
		
		memberArrayList.showAllMember(); // 3개 member객체가 출력
	}

}

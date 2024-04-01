package chapter14.collection.arraylist;

import java.util.ArrayList;

import chapter14.collection.Member;

//  ArrayList클래스의 데이터로 Member클래스 사용하기.
public class MemberArrayList {

	// 기억장소를 인덱스로 관리하는 특징(순서가 있다.), 데이터중복허용
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	
	// 데이터추가
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	// 데이터제거
	public boolean removeMember(int memberid) {
		
		// arrayList.size() : 컬렉션기억장소의 요소의 개수.
		for(int i=0; i <arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int tempid = member.getMemberid();
			if(tempid == memberid) {
				arrayList.remove(i); // 멤버를 삭제.
				return true;
			}
		}
		
		return false;
	}
		// 모든데이터보기
		public void showAllMember() {
			for(Member member : arrayList) {
				System.out.println(member);  // member.toString() 호출
			}
			System.out.println();
		}
	}


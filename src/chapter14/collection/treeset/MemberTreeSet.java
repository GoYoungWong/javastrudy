package chapter14.collection.treeset;

import chapter14.collection.Member2;
import java.util.TreeSet;
import java.util.Iterator;

public class MemberTreeSet {

	
	private TreeSet<Member2> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member2>();
	}
	
	
	// 데이터추가
	public void addMember(Member2 member) {
		
		// 아래 베서드 동작하면서, Member2 클래스의 compareTo()메서드가 호출됨.
		treeSet.add(member); // 객체의 주소값지정
	}
	
	// 데이터제거
	// Set은 기본 for문 작업이 되지 않음 Iterator작업을 해줘야함
	// Collection요소를 순회하는 Iterator작업
		public boolean removeMember(int memberid) {
			
			
			Iterator<Member2> ir = treeSet.iterator();
			// hasNext() : 현재 ir이 가지고 있는 데이터가 있으면 true 없으면 false
			// ir객체는 커서라는 포인터를 이용하여 데이터를 참조하는데
			// 처음에 가르키는 위치에 데이터가 존재하면 hasNext()가 true
			// 아니면 false를 반환한다.
			while(ir.hasNext()) {
				Member2 member = ir.next(); // 커서가 가리키는 위치에서 데이터를 읽어온다. 커서가 다음위치로 이동.
				int tempid = member.getMemberid();
				if(tempid == memberid) {
				treeSet.remove(member); // 멤버를 삭제.
				
				return true;
			}
		}
		
		return false;
}
		// 모든데이터 보기
		public void showAllMember() {
			for(Member2 member : treeSet) {
				System.out.println(member);  // member.toString() 호출
			}
			System.out.println();
		}
	}


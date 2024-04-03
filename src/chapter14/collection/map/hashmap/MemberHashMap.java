package chapter14.collection.map.hashmap;

import chapter14.collection.Member;
/*import chapter14.collection.Member2;*/
import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

	
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	
	// 데이터추가
	public void addMember(Member member) {
		hashMap.put(member.getMemberid(), member); // 객체의 주소값지정
	}
	
	// 데이터제거
	// Collection요소를 순회하는 Iterator작업
		public boolean removeMember(int memberid) {
			
			if(hashMap.containsKey(memberid)) {
				hashMap.remove(memberid);
				return true;
			}
		return false;
}
		// 모든데이터보기
		public void showAllMember() {
			
			Iterator<Integer> ir = hashMap.keySet().iterator();
			while(ir.hasNext()) {
				int Key = ir.next();
				// Key로 저장된 데이타가 Member
				Member member = hashMap.get(Key);
				System.out.println(member);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}


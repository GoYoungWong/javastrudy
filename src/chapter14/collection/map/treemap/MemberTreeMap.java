package chapter14.collection.map.treemap;

import chapter14.collection.Member2;

import java.util.TreeMap;
import java.util.Iterator;

// Map인터페이스를 상속받아 구현한 TreeMap클래스
// 자료구조를 이진형태로 분휴해서 정렬
// 대소비교를 통한 정렬구조로 관리하기때문에 반드시 데이타객체가(Member2) Comparable or Comparator 인터페이스를 구현해야 한다.
public class MemberTreeMap {

	
	private TreeMap<Integer, Member2> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member2>();
	}
	
	
	// 데이터추가
	public void addMember(Member2 member) {
		treeMap.put(member.getMemberid(), member); 
	}
	
	// 데이터제거
	// Collection요소를 순회하는 Iterator작업
		public boolean removeMember(int memberid) {
			
			if(treeMap.containsKey(memberid)) {
				treeMap.remove(memberid);
				return true;
			}
		return false;
}
		// 모든데이터보기
		public void showAllMember() {
			
			Iterator<Integer> ir = treeMap.keySet().iterator();
			while(ir.hasNext()) {
				int Key = ir.next();
				// Key로 저장된 데이타가 Member2
				Member2 member = treeMap.get(Key);
				System.out.println(member);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}


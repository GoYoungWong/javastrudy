package chapter14.collection.hashset;

import java.util.HashSet;

// Set 인터페이스를 구현한 클래스
// 순서가 없는 집합. 데이터중복금지
public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("손흥민"));
		hashSet.add(new String("김민재"));
		hashSet.add(new String("황희찬"));
		hashSet.add(new String("이강인"));
		hashSet.add(new String("김민재"));
		
		System.out.println(hashSet); // "김민재" 중복데이터 확인.
		
		
	}

}

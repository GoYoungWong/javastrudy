package chapter14.collection.treeset;

import java.util.TreeSet;

// Set인터페이스를 구현한 TreeSet클래스 예제.
// 자료구조특징? 이진 탐색 트리라는 자료 구조 형태로 데이터를 저장하는 컬렉션 클래스이다.
// 이진 탐색 트리는 정렬, 검색, 범위 검색(range search)에 높은 성능을 보이는 자료 구조.
// HashSet클래스와 다른점.
public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		
		// 아래 데이터추가시 대소비교하여 이진분류로 좌,우측으로 정렬배치하면서 데이터를 저장한다.
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");

		// 데이터가 정렬된 상태로 출력되는것을 확인할 수가 있다. 강감찬 이순신 홍길동
		for(String str : treeSet) {
			System.out.println(str);
		}
		
		TreeSet<Integer> treeSet2 = new TreeSet<Integer>();
		
		treeSet2.add(4);
		treeSet2.add(1);
		treeSet2.add(7);
		
		for(Integer num : treeSet2) {
			System.out.println(num);
		}
	}

}

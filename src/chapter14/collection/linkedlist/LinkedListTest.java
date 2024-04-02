package chapter14.collection.linkedlist;

import java.util.LinkedList;

// 자료구조 : 링크드 리스트 예제.
// 데이터들이 다음데이터의 주소를 가지고 있는 구조로 관리되고 있다.
public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("A"); // 0
		myList.add("B"); // 1
		myList.add("C"); // 2
		
		System.out.println(myList); // [A, B, C]
		myList.add(1, "D"); 

		System.out.println(myList); // [A, D, B, C]
		
		myList.addFirst("O");
		System.out.println(myList); // [O, A, D, B, C]
		System.out.println(myList.removeLast()); // C
		
		System.out.println(myList); // [O, A, D, B]
		
	}

}

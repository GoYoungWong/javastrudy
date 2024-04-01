package chapter14.collection.arraylist;

import java.util.ArrayList;

// 컬렉션
// List인터페이스
// 특징? 데이터가 순서유지. 데이터중복허용
public class ArrayListBasic {
	
	public static void main(String[] args) {
		
		// <>제네릭 부분에 뭘 넣냐에 따라 메서드가 그에 맞게 나옴
		// 예> al. 했을때 add(String e)이렇게 나옴
		ArrayList<String> al = new ArrayList<String>();
	
		al.add("손흥민"); // [0]
		al.add("김민재"); // [1]
		al.add("이강인"); // [2]
		al.add("황희찬"); // [3]
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		
		al2.add(10); // [0]
		al2.add(20); // [1]
		al2.add(30); // [2]
		al2.add(40); // [3]
		al2.add(50); // [4]
		
		// 데이터 출력
		System.out.println(al.get(2)); // 이강인
		
		System.out.println(al2.get(3)); // 40
	}
}

package chapter7.array;

public class Bookarray1 {

	public static void main(String[] args) {
		
		// 스택영역(주소) -> 힙영역(데이타)
		// 메모리구조 표현
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		
		// 클래스배열(객체배열)
		// 스택영역(주소) -> 힙영역(주소) -> 힙영역(데이타)
		// 메모리구조 표현
		Book[] bookArray = new Book[3]; // 힙영역에서 실제데이타가 생성되는 주소를 참조하는 기억장소.
		bookArray[0] = new Book(); // 실제데이타가 관리되는 힙영역의 기억장소 생성작업.
		bookArray[1] = new Book();
		bookArray[2] = new Book();
	}

}

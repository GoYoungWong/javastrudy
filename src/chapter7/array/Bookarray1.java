package chapter7.array;

public class Bookarray1 {

	public static void main(String[] args) {
		
		// 스택영역(주소) -> 힙영역(데이타)
		// 메모리구조 표현
		// 기억장소를 1번참조
		// new Book(); 힙영역에 실제데이터를 저장하기위한 기어갖ㅇ소가 생성(객체생성)
		Book b1 = new Book("인공지능", "홍길동");
		Book b2 = new Book("머신러닝", "손흥민");
		Book b3 = new Book("딥러닝", "김민재");
		
		System.out.println(b1.getBookName() + "/" + b1.getauthor());
		System.out.println(b2.getBookName() + "/" + b2.getauthor());
		System.out.println(b3.getBookName() + "/" + b3.getauthor());
		
		System.out.println("================================================");
		// 클래스배열(객체배열)
		// 스택영역(주소) -> 힙영역(주소) -> 힙영역(데이타)
		// 메모리구조 표현
		// 기억장소를 2중참조
		Book[] bookArray = new Book[3]; // 힙영역에서 실제데이타가 생성되는 주소를 참조하는 기억장소.
		bookArray[0] = new Book("인공지능", "홍길동"); // 실제데이타가 관리되는 힙영역의 기억장소 생성작업.
		bookArray[1] = new Book("머신러닝", "손흥민");
		bookArray[2] = new Book("딥러닝", "김민재");
		
		System.out.println(bookArray[0].getBookName() + "/" + bookArray[0].getauthor());
		System.out.println(bookArray[1].getBookName() + "/" + bookArray[1].getauthor());
		System.out.println(bookArray[2].getBookName() + "/" + bookArray[2].getauthor());
	
		System.out.println("================================================");
		
		for(int i=0; i<bookArray.length; i++) {
			System.out.println(bookArray[i].getBookName() + "/" + bookArray[i].getauthor());
		}
	
	
	
	}

}

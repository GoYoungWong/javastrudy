package chapter7.otherarray;

import chapter7.array.Book;

public class BookTest {

	public static void main(String[] args) {
		
		// 생성자의 접근자 이해떄문에 작성.
		// default 는 동일패키지 접근, 다른패키지 접근불가
		// public 는 패키지상관없이 모두 접근
		Book b1 = new Book();
	}

}

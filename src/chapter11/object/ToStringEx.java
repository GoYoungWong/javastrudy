package chapter11.object;

class Book /*extends Object*/{
	
	// 필드
	int bookNumber;
	String bookTitle;
	
	// 매개변수가 있는 생성자
	public Book(int bookNumber, String bookTitle) {
		super(); // 부모클래스의 기본생성자호출
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	// Object ToString
	// 재정의 : 필드의 정보를 확인하는 목적
	// 사용 할때 : 위에 Source -> ToString  또는 Overriding/implement Method 를 눌러 사용
	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookTitle=" + bookTitle + "]";
	}

}

public class ToStringEx {

	public static void main(String[] args) {
		
		Book book1 = new Book(200, "개미");
		
		// toString()메서드를 재정의 안하면, Object 클래스의 toString()메서드는
		// 다음과 같이 출력된다.  chapter11.object.Book@75a1cd57 = 주소값
		// 재정의 한 경우에는 Book [bookNumber=200, bookTitle=개미] 출력된다.
		System.out.println(book1); // System.out.println(book1.toString());
	}

}

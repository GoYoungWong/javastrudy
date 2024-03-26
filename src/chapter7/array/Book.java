package chapter7.array;

// 생성자를 하나도 만들지 않으면, 컴파일 과정에서 자동생성.
// 클래스배열(객체배열)을 만들기위한 클래스
public class Book {
	
	//필드
	private String bookName; // 책 제목
	private String author; // 저자  
	
	// 기본생성자 형태. 생성자는 리턴타입을 사용하지 않는다.
	public Book() {}

	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	// getter/setter 메서드 작성
	public String getBookName() {
		return bookName;
	}
	public void setBookNmae(String bookName) {
		this.bookName = bookName;
	}
	
	public String getauthor() {
		return author;
	}
	
	public void setauthor(String author) {
		this.author = author;
	}
	
	// 일반메서드
	public void showBookInfo() {
		System.out.println(bookName + "," + author);
	}
}
package chapter15.exception;

class Person {
	
	int a;
}


public class NullException {
	
	public static void main(String[] args) {
		
		Person ps = null;
		
		
//		ps = new Person();  // 이 구문이 실행이 되어야 힙 영역에 int a에 대한 기억장소가 생성된다.
		
		System.out.println(ps.a); // 힙영역에 기억장소가 존재하지않아, 없는 기억장소를 접근하고 있어 싫행시 오류발생.
	}
}

package chapter5.shopmall;

public class MemberTest {

	public static void main(String[] args) {
		
		// 클래스 사용법
		// 객체생성
		// 클래스로 만든 변수를 다른 변수들이랑 구분하기위하여 객체 라고 부른다.
		// Member() : 클래스 이름으로 되어있는 메서드를 생성자 라고 부른다.
		// new : 힙영역에 클래스를 이용하여 메모리를 생성하는 기능
//		Member mem = new Member();
		Member mem = null; // 클래스로 만든 객체는 스택(Stack)영역에 공간(기억장소)이 생성됨.
		mem = new Member(); 
	}

}

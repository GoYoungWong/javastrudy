package chapter15.innerclass;

// 내부클래스 : 클래스안에 클래스를 정의.
// 내부클래스는 다른 클래스에서 사용하지 않을 때.
// 자바기반의 안드로이드 개발, GUI 응용프로그램 개발시 주로 사용.

// 외부클래스
class A {
	int a = 100;
	void methodA() {
		System.out.println(a);
	}
	// 내부클래스
	class B {
		int x = 100;
		void methodB( ) {
			System.out.println(x);
		
			// A클래스의 멤버를 직접접근 가능.
			System.out.println(a);
			methodA();
			
		}
	}
}	



public class InnerEx {

	public static void main(String[] args) {
		

	}

}

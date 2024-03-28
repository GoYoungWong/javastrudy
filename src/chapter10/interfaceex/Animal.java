package chapter10.interfaceex;
// 면접볼때 인터페이스물어볼수있음
// 인터페이스
// 추상메서드 목적으로 존재하는 것.
// 추상메서드 : 구현클래스에게 강제적으로 추상메서드를 구현하게 만든다. 즉 기능에 해당하는 메서드작업을 강제적으로 하게만든다.
// 객체생성 불가능.(new 생성자())
// 상속을 목적으로 한다.
public interface Animal {
	
	//필드 사용불가능
//	String eyeColor;
//	String speed;
	
	// 메서드 사용불가능
//	void methodA() {} 
	
	// 인터페이스 구성요소
	// 추상메서드, 
	// 상수,
	// 디폴트메서드(JDK 1.8), 정적메서드(JDK 1.8) : 일반메서드와 거의 동일
	
	
	
	
				// 상속목적이기 때문에 private 사용불가
	void run(); // public abstract void run();
	
	void cry(); // public abstract void cry();
	
}

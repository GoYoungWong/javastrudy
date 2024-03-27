package chapter10.interfaceex;
// 면접볼때 인터페이스물어볼수있음
// 인터페이스
// 추상메서드 목적으로 존재하는 것.
// 객체생성 불가능.
// 상속을 목적으로 한다.
public interface Animal {
	
	//필드 사용불가능
//	String eyeColor;
//	String speed;
	
	// 메서드 사용불가능
//	void methodA() {} 
	
	
	void run(); // public abstract void run();
	
	void cry(); // public abstract void cry();
	
}

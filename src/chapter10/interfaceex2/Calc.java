package chapter10.interfaceex2;

// 최상위 부모인터페이스 -> 상속목적으로 설계. 객체생성 불가능
public interface Calc {
	
	// 구성요소
	// 상수, 추상메서드, default메서드, static메서드 - jdk 1.8
	// private 메서드 - jdk 1.9
	
	// 상수. final.  compile(컴파일)하면 public final static 자동으로 붙는다.
	double PI = 3.14; // 상수는 어떤 특정값을 부르기위한 이름. 값의 변경 불가
	int ERROR = -999999999;  // 변수이름은 대문자. 관례임
	
	// 추상메서드   compile(컴파일)하면 public abstract 자동으로 붙는다.
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	// 일반메서드 사용불가
	/*
	public void methodA() {
		
	}
	*/
	
	// jdk1.8부터 default, static 메서드가 지원
	default void description() {
		myMethod();
	}
	
	static void myStaticMethod() {
		
	}
	
	// jdk1.9 private 메서드 지원  private 접근자는 접근불가.
	private void myMethod() {
		System.out.println("private 메서드입니다.");
	}
}

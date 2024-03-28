package chapter10.interfaceinheritance;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass mClass = new MyClass();
		
		// 다형성때문에 직접 해당객체로 x()를 호출하지 않는다.
//		mClass.x();

		// 다형성
		// 할아버지 인터페이스와 나(손자) 자신의 클래스객체
		// 자동으로 형변환
		X xClass = mClass;
		xClass.x(); // 구현된 메서드 호출
		
		// 부모인터페이스와 나(아들) 자신의 클래스객체
		MyInterface iClass = mClass;
		iClass.myMethod();
		iClass.x();
		iClass.y();

	}

}

package chapter6.singleton;

// 싱글톤 패션디자인으로 설계하라.
public class Person {

	// 1)클래스안에서 자신을 private static 멤버로 객체생성.
	private static Person instance = new Person();
	
	// 2)생성자를 디폴트생성자를 생성되지 않게하고, private 접근자를 사용하라.
	private Person() {}
	
	// 3)public getter 메서드 정의 instance 가 private 이므로 클래스 외부에서 접근이 막아져있으므로 getter 메서드 사용.
	public static Person getInstance() {
		if(instance == null) {
			instance = new Person();
		}
		return instance;
	}
}

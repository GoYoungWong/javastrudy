package chapter6.singleton;

// 디자인 패턴중 싱글톤 패턴으로 구성하는 클래스이다.
// 싱글톤 페턴 디자인 : 단 하나의 객체만 생성을 하고자 하는 목적.
// https://refactoring.guru/ko/design-patterns/java
public class Company {

	// 1)클래스안에서 자신을 private static 멤버로 객체생성.
	private static Company instance = new Company();

	// 2)생성자를 디폴트생성자를 생성되지 않게하고, private 접근자를 사용하라.
	private Company() {}
	
	// 3)public getter 메서드 정의 : instance가 private 이므로 클래스 외부에서 접근이 막아져있으므로 getter메서드 사용.
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}

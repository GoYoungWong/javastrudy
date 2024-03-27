package chapter9.abstractex;

// 추상클래스는 abstract 키워드를 사용해야 한다.
// 실무에서는 추상클래스가 대부분이다.
// 특징? 
// 1)객체생성불가능(new 생성자()), 2)상속을 목적, 3)상속을 받는 자식클래스는 상제적 구현해야한다.
// 몸체가 없는 메서드(추상메서드) : 메서드의 기능을 정의 할 필요가 없다고 결정했을때
// 그 떄 추상클래스로 구성하라.
public abstract class Animal {
	
	// 필드
	String eyeColor;
	String speed;
	// 메서드
	
	void methodA() {}
	
	// 추상메서드 : 메서드명()만 만들고 상속받는 클래스가 알아서 내용을 써서 만들어 라는 거임
	// 추상메서드 : 몸체(body)없는 메서드
	abstract void run();
	
	abstract void cry();
}

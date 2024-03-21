package chapter5.constructor;

// 생성자 예제(Constructor)
public class Person {
	
	//필드
	String name;
	float height;
	float weight;
	
	//생성자 
	// 컴파일과정에서 Person.class파일에 기본생성자가 자동생성된다.
	// 생성된 class파일을 호출해 코드가 실행됨
	// 원본 코드를 참조하는게 아님

	// 생성자 메서드이름을 만들때는 클래스이름을 사용해야 한다.(규칙)
	// 생성자를 수동으로 정의하면, 컴파일과정에서 Person.class파일에 기본생성자가 자동으로 생성되지 안된다.
	
	/*
	public Person() {
		//코드작성.
		System.out.println("생성자 호출");
	}
*/
	
	// 매개변수가 있는 생성자를 정의하면, 컴파일과정에서 Person.class파일에 기본생성자가 자동으로 생성되지 안된다.
	// Heep영역에 생성된 기억장소에 값을 주고자 할때 사용.
	public Person(String n) {
		name = n;
	}
	public Person(float f) {
		height = f;
	}
		
}

package chapter5.constructor;

public class PersonTest {

	public static void main(String[] args) {
		
//		Person p1 = new Person(); // 생성자
		
		// 매개변수가 있는 생산자가 있기떄문에 이거 만들어야함
		Person p1 = new Person("홍길동");
		
		p1.height = 50.0f;
		
		// Heep영역에 생성된 person클래스의 필드값을 확인
		System.out.println(p1.name);   // null
		System.out.println(p1.height); // 0.0
		System.out.println(p1.weight); // 0.0
		
		// new에서 앞에 person을 참조해서 필드에 값을 가지고 Heep에 기억장소를 만든는데 값이없으면 기본값을 준다.
		
		Person p2 = new Person(50.0f);
		System.out.println(p2.height);
	}

}

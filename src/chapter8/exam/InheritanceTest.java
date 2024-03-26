package chapter8.exam;

public class InheritanceTest {

	public static void main(String[] args) {
		
		// 상속을 받은 클래스가 객체생성이 실행이 되면
		// 힙영역에 new Parent(), new Child()순서로 진행.
		// 힙영역에 부모클래스의 기억장소가 생성되고, 부모생성자 호출
		// 힙영역에 자식클래스의 기억장소가 생성되고, 자식생성자 호출
		Child child = new Child();
		
		Child child2 = new Child(10,20);
		
		Parent Parent = new Parent(); // Child클래스와 상관이 없다.
	
	}

}

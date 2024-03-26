package chapter8.casting;

public class Triangle extends Shape{

	// 부모클래스의 draw메서드를 재정의.
	@Override
	void draw() {
		System.out.println("draw Triangle");
	}
	
	void Triangle() {
		System.out.println("삼각형 입니다.");
	}
}

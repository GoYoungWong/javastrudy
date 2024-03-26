package chapter8.casting;

public class Rectangle  extends Shape{

	// 부모클래스의 draw메서드를 재정의.
	@Override
	void draw() {
		System.out.println("draw Rectangle");
	}
	
	void Rectangle() {
		System.out.println("직사각형 입니다.");
	}
}

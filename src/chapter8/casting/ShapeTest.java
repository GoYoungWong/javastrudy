package chapter8.casting;

// 형변환(Casting)
// 참조타입 : 클래스가 상속관계에 따른 형변환.
public class ShapeTest {

	public static void main(String[] args) {
		
		// 부모클래스 변수 = 자식객체;
		// 업캐스팅: 자식객체로 부모클래스로 형변환  묵시적형변환
		// Shape shape1 = (Shape)new Circle();
		Shape shape1 = new Circle();
		// deaw()메서드가 부모, 자식클래스에 같이 존재하면, 부모클래스변수는 자식의 deaw()메서드를 호출하도록 설계되어있다. draw Circle
		// 그리고, 부모클래스 변수는 자신의 구성요소만 호출이 되도록 설계되어 있다.
		shape1.draw(); 
		// shape1.method1(); 에러
		
		Shape shape2 = new Rectangle();
		shape2.draw();
		
		Shape shape3 = new Triangle();
		shape3.draw();
		
		// shape1 가 Circle 클래스로 생성된 객체인지 여부
		if(shape1 instanceof Circle) {
			
			// 다운캐스팅.  명시적형변환
			// 자식클래스 변수 = (자식클래스) 부모객체.
			// 자식클래스의 구성요소를 호출하도록 설계되어 있다.
			Circle c1 = (Circle) shape1; 
			c1.method1();
		}
		// Shape shape2 = new Rectangle();
//		Circle c2 = (Circle) shape2;
		Rectangle r1 = (Rectangle)shape2;
	}

}

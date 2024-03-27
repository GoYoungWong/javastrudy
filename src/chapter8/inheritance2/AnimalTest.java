package chapter8.inheritance2;

public class AnimalTest {

	public static void main(String[] args) {
		
		// Animal클래스를 이용하여 객체를 생성.
		// 자식 클래스와는 전혀 상관이없다.
		Animal ani = new Animal();
		ani.cry(); // 동물이 소리짖다.
		ani.run(); // 동물이 달린다.
		System.out.println("===================================================");	
		// 자식클래스 Cat으로 객체를 생성하면 
		// new메모리연산자가 부모클래스 Animal을 이용하여, 힙영역에 메모리생성
		// 돌아와서 자식클래스 Cat을 이용하여, 힙영역에 메모리생성
		// 이 와중에서 생성자는 부모생성자 호출 -> 자식생성자 호출로 이루어진다.(설계)
		Cat cat = new Cat();
		// 재정의된 cry(),run()메서드는 자신의 것으로 호출된다.
		cat.cry(); // 고양이가 야옹야옹한다.
		cat.run(); // 고양이가 달린다.
		
		cat.method1(); // 내부코드가 super.run() 갖고있으므로 부모 메서드를 호출
	
		Animal animal = new Cat();
		animal.cry(); // Cat클래스의 재정의된 cry()호출
		animal.run(); // Cat클래스의 재정의된 run()호출
		
		// animal.method1();  호출이 불가능하므로 호출하고자 할 경우에는
		
		if( animal instanceof Cat) {
		Cat c1 = (Cat) animal;
		c1.method1(); // 호출이 가능
	  }
	System.out.println("===================================================");	
		Lion lion = new Lion();
		lion.cry(); // 사자가 달린다.
		lion.run(); // 사자가 울부짖는다.
		lion.play(); // 사자가 운동을 한다.
		
		Animal animal2 = new Lion();
		animal2.cry(); // Lion 클래스의 재정의된 cry()호출
		animal2.run(); // Lion 클래스의 재정의된 run()호출
		
		if( animal2 instanceof Lion) {
		Lion lion2 = (Lion) animal2;
		lion2.play();
	}
		
		
   }

}

package chapter8.inheritance2;

public class Dog extends Animal{

	@Override
	void run() {
		System.out.println("강아지가 달린다.");
	}
	
	void method2() {
		super.cry();
	}

	@Override
	void cry() {
		System.out.println("강아지가 멍망뭉한다.");
	}

	
}

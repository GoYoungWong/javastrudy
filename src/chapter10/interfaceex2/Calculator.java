package chapter10.interfaceex2;

// 추상메서드를 일부만 사용하고 싶으면 abstract를 집어 넣어 추상클래스로 만든다.
// 츠상클래스 -> 상속목적으로 설계. 객체생성 불가능
public abstract class Calculator implements Calc{
	
	// 구현되지 않은 추상메서드를 2개상속받은 상태

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}
	
	// 새로 추가작업 가능.

	
}

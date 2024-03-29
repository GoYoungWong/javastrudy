package chapter14.generics;

public class Power {

	public void doPrinting() {
		System.out.println("Power 재료로 출력합나다.");
	}
	
	@Override
	public String toString() {
		return "재료는 Power입니다.";
	}
}

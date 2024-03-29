package chapter14.generics;

public class Plastic {

	public void doPrinting() {
		System.out.println("Plastic 재료로 출력합나다.");
	}
	
	@Override
	public String toString() {
		return "재료는 Plastic입니다.";
	}
	
}

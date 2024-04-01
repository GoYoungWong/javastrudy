package chapter14.generics2;

public class Plastic extends Material{

	public void doPrinting() {
		System.out.println("Plastic 재료로 출력합나다.");
	}
	
	@Override
	public String toString() {
		return "재료는 Plastic입니다.";
	}

	@Override
	public void doPinting() {
		// TODO Auto-generated method stub
		
	}
	
}

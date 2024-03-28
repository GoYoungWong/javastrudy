package chapter10.interfaceex2;

// 구현클래스 -> 객체생성
// 부모가 상속받은 메서드에 자기 메서드까지 질머지고 있다.
public class CompleteeCalc extends Calculator{

	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 / num2;
	}
	
	// 디폴트 재정의
	@Override
	public void description() {
		System.out.println("difault 메서드 입니다.");
	}

}

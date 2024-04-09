package chapter15.exception2;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		AutoCloseObj obj = new AutoCloseObj();
		
		try(AutoCloseObj obj2 = obj) {
			// 예외발생
			throw new Exception();  // 이 구문이 예외를 발생시키는 기능을 하게된다. 그리고 obj.close()메서드가 호출되어 힙영역의 주소를 더 이상 받지않는다.
		}catch (Exception ex) {
			System.out.println("예외 발생이 되었습니다.");
		}

	}

}

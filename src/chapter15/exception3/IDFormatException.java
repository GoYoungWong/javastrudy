package chapter15.exception3;

// JDK에서 제공하는 예외관련 클래스들은 프로그래밍적인 관련예외 특징을 가지고 있다.
// 사용자 정의 예외. - 기업체 업무적인 기능을 구현하면서 동작 할때 발생되는 특징을 처리하기위한 목적
// 사용자 정의 예외 - 사용할려면 extends Exception 상속받아야 한다.
public class IDFormatException extends Exception{

	// 메게변수가 있는 생성자. 예외관련 메세지를 출력
	public IDFormatException(String message) {
		super(message);
	}
}

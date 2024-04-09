package chapter15.exception2;


// AutoClosedle 인터페이스 학습
/* AutoCloseble은 try에 선언된 객체가 AutoCloseble을 구현했더라면 java는 try구문이 종료될때
  객체의 close() 메소드를 호출해 준다.
 */
public class AutoCloseObj implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("리소그 close()되었습니다.");
		
		
		}
}


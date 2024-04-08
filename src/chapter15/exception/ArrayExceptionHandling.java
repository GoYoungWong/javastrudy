package chapter15.exception;

/*
 예외(Exception) : 프로그램이 실행도중 오류에 의하여 강제적인 종료가 발생되는 상황.
 예외처리 - 강제적인 종료를 막고, 프로그램이 나머지 코드를 정상적으로 실행하여, 종료가 되게 하는 기능.
 
 예외처리를 위한 클래스를 JDK 에서 제공하고 있다.
 */


public class ArrayExceptionHandling {

	public static void main(String[] args) {
		
		int[] arr = new int[5]; // int형 기억작소 5개를 연속적으로 생성하는 배열. arr[0] ~ arr[4]
		
//		arr[5] = 10; // 6번째 기억장소를 가리킨다. 실제 6번째 기억장소는 존재하지 않는다.
	
	// 예외처리 문법	
	try {
		// 예외 발생되는 코드	
		for(int i=0; i <= 5; i++) {
			System.out.println(arr[i]); // arr[5] 기억장소가 존재안하므로 예외가 발생. 오류데이터
		}
	}catch(Exception ex) { // ArrayIndexOutOfBoundsException
		// 예외가 발생되면 동작
		System.out.println(ex);
		System.out.println("예외발생");
	}
	 System.out.println("프로그램 종료");

	}
}

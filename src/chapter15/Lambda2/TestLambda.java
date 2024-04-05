package chapter15.Lambda2;

// 원본 .java파일에는 인터페이스, 클래스 함께 코드가 작성되어있지만,
// 컴파일되면 인터페이스 내용은 PrintString.class 파일로 생성된다.
// TestLambda 클래스는 TestLambda.class 파일로 생성된다.

// PrintString.class
@FunctionalInterface
interface PrintString {
	
	// 추상메서드
	void showString(String str);
}


// TestLambda.class
public class TestLambda {

	public static void main(String[] args) {
		
		// 인터페이스명 변수 = 추상메서드를 구현한 람다식문법;
		PrintString lambdaStr = s -> System.out.println(s); // 매개변수가 1개일 때는 괄호 생략가능.  
		
		// showString()메서드 호출하면, 위에 람다식이 실행된다.
		lambdaStr.showString("hello lambda 1");
		
		showMyString(lambdaStr);
		
		PrintString reStr = returnString();  // (str) -> System.out.println(str + "world");
		reStr.showString("hello ");
	}
	
	// 함수형인터페이스를 메서드의 매개변수로 사용하기
	public static void showMyString(PrintString p) {
		p.showString("hello lambda 2");  // s -> System.out.println(s); 실행된다.
	}
	
	// 함수형인터페이스를 메서드의 리턴타입으로 사용하기.
	public static PrintString returnString() {
		
		// void showString(String str);메서드에 대한 람다식문법을 리턴으로 코드작성
		return (str) -> System.out.println(str + "world");
	}
	

}

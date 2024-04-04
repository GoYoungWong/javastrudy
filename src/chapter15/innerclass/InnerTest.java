package chapter15.innerclass;

// 외부클래스
class OutClass {
	
	// 인스턴스 필드
	private int num = 10;
	
	// 스태틱 필드
	private static int sNum = 20;  // 정적(Static) 멤버 객체생성 전(객체생성과 상관없이) 기억장소가 자동생성 공유목적
	
	// 내부클래스를 필드로선언해서 사용가능 내부클래스랑 다름
	private InClass inClass;
	
	// 생성자 내부클래스랑 다름
	public OutClass() {
		inClass = new InClass(); // 내부클래스 객체생성
	}
	
	// 인스턴스 내부클래스1 : 외부클래스(OutClass)의 멤버들을 직접접근이 가능하다.
	class InClass {   // 인스턴스클래스 static이 없는 클래스
		
		int inNum = 100;
		
		void InTest() {
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum= " + sNum + "(외부 클래스의 스태틱 변수)");
		}
	}
	
	// 일반메서드 내부클래스랑 다름
    public void usingClass() {
    	inClass.InTest();
    }
	// 스태틱 내부클래스2
    static class InstaticClass {
    	
    	int inNum = 100;
    	static int sInNum = 200;
    	
    	void inTest() {
//    		num += 10; // 외부클래스의 인스턴스 변수는 사용할수 없음
    		// 메모리가 생성되어야 접근이 가능하다.
    		// static 은 처음 시작할때 1번만 기억장소를 먼저 만들기 떄문에 가능
    		System.out.println("InstaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수사용");
    		System.out.println("InstaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수사용");
    		System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수사용)");
    	
    	}
    	
    	static void sTest() {
    		// 외부클래스의 인스턴스 멤버는 사용불가능
//    		num += 10;
    		// 내부클래스의 인스턴스 멤버는 사용불가능
//    		inNum += 10;
    		
    		System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수사용");
    		System.out.println("InstaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수사용)" );
    	}
    }
}

public class InnerTest {

	public static void main(String[] args) {
		
		// 인스턴스 내부클래스 객체생성하는 다양한 방법.
		
		// 방법1.외부클래스 객체생성하면서 OutClass() 생성자가 호출되어, 그 안에서 내부클래스 객체가 생성
		OutClass outClass = new OutClass();  
		System.out.println("외부 클래스 이용하여 내부클래스 기능 호출");
		outClass.usingClass();
		
		System.out.println();
		
		// 방법2.외부클래스를 이용하여 내부클래스 객체생성
		OutClass.InClass inClass = outClass.new InClass(); 
		System.out.println("외부 클래스 변수를 이용하여 내부 클래스 생성");
		inClass.InTest();
		System.out.println();
		
		// 스태틱 내부클래스 사용하는 방법
		// 외부 클래스 객체생성하지 않고 바로 정적내부클래스 생성.
		OutClass.InstaticClass sInClass = new OutClass.InstaticClass();
		System.out.println("정적 내부 클래스 일반메서드 호출");
		sInClass.inTest();
		System.out.println();
		
		// 클래스명.스태틱멤버 접근   객체명.인스턴스멤버 접근
		System.out.println("정적 내부 클래스의 스태틱 메서드 호출");
		OutClass.InstaticClass.sTest();
	}

}

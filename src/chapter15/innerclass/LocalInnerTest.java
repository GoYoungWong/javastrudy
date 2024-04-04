package chapter15.innerclass;

// 지역내부클래스
class Outer {
	
	// 전역변수 : 전역변수는 어디서나 호출 가능
	int outNum = 100;
	static int sNum = 200;
	
	//메서드
	// 메서드내부에 클래스를 정의
	Runnable getRunnable(int i) {
		
		int num = 100; // 지역변수 : 지역변수는 Method 안에 서식한다.
		
		// 스레드- 나중에 설명함
		class MyRunnable implements Runnable {
			
			int localNum = 10;

			@Override
			public void run() {
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				
				System.out.println("OutNum = " + outNum + "(외부 클래스 인스턴스 변수");
				System.out.println("Outer.sNum = " + Outer.sNum + "(외부 클래스 정적 변수)");
				
			}
		}	
		
		return new MyRunnable();
	}
	
	void methodA() {
		
		// 지역내부 클래스
		class A {}
		
		// 객체생성
		A a = new A();
	}
}












public class LocalInnerTest {

	public static void main(String[] args) {
		// 

	}

}

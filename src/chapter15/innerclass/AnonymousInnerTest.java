package chapter15.innerclass;

//"익명"내부 클래스 - 일회성 특징으로 사용하는 클래스.

class Outer2 {
	     
	// 익명구현객체: 클래스명없이 객체를 생성하는 형태. 그리고 일회성목적으로 작업. // Anonymous Inner type
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			
			
		}
	};
	
	// 클래스
	/*
	class Runnable {
		public void run() {
			
		}
	}
	
	
	Runnable r = new Runnable();
	*/
}


public class AnonymousInnerTest {

	public static void main(String[] args) {
		
		
	}

}

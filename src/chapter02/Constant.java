package chapter02;

public class Constant {

	public static void main(String[] args) {
		// 상수와리터럴 
		
		// 상수선언 키워드 : final
        //final 데이타타입
		// 상수이름은 대문자로 정의한다. 규칙이 아니라 관례.
		// 상수이름으로 값을 변경 불가능.
		final int MAX_NUM = 100; // final키워드를 제외하면 변수라고 부른다.
	
//		MAX_NUM = 200; 상수는 값을 변경하면, 에러발생
		
		final int MIN_NUM;
		MIN_NUM = 0;
		
		int n =10;
		double dunm = n;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		System.out.println(dunm);
	}

}
